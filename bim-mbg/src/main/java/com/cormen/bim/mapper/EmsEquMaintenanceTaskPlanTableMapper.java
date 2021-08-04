package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsEquMaintenanceTaskPlanTable;
import com.cormen.bim.model.EmsEquMaintenanceTaskPlanTableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsEquMaintenanceTaskPlanTableMapper {
    long countByExample(EmsEquMaintenanceTaskPlanTableExample example);

    int deleteByExample(EmsEquMaintenanceTaskPlanTableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmsEquMaintenanceTaskPlanTable record);

    int insertSelective(EmsEquMaintenanceTaskPlanTable record);

    List<EmsEquMaintenanceTaskPlanTable> selectByExample(EmsEquMaintenanceTaskPlanTableExample example);

    EmsEquMaintenanceTaskPlanTable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmsEquMaintenanceTaskPlanTable record, @Param("example") EmsEquMaintenanceTaskPlanTableExample example);

    int updateByExample(@Param("record") EmsEquMaintenanceTaskPlanTable record, @Param("example") EmsEquMaintenanceTaskPlanTableExample example);

    int updateByPrimaryKeySelective(EmsEquMaintenanceTaskPlanTable record);

    int updateByPrimaryKey(EmsEquMaintenanceTaskPlanTable record);
}