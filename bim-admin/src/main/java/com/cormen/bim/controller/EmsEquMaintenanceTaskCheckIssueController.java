package com.cormen.bim.controller;

import com.cormen.bim.common.api.CommonPage;
import com.cormen.bim.common.api.CommonResult;
import com.cormen.bim.dto.EquMaintenanceTaskIssueParam;
import com.cormen.bim.dto.EquMaintenanceTaskParam;
import com.cormen.bim.model.EmsEquMaintenanceTask;
import com.cormen.bim.model.EmsEquMaintenanceTaskCheckIssue;
import com.cormen.bim.service.EmsEquMaintenanceTaskCheckIssueService;
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
@Api(tags = "EmsEquMaintenanceTaskCheckIssueController", description = "设备保养维护问题")
@RequestMapping("/equ-task-issue")
public class EmsEquMaintenanceTaskCheckIssueController {
    @Autowired
    private EmsEquMaintenanceTaskCheckIssueService emsEquMaintenanceTaskCheckIssueService;

    @ApiOperation("添加问题")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody EquMaintenanceTaskIssueParam equmentParam) {
        int count = emsEquMaintenanceTaskCheckIssueService.addIssue(equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("编辑问题")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public CommonResult update(@PathVariable int id, @RequestBody EquMaintenanceTaskIssueParam equmentParam) {
        int count = emsEquMaintenanceTaskCheckIssueService.update(id,equmentParam);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除问题")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public CommonResult delete(@PathVariable int id) {
        int count = emsEquMaintenanceTaskCheckIssueService.delete(id);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("根据名称分页获取任务")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<EmsEquMaintenanceTaskCheckIssue>> list(@RequestParam(value = "keyword", required = false) String keyword,
                                                                          @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                          @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<EmsEquMaintenanceTaskCheckIssue> result = emsEquMaintenanceTaskCheckIssueService.list(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(result));
    }
}
