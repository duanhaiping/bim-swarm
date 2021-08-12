package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EquMaintenanceTaskPlanParam;
import com.cormen.bim.mapper.EmsEquMaintenanceTaskMapper;
import com.cormen.bim.mapper.EmsEquMaintenanceTaskPlanMapper;
import com.cormen.bim.model.*;
import com.cormen.bim.service.EmsEquMaintenanceTaskPlanService;
import com.cormen.bim.service.UmsAdminService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备保养维护任务计划 Service
 * @DateTime: 2021/8/3 16:29
 **/
@Service
public class EmsEquMaintenanceTaskPlanServiceImpl implements EmsEquMaintenanceTaskPlanService {

    @Autowired
    private EmsEquMaintenanceTaskPlanMapper emsEquMaintenanceTaskPlanMapper ;

    @Autowired
    private UmsAdminService adminService;
    /**
     * @param param
     * @Author: cormen
     * @Description: 创建设备保养维护计划
     * @DateTime: 2021/8/3 15:12
     */
    @Override
    public int addPlan(EquMaintenanceTaskPlanParam param) {
        EmsEquMaintenanceTaskPlan equMaintenanceTask = new EmsEquMaintenanceTaskPlan();
        BeanUtils.copyProperties(param, equMaintenanceTask);
        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equMaintenanceTask.setCreatedBy(currentAdmin.getId());
        equMaintenanceTask.setCreatedTime(new Date());
        return  emsEquMaintenanceTaskPlanMapper.insert(equMaintenanceTask);
    }

    /**
     * @param id
     * @param param
     * @Author: cormen
     * @Description: 修改设备保养维护计划
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int update(long id, EquMaintenanceTaskPlanParam param) {

        EmsEquMaintenanceTaskPlan equipment =emsEquMaintenanceTaskPlanMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(param, equipment);
        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equipment.setUpdatedBy(currentAdmin.getId());
        equipment.setUpdatedTime(new Date());
        return  emsEquMaintenanceTaskPlanMapper.updateByPrimaryKey(equipment);
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 删除设备保养计划
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int delete(long id) {
        return emsEquMaintenanceTaskPlanMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 复制计划
     * @DateTime: 2021/8/3 15:19
     */
    @Override
    public int copy(long id) {
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 启用计划
     * @DateTime: 2021/8/3 15:20
     */
    @Override
    public int invoke(long id) {
       // EmsEquMaintenanceTaskPlan target =emsEquMaintenanceTaskPlanMapper.selectByPrimaryKey(id);
        return 1;
    }

    /**
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @Author: cormen
     * @Description: 根据名称分页获取计划
     * @DateTime: 2021/8/3 16:22
     */
    @Override
    public List<EmsEquMaintenanceTaskPlan> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        EmsEquMaintenanceTaskPlanExample example = new EmsEquMaintenanceTaskPlanExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andTaskNameEqualTo("%" + keyword + "%");
        }
        return emsEquMaintenanceTaskPlanMapper.selectByExample(example);
    }
}
