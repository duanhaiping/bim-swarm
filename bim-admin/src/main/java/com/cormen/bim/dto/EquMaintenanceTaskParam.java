package com.cormen.bim.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: cormen
 * @Description: XXX Service
 * @DateTime: 2021/8/3 15:33
 **/
public class EquMaintenanceTaskParam {
    @NotEmpty
    @ApiModelProperty(value = "任务名称")
    private String name;
    @NotEmpty
    @ApiModelProperty(value = "关联计划")
    private Integer linkPlan;
    @NotEmpty
    @ApiModelProperty(value = "经办人")
    private Integer agent;
    @NotEmpty
    @ApiModelProperty(value = "执行人")
    private Integer executor;
    @NotEmpty
    @ApiModelProperty(value = "稽查人")
    private Integer reviewer;

}
