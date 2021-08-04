package com.cormen.bim.service.impl;

import com.cormen.bim.dto.EqumentParam;
import com.cormen.bim.mapper.EmsEquipmentMapper;
import com.cormen.bim.mapper.EmsTypeMapper;
import com.cormen.bim.model.EmsEquipment;
import com.cormen.bim.model.EmsEquipmentExample;
import com.cormen.bim.model.EmsType;
import com.cormen.bim.model.EmsTypeExample;
import com.cormen.bim.service.EmsEqumentService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Author: cormen
 * @Description: 设备档案Service
 * @DateTime: 2021/8/2 15:44
 **/
@Service
public class EmsEqumentServiceImpl implements EmsEqumentService {

    @Autowired
    private EmsEquipmentMapper emsEquipmentMapper;


    /**
     * @param equTypeId
     * @Author: cormen
     * @Description: 删除设备
     * @DateTime: 2021/8/2 14:48
     */
    @Override
    public int delEqument(int equTypeId) {

        return emsEquipmentMapper.deleteByPrimaryKey(equTypeId);
    }

    /**
     * @param id
     * @param equmentParam
     * @Author: cormen
     * @Description: 编辑设备档案
     * @DateTime: 2021/8/2 14:51
     */
    @Override
    public int updateEqument(int id, EqumentParam equmentParam) {
        EmsEquipment equipment = new EmsEquipment();
        BeanUtils.copyProperties(equmentParam, equipment);
        equipment.setId(id);
        return  emsEquipmentMapper.updateByPrimaryKey(equipment);
    }

    /**
     * @param equmentParam
     * @Author: cormen
     * @Description: 增加设备档案
     * @DateTime: 2021/8/2 14:52
     */
    @Override
    public int addEqument(EqumentParam equmentParam) {
        EmsEquipment equipment = new EmsEquipment();
        BeanUtils.copyProperties(equmentParam, equipment);
        return  emsEquipmentMapper.insert(equipment);
    }

    /**
     * @param keyword
     * @param pageSize
     * @param pageNum
     * @Author: cormen
     * @Description: 根据名称, 编码或规格型号分页获取设备档案
     * @DateTime: 2021/8/2 14:56
     */
    @Override
    public List<EmsEquipment> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        EmsEquipmentExample example = new EmsEquipmentExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return emsEquipmentMapper.selectByExample(example);
    }
}
