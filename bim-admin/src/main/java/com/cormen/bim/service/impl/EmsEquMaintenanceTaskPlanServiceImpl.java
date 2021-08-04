package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EquMaintenanceTaskPlanParam;
import com.cormen.bim.model.EmsEquMaintenanceTaskPlan;
import com.cormen.bim.service.EmsEquMaintenanceTaskPlanService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备保养维护任务计划 Service
 * @DateTime: 2021/8/3 16:29
 **/
@Service
public class EmsEquMaintenanceTaskPlanServiceImpl implements EmsEquMaintenanceTaskPlanService {
    /**
     * @param param
     * @Author: cormen
     * @Description: 创建设备保养维护计划
     * @DateTime: 2021/8/3 15:12
     */
    @Override
    public int addPlan(EquMaintenanceTaskPlanParam param) {
        return 0;
    }

    /**
     * @param id
     * @param param
     * @Author: cormen
     * @Description: 修改设备保养维护计划
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int update(int id, EquMaintenanceTaskPlanParam param) {
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 删除设备保养计划
     * @DateTime: 2021/8/3 15:15
     */
    @Override
    public int delete(int id) {
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 复制计划
     * @DateTime: 2021/8/3 15:19
     */
    @Override
    public int copy(int id) {
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 启用计划
     * @DateTime: 2021/8/3 15:20
     */
    @Override
    public int invoke(int id) {
        return 0;
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
        return null;
    }
}
