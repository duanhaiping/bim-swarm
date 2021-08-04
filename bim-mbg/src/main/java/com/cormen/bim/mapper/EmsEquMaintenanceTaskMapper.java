package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsEquMaintenanceTask;
import com.cormen.bim.model.EmsEquMaintenanceTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsEquMaintenanceTaskMapper {
    long countByExample(EmsEquMaintenanceTaskExample example);

    int deleteByExample(EmsEquMaintenanceTaskExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmsEquMaintenanceTask record);

    int insertSelective(EmsEquMaintenanceTask record);

    List<EmsEquMaintenanceTask> selectByExample(EmsEquMaintenanceTaskExample example);

    EmsEquMaintenanceTask selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmsEquMaintenanceTask record, @Param("example") EmsEquMaintenanceTaskExample example);

    int updateByExample(@Param("record") EmsEquMaintenanceTask record, @Param("example") EmsEquMaintenanceTaskExample example);

    int updateByPrimaryKeySelective(EmsEquMaintenanceTask record);

    int updateByPrimaryKey(EmsEquMaintenanceTask record);
}