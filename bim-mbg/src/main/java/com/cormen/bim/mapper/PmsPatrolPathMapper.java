package com.cormen.bim.mapper;

import com.cormen.bim.model.PmsPatrolPath;
import com.cormen.bim.model.PmsPatrolPathExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsPatrolPathMapper {
    long countByExample(PmsPatrolPathExample example);

    int deleteByExample(PmsPatrolPathExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsPatrolPath record);

    int insertSelective(PmsPatrolPath record);

    List<PmsPatrolPath> selectByExampleWithBLOBs(PmsPatrolPathExample example);

    List<PmsPatrolPath> selectByExample(PmsPatrolPathExample example);

    PmsPatrolPath selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsPatrolPath record, @Param("example") PmsPatrolPathExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsPatrolPath record, @Param("example") PmsPatrolPathExample example);

    int updateByExample(@Param("record") PmsPatrolPath record, @Param("example") PmsPatrolPathExample example);

    int updateByPrimaryKeySelective(PmsPatrolPath record);

    int updateByPrimaryKeyWithBLOBs(PmsPatrolPath record);

    int updateByPrimaryKey(PmsPatrolPath record);
}