package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsType;
import com.cormen.bim.model.EmsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsTypeMapper {
    long countByExample(EmsTypeExample example);

    int deleteByExample(EmsTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmsType record);

    int insertSelective(EmsType record);

    List<EmsType> selectByExample(EmsTypeExample example);

    EmsType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmsType record, @Param("example") EmsTypeExample example);

    int updateByExample(@Param("record") EmsType record, @Param("example") EmsTypeExample example);

    int updateByPrimaryKeySelective(EmsType record);

    int updateByPrimaryKey(EmsType record);
}