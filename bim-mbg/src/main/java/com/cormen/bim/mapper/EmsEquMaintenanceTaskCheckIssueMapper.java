package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsEquMaintenanceTaskCheckIssue;
import com.cormen.bim.model.EmsEquMaintenanceTaskCheckIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsEquMaintenanceTaskCheckIssueMapper {
    long countByExample(EmsEquMaintenanceTaskCheckIssueExample example);

    int deleteByExample(EmsEquMaintenanceTaskCheckIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmsEquMaintenanceTaskCheckIssue record);

    int insertSelective(EmsEquMaintenanceTaskCheckIssue record);

    List<EmsEquMaintenanceTaskCheckIssue> selectByExample(EmsEquMaintenanceTaskCheckIssueExample example);

    EmsEquMaintenanceTaskCheckIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmsEquMaintenanceTaskCheckIssue record, @Param("example") EmsEquMaintenanceTaskCheckIssueExample example);

    int updateByExample(@Param("record") EmsEquMaintenanceTaskCheckIssue record, @Param("example") EmsEquMaintenanceTaskCheckIssueExample example);

    int updateByPrimaryKeySelective(EmsEquMaintenanceTaskCheckIssue record);

    int updateByPrimaryKey(EmsEquMaintenanceTaskCheckIssue record);
}