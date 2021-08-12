package com.cormen.bim.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

/**
 * @Author: cormen
 * @Description: XXX Service
 * @DateTime: 2021/8/3 16:24
 **/
@Getter
@Setter
public class EquMaintenanceTaskIssueParam {
    @NotEmpty
    @ApiModelProperty(value = "任务ID")
    private Integer taskId;
    @NotEmpty
    @ApiModelProperty(value = "问题名称")
    private String issue;

    @NotEmpty
    @ApiModelProperty(value = "解决方案")
    private String solution;
}
