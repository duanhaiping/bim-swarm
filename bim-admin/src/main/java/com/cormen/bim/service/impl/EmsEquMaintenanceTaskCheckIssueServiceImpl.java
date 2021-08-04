package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EquMaintenanceTaskIssueParam;
import com.cormen.bim.model.EmsEquMaintenanceTaskCheckIssue;
import com.cormen.bim.service.EmsEquMaintenanceTaskCheckIssueService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 保养巡检问题 Service
 * @DateTime: 2021/8/3 16:30
 **/
@Service
public class EmsEquMaintenanceTaskCheckIssueServiceImpl implements EmsEquMaintenanceTaskCheckIssueService {
    /**
     * @param param
     * @Author: cormen
     * @Description: 创建问题
     * @DateTime: 2021/8/3 16:24
     */
    @Override
    public int addIssue(EquMaintenanceTaskIssueParam param) {
        return 0;
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
        return 0;
    }

    /**
     * @param id
     * @Author: cormen
     * @Description: 删除问题
     * @DateTime: 2021/8/3 16:25
     */
    @Override
    public int delete(int id) {
        return 0;
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
        return null;
    }
}
