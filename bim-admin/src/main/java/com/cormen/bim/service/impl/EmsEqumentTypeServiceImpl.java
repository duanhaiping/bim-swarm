package com.cormen.bim.service.impl;


import com.cormen.bim.dto.EqumentTypeParam;
import com.cormen.bim.mapper.EmsTypeMapper;
import com.cormen.bim.mapper.UmsMenuMapper;
import com.cormen.bim.model.EmsType;
import com.cormen.bim.model.EmsTypeExample;
import com.cormen.bim.model.UmsAdmin;
import com.cormen.bim.model.UmsRoleExample;
import com.cormen.bim.service.EmsEqumentTypeService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
/**
 * 设备类型管理Service实现类
 * Created by cormen on 2021/8/2.
 */
@Service
public class EmsEqumentTypeServiceImpl implements EmsEqumentTypeService {
    @Autowired
    private EmsTypeMapper emsTypeMapper;


    /**
     * 删除设备类型
     *
     * @param equTypeId
     */
    @Override
    public int delEquType(int equTypeId) {
        return emsTypeMapper.deleteByPrimaryKey(equTypeId);
    }

    @Override
    public int addEquType(EqumentTypeParam equmentTypeParam) {
        EmsType  type = new EmsType();
        BeanUtils.copyProperties(equmentTypeParam, type);
        return  emsTypeMapper.insert(type);
    }

    @Override
    public int update(int id, EqumentTypeParam emsType) {
        EmsType  type = new EmsType();
        BeanUtils.copyProperties(emsType, type);
        type.setId(id);
        return emsTypeMapper.updateByPrimaryKey(type);

    }

    /**
     * 根据名称分页查询用户
     *
     * @param keyword
     * @param pageSize
     * @param pageNum
     */
    @Override
    public List<EmsType> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        EmsTypeExample example = new EmsTypeExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andNameLike("%" + keyword + "%");
        }
        return emsTypeMapper.selectByExample(example);
    }
}
