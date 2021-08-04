package com.cormen.bim.mapper;

import com.cormen.bim.model.EmsEquipment;
import com.cormen.bim.model.EmsEquipmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmsEquipmentMapper {
    long countByExample(EmsEquipmentExample example);

    int deleteByExample(EmsEquipmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EmsEquipment record);

    int insertSelective(EmsEquipment record);

    List<EmsEquipment> selectByExampleWithBLOBs(EmsEquipmentExample example);

    List<EmsEquipment> selectByExample(EmsEquipmentExample example);

    EmsEquipment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EmsEquipment record, @Param("example") EmsEquipmentExample example);

    int updateByExampleWithBLOBs(@Param("record") EmsEquipment record, @Param("example") EmsEquipmentExample example);

    int updateByExample(@Param("record") EmsEquipment record, @Param("example") EmsEquipmentExample example);

    int updateByPrimaryKeySelective(EmsEquipment record);

    int updateByPrimaryKeyWithBLOBs(EmsEquipment record);

    int updateByPrimaryKey(EmsEquipment record);
}