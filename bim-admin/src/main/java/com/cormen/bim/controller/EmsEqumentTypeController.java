package com.cormen.bim.controller;

/*
* 设备类型管理
* Created by cormen on 2018/4/26.
* */

import com.cormen.bim.common.api.CommonPage;
import com.cormen.bim.common.api.CommonResult;
import com.cormen.bim.dto.EqumentTypeParam;
import com.cormen.bim.dto.UmsAdminParam;
import com.cormen.bim.model.EmsType;
import com.cormen.bim.model.UmsAdmin;
import com.cormen.bim.model.UmsMenu;
import com.cormen.bim.service.EmsEqumentTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "设备类型管理", description = "设备类型管理")
@RequestMapping("/equ-type")
public class EmsEqumentTypeController {

    @Autowired
    private EmsEqumentTypeService emsEqumentTypeService;

    @ApiOperation("添加设备类型")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody EqumentTypeParam typeParam) {
        int count = emsEqumentTypeService.addEquType(typeParam);
        return CommonResult.success(count);
    }


    @ApiOperation("修改设备类型")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable int id,@RequestBody EqumentTypeParam typeParam) {
        int count = emsEqumentTypeService.update( id ,typeParam);
        return CommonResult.success(count);
    }

    @ApiOperation("删除设备类型")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delEmsEqumentType(@PathVariable int id) {
        int count = emsEqumentTypeService.delEquType( id );
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据名称分页获取设备类型列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EmsType>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<EmsType> result = emsEqumentTypeService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
