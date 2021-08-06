package com.cormen.bim.controller;

import com.cormen.bim.common.api.CommonPage;
import com.cormen.bim.common.api.CommonResult;
import com.cormen.bim.dto.EquMaintenanceTaskParam;
import com.cormen.bim.model.EmsEquMaintenanceTask;
import com.cormen.bim.service.EmsEquMaintenanceTaskService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@Api(tags = "设备保养维护任务管理", description = "设备保养维护任务")
@RequestMapping("/equ-task")
public class EmsEquMaintenanceTaskController {

    @Autowired
    private EmsEquMaintenanceTaskService emsEquMainTenanceTaskService;

    @ApiOperation("添加任务")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody EquMaintenanceTaskParam equmentParam) {
        int count = emsEquMainTenanceTaskService.addTask(equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("编辑任务")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable int id, @RequestBody EquMaintenanceTaskParam equmentParam) {
        int count = emsEquMainTenanceTaskService.update(id,equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除任务")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable int id) {
        int count = emsEquMainTenanceTaskService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("分派任务")
    @RequestMapping(value = "/send/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult send(@PathVariable int id) {
        int count = emsEquMainTenanceTaskService.send(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("核查任务")
    @RequestMapping(value = "/check/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult check(@PathVariable int id) {
        int count = emsEquMainTenanceTaskService.send(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据名称分页获取任务")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EmsEquMaintenanceTask>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                                @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<EmsEquMaintenanceTask> result = emsEquMainTenanceTaskService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
