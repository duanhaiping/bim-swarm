package com.cormen.bim.service;

import com.cormen.bim.dto.EquMaintenanceTaskIssueParam;
import com.cormen.bim.model.EmsEquMaintenanceTaskCheckIssue;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 保养巡检问题  Service
 * @DateTime: 2021/8/3 15:08
 **/
public interface EmsEquMaintenanceTaskCheckIssueService {

    /**
    * @Author: cormen
    * @Description: 创建问题
    * @DateTime: 2021/8/3 16:24
    */
    int  addIssue(EquMaintenanceTaskIssueParam param);
    /**
     * @Author: cormen
     * @Description: 更新问题
     * @DateTime: 2021/8/3 16:24
     */
    int  update(int id,EquMaintenanceTaskIssueParam param);
    
    /**
    * @Author: cormen
    * @Description: 删除问题
    * @DateTime: 2021/8/3 16:25
    */
    int delete(int id);

    /**
    * @Author: cormen
    * @Description: 分页获取
    * @DateTime: 2021/8/3 16:28
    */
    List<EmsEquMaintenanceTaskCheckIssue>  list(String keyword, Integer pageSize, Integer pageNum);
}
