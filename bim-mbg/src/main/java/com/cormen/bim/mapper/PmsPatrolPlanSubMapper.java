package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolPlanSub;
import com.cormen.bim.model.PmsPatrolPlanSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolPlanSubMapper {
    long countByExample(PmsPatrolPlanSubExample example);

    int deleteByExample(PmsPatrolPlanSubExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolPlanSub record);

    int insertSelective(PmsPatrolPlanSub record);

    List<PmsPatrolPlanSub> selectByExample(PmsPatrolPlanSubExample example);

    PmsPatrolPlanSub selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolPlanSub record, @Param("example") PmsPatrolPlanSubExample example);

    int updateByExample(@Param("record") PmsPatrolPlanSub record, @Param("example") PmsPatrolPlanSubExample example);

    int updateByPrimaryKeySelective(PmsPatrolPlanSub record);

    int updateByPrimaryKey(PmsPatrolPlanSub record);
}