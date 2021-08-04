package com.cormen.bim.controller;

import com.cormen.bim.common.api.CommonPage;
import com.cormen.bim.common.api.CommonResult;
import com.cormen.bim.dto.EqumentParam;
import com.cormen.bim.dto.EqumentTypeParam;
import com.cormen.bim.model.EmsEquipment;
import com.cormen.bim.model.EmsType;
import com.cormen.bim.service.EmsEqumentService;
import com.cormen.bim.service.EmsEqumentTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@Api(tags = "EmsEqumentController", description = "设备管理")
@RequestMapping("/equment")
public class EmsEqumentController {

    @Autowired
    private EmsEqumentService emsEqumentService;

    @ApiOperation("添加设备")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody EqumentParam equmentParam) {
        int count = emsEqumentService.addEqument(equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }


    @ApiOperation("编辑设备档案")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable int id, @RequestBody EqumentParam equmentParam) {
        int count = emsEqumentService.updateEqument( id ,equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除设备")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delEmsEqumentType(@PathVariable int id) {
        int count = emsEqumentService.delEqument( id );
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据名称分页获取设备列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EmsEquipment>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                  @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                  @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<EmsEquipment> result = emsEqumentService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
