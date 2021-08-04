package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsEquMaintenanceTaskPlan;
import com.cormen.bim.model.EmsEquMaintenanceTaskPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsEquMaintenanceTaskPlanMapper {
    long countByExample(EmsEquMaintenanceTaskPlanExample example);

    int deleteByExample(EmsEquMaintenanceTaskPlanExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EmsEquMaintenanceTaskPlan record);

    int insertSelective(EmsEquMaintenanceTaskPlan record);

    List<EmsEquMaintenanceTaskPlan> selectByExample(EmsEquMaintenanceTaskPlanExample example);

    EmsEquMaintenanceTaskPlan selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EmsEquMaintenanceTaskPlan record, @Param("example") EmsEquMaintenanceTaskPlanExample example);

    int updateByExample(@Param("record") EmsEquMaintenanceTaskPlan record, @Param("example") EmsEquMaintenanceTaskPlanExample example);

    int updateByPrimaryKeySelective(EmsEquMaintenanceTaskPlan record);

    int updateByPrimaryKey(EmsEquMaintenanceTaskPlan record);
}