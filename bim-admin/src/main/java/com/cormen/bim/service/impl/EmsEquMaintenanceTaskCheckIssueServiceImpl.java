package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EquMaintenanceTaskIssueParam;
import com.cormen.bim.mapper.EmsEquMaintenanceTaskCheckIssueMapper;
import com.cormen.bim.model.*;
import com.cormen.bim.service.EmsEquMaintenanceTaskCheckIssueService;
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
 * @Description: 保养巡检问题 Service
 * @DateTime: 2021/8/3 16:30
 **/
@Service
public class EmsEquMaintenanceTaskCheckIssueServiceImpl implements EmsEquMaintenanceTaskCheckIssueService {

    @Autowired
    private EmsEquMaintenanceTaskCheckIssueMapper emsEquMaintenanceTaskCheckIssueMapper;

    @Autowired
    private UmsAdminService adminService;
    /**
     * @param param
     * @Author: cormen
     * @Description: 创建问题
     * @DateTime: 2021/8/3 16:24
     */
    @Override
    public int addIssue(EquMaintenanceTaskIssueParam param) {
        EmsEquMaintenanceTaskCheckIssue equMaintenanceTask = new EmsEquMaintenanceTaskCheckIssue();
        BeanUtils.copyProperties(param, equMaintenanceTask);
        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equMaintenanceTask.setCreatedBy(currentAdmin.getId());
        equMaintenanceTask.setCreatedTime(new Date());

        return  emsEquMaintenanceTaskCheckIssueMapper.insert(equMaintenanceTask);
    }

    /**
     * @param id
     * @param param
     * @Author: cormen
     * @Description: 更新问题
     * @DateTime: 2021/8/3 16:24
     */
    @Override
    public int update(int id, EquMaintenanceTaskIssueParam param) {
        EmsEquMaintenanceTaskCheckIssue equipment =emsEquMaintenanceTaskCheckIssueMapper.selectByPrimaryKey(id);
        BeanUtils.copyProperties(param, equipment);

        UmsAdmin currentAdmin= adminService.getCurrentAdmin();
        equipment.setUpdatedBy(currentAdmin.getId());
        equipment.setUpdatedTime(new Date());
        return  emsEquMaintenanceTaskCheckIssueMapper.updateByPrimaryKey(equipment);
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 删除问题
     * @DateTime: 2021/8/3 16:25
     */
    @Override
    public int delete(int id) {
        return emsEquMaintenanceTaskCheckIssueMapper.deleteByPrimaryKey(id);
    }

    /**
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @Author: cormen
     * @Description: 分页获取
     * @DateTime: 2021/8/3 16:28
     */
    @Override
    public List<EmsEquMaintenanceTaskCheckIssue> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        EmsEquMaintenanceTaskCheckIssueExample example = new EmsEquMaintenanceTaskCheckIssueExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andIssueLike("%" + keyword + "%");
        }
        return emsEquMaintenanceTaskCheckIssueMapper.selectByExample(example);
    }
}
