package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolLocation;
import com.cormen.bim.model.PmsPatrolLocationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolLocationMapper {
    long countByExample(PmsPatrolLocationExample example);

    int deleteByExample(PmsPatrolLocationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolLocation record);

    int insertSelective(PmsPatrolLocation record);

    List<PmsPatrolLocation> selectByExample(PmsPatrolLocationExample example);

    PmsPatrolLocation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolLocation record, @Param("example") PmsPatrolLocationExample example);

    int updateByExample(@Param("record") PmsPatrolLocation record, @Param("example") PmsPatrolLocationExample example);

    int updateByPrimaryKeySelective(PmsPatrolLocation record);

    int updateByPrimaryKey(PmsPatrolLocation record);
}