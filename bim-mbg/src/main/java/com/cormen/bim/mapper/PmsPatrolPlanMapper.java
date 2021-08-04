package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolPlan;
import com.cormen.bim.model.PmsPatrolPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolPlanMapper {
    long countByExample(PmsPatrolPlanExample example);

    int deleteByExample(PmsPatrolPlanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolPlan record);

    int insertSelective(PmsPatrolPlan record);

    List<PmsPatrolPlan> selectByExample(PmsPatrolPlanExample example);

    PmsPatrolPlan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolPlan record, @Param("example") PmsPatrolPlanExample example);

    int updateByExample(@Param("record") PmsPatrolPlan record, @Param("example") PmsPatrolPlanExample example);

    int updateByPrimaryKeySelective(PmsPatrolPlan record);

    int updateByPrimaryKey(PmsPatrolPlan record);
}