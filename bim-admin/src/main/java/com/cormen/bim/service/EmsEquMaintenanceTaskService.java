package com.cormen.bim.service;

import com.cormen.bim.dto.EquMaintenanceTaskParam;
import com.cormen.bim.model.EmsEquMaintenanceTask;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备保养维护任务 Service
 * @DateTime: 2021/8/3 15:06
 **/
public interface EmsEquMaintenanceTaskService {
    
    /**
    * @Author: cormen
    * @Description: 创建巡检任务
    * @DateTime: 2021/8/3 15:32
    */
    int addTask(EquMaintenanceTaskParam param);

    /**
     * @Author: cormen
     * @Description: 修改巡检任务
     * @DateTime: 2021/8/3 15:15
     */
    int update(int id, EquMaintenanceTaskParam param);

    /**
     * @Author: cormen
     * @Description: 删除巡检任务
     * @DateTime: 2021/8/3 15:15
     */
    int delete(int id);
    
    /**
    * @Author: cormen
    * @Description: 巡检任务发出
    * @DateTime: 2021/8/3 15:36
    */
    int send(int id);
    
    /**
    * @Author: cormen
    * @Description: 巡检任务核查
    * @DateTime: 2021/8/3 15:36
    */
    int check(int id);

    /**
     * @Author: cormen
     * @Description: 根据名称分页获取计划
     * @DateTime: 2021/8/3 15:40
     */
    List<EmsEquMaintenanceTask> list(String keyword, Integer pageSize, Integer pageNum);
}
