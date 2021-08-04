package com.cormen.bim.service;

import com.cormen.bim.dto.EqumentParam;
import com.cormen.bim.model.EmsEquipment;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备档案Service
 * @DateTime: 2021/8/2 14:24
 **/
public interface EmsEqumentService {
    /**
    * @Author: cormen
    * @Description: 删除设备
    * @DateTime: 2021/8/2 14:48
    */
    int delEqument(int equTypeId);
    /**
    * @Author: cormen
    * @Description: 编辑设备档案
    * @DateTime: 2021/8/2 14:51
    */
    int updateEqument(int id , EqumentParam equmentParam);

    /**
    * @Author: cormen
    * @Description: 增加设备档案
    * @DateTime: 2021/8/2 14:52
    */
    int addEqument(EqumentParam equmentParam);

    /**
    * @Author: cormen
    * @Description: 根据名称,编码或规格型号分页获取设备档案
    * @DateTime: 2021/8/2 14:56
    */
    List<EmsEquipment> list(String keyword, Integer pageSize, Integer pageNum);
}
