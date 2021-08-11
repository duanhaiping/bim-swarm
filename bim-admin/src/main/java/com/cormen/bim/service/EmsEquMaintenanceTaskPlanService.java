package com.cormen.bim.service;

import com.cormen.bim.dto.EquMaintenanceTaskPlanParam;
import com.cormen.bim.model.EmsEquMaintenanceTaskPlan;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备保养维护任务计划  Service
 * @DateTime: 2021/8/3 15:07
 **/
public interface EmsEquMaintenanceTaskPlanService {
    /**
     * @Author: cormen
     * @Description: 创建设备保养维护计划
     * @DateTime: 2021/8/3 15:12
     */
    int addPlan(EquMaintenanceTaskPlanParam param);

    /**
     * @Author: cormen
     * @Description: 修改设备保养维护计划
     * @DateTime: 2021/8/3 15:15
     */
    int update(long id, EquMaintenanceTaskPlanParam param);

    /**
     * @Author: cormen
     * @Description: 删除设备保养计划
     * @DateTime: 2021/8/3 15:15
     */
    int delete(long id);

    /**
     * @Author: cormen
     * @Description: 复制计划
     * @DateTime: 2021/8/3 15:19
     */
    int copy(long id);

    /**
     * @Author: cormen
     * @Description: 启用计划
     * @DateTime: 2021/8/3 15:20
     */
    int invoke(long id);
    
    /**
    * @Author: cormen
    * @Description: 根据名称分页获取计划
    * @DateTime: 2021/8/3 16:22
    */
    List<EmsEquMaintenanceTaskPlan> list(String keyword, Integer pageSize, Integer pageNum);
}
