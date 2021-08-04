package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolTask;
import com.cormen.bim.model.PmsPatrolTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolTaskMapper {
    long countByExample(PmsPatrolTaskExample example);

    int deleteByExample(PmsPatrolTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolTask record);

    int insertSelective(PmsPatrolTask record);

    List<PmsPatrolTask> selectByExample(PmsPatrolTaskExample example);

    PmsPatrolTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolTask record, @Param("example") PmsPatrolTaskExample example);

    int updateByExample(@Param("record") PmsPatrolTask record, @Param("example") PmsPatrolTaskExample example);

    int updateByPrimaryKeySelective(PmsPatrolTask record);

    int updateByPrimaryKey(PmsPatrolTask record);
}