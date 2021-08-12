package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EquMaintenanceTaskParam;
import com.cormen.bim.mapper.EmsEquMaintenanceTaskMapper;
import com.cormen.bim.model.EmsEquMaintenanceTask;
import com.cormen.bim.model.EmsEquMaintenanceTaskExample;
import com.cormen.bim.model.UmsAdmin;
import com.cormen.bim.service.EmsEquMaintenanceTaskService;
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
 * @Description: 设备保养维护任务 Service
 * @DateTime: 2021/8/3 16:28
 **/
@Service
public class EmsEquMaintenanceTaskServiceImpl implements EmsEquMaintenanceTaskService {

    @Autowired
    private EmsEquMaintenanceTaskMapper emsEquMaintenanceTaskMapper ;

    @Autowired
    private UmsAdminService adminService;
    /**
     * @param param
     * @Author: cormen
     * @Description: 创建巡检任务
     * @DateTime: 2021/8/3 15:32
     */
    @Override
    public int addTask(EquMaintenanceTaskParam param) {
        EmsEquMaintenanceTask equMaintenanceTask = new EmsEquMaintenanceTask();
        BeanUtils.copyProperties(param, equMaintenanceTask);
        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equMaintenanceTask.setCreatedBy(currentAdmin.getId());
        equMaintenanceTask.setCreatedTime(new Date());
        return  emsEquMaintenanceTaskMapper.insert(equMaintenanceTask);
    }

    /**
     * @param id
     * @param param
     * @Author: cormen
     * @Description: 修改巡检任务
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int update(int id, EquMaintenanceTaskParam param) {
        EmsEquMaintenanceTask equipment = emsEquMaintenanceTaskMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(param, equipment);
        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equipment.setUpdatedBy(currentAdmin.getId());
        equipment.setUpdatedTime(new Date());
        return  emsEquMaintenanceTaskMapper.updateByPrimaryKey(equipment);
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 删除巡检任务
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int delete(int id) {
        return emsEquMaintenanceTaskMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 巡检任务发出
     * @DateTime: 2021/8/3 15:36
     */
    @Override
    public int send(int id) {
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 巡检任务核查
     * @DateTime: 2021/8/3 15:36
     */
    @Override
    public int check(int id) {
        return 0;
    }

    /**
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @Author: cormen
     * @Description: 根据名称分页获取计划
     * @DateTime: 2021/8/3 15:40
     */
    @Override
    public List<EmsEquMaintenanceTask> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        EmsEquMaintenanceTaskExample example = new EmsEquMaintenanceTaskExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return emsEquMaintenanceTaskMapper.selectByExample(example);
    }
}
