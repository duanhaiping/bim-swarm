package com.cormen.bim.service;

import com.cormen.bim.dto.EqumentTypeParam;
import com.cormen.bim.model.EmsType;
import com.cormen.bim.model.UmsAdmin;
import com.cormen.bim.model.UmsRole;

import java.util.List;

/**
 * 设备类型Service
 * Created by cormen on 2018/4/26.
 */
public interface EmsEqumentTypeService {
    /**
     * 删除设备类型
     */
    int delEquType(int equTypeId);

    /*
    * 添加设备类型
    * */
    int addEquType(EqumentTypeParam equmentTypeParam) ;

    /*
    * 编辑设备类型
    * */
    int update(int id, EqumentTypeParam emsType);

    /**
     * 根据名称分页查询设备类型
     */
    List<EmsType> list(String keyword, Integer pageSize, Integer pageNum);
}
