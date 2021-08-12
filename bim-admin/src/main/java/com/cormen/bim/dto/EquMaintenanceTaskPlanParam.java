package com.cormen.bim.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: cormen
 * @Description: XXX Service
 * @DateTime: 2021/8/3 15:13
 **/
@Getter
@Setter
public class EquMaintenanceTaskPlanParam {

    @NotEmpty
    @ApiModelProperty(value = "区域")
    private Integer regionId;

    @NotEmpty
    @ApiModelProperty(value = "设备")
    private Integer equmentId;
    @NotEmpty
    @ApiModelProperty(value = "计划名")
    private String taskName;

    @NotEmpty
    @ApiModelProperty(value = "保养类型")
    private String type;
    @NotEmpty
    @ApiModelProperty(value = "保养频率类型 每日，每月，每年")
    private String frequencyType;
    @NotEmpty
    @ApiModelProperty(value = "保养频率次数")
    private Integer frequencyNumber;
    @NotEmpty
    @ApiModelProperty(value = "经办人")
    private Long agent;
    @NotEmpty
    @ApiModelProperty(value = "预算")
    private BigDecimal funds;

    @NotEmpty
    @ApiModelProperty(value = "核查人")
    private Integer inspection;

    @NotEmpty
    @ApiModelProperty(value = "保养地点")
    private String address;

    @NotEmpty
    @ApiModelProperty(value = "保养要点")
    private String mainpoint;
    @NotEmpty
    @ApiModelProperty(value = "计划有效期开始日期")
    private Date taskStartdate;
    @NotEmpty
    @ApiModelProperty(value = "有效期截至")
    private String taskEnddate;

}
