package com.cormen.bim.controller;

import com.cormen.bim.common.api.CommonPage;
import com.cormen.bim.common.api.CommonResult;
import com.cormen.bim.dto.EquMaintenanceTaskParam;
import com.cormen.bim.dto.EquMaintenanceTaskPlanParam;
import com.cormen.bim.model.EmsEquMaintenanceTask;
import com.cormen.bim.model.EmsEquMaintenanceTaskPlan;
import com.cormen.bim.service.EmsEquMaintenanceTaskPlanService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: cormen
 * @Description: XXX Service
 * @DateTime: 2021/8/3 16:58
 **/


@Controller
@Api(tags = "设备保养维护计划管理", description = "设备保养维护计划")
@RequestMapping("/equ-task-plan")
public class EmsEquMaintenanceTaskPlanController {

    @Autowired
    private EmsEquMaintenanceTaskPlanService  emsEquMaintenanceTaskPlanService;

    @ApiOperation("添加计划")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody EquMaintenanceTaskPlanParam equmentParam) {
        int count = emsEquMaintenanceTaskPlanService.addPlan(equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("编辑计划")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable int id, @RequestBody EquMaintenanceTaskPlanParam equmentParam) {
        int count = emsEquMaintenanceTaskPlanService.update(id,equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除计划")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable int id) {
        int count = emsEquMaintenanceTaskPlanService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("copy计划")
    @RequestMapping(value = "/copy/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult copy(@PathVariable int id) {
        int count = emsEquMaintenanceTaskPlanService.copy(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("启用计划")
    @RequestMapping(value = "/invoke/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult invoke(@PathVariable int id) {
        int count = emsEquMaintenanceTaskPlanService.invoke(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据名称分页获取计划")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EmsEquMaintenanceTaskPlan>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                                    @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                    @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<EmsEquMaintenanceTaskPlan> result = emsEquMaintenanceTaskPlanService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
