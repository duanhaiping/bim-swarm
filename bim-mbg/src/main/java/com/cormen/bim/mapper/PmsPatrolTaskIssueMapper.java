package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolTaskIssue;
import com.cormen.bim.model.PmsPatrolTaskIssueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolTaskIssueMapper {
    long countByExample(PmsPatrolTaskIssueExample example);

    int deleteByExample(PmsPatrolTaskIssueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolTaskIssue record);

    int insertSelective(PmsPatrolTaskIssue record);

    List<PmsPatrolTaskIssue> selectByExample(PmsPatrolTaskIssueExample example);

    PmsPatrolTaskIssue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolTaskIssue record, @Param("example") PmsPatrolTaskIssueExample example);

    int updateByExample(@Param("record") PmsPatrolTaskIssue record, @Param("example") PmsPatrolTaskIssueExample example);

    int updateByPrimaryKeySelective(PmsPatrolTaskIssue record);

    int updateByPrimaryKey(PmsPatrolTaskIssue record);
}