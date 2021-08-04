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
 * @DateTime: 2021/8/2 14:51
 **/

@Getter
@Setter
public class EqumentParam {
    @NotEmpty
    @ApiModelProperty(value = "管理区")
    private Integer region;
    @NotEmpty
    @ApiModelProperty(value = "设备名称")
    private String name;

    @NotEmpty
    @ApiModelProperty(value = "设备编码")
    private String code;
    @NotEmpty
    @ApiModelProperty(value = "设备类型")
    private String type;
    @NotEmpty
    @ApiModelProperty(value = "设备状态")
    private String state;

    @ApiModelProperty(value = "预计保养周期")
    private String maintenanceCycle;

    @ApiModelProperty(value = "重量")
    private BigDecimal weight;

    @ApiModelProperty(value = "BIMGUID")
    private String bimModelCode;

    @ApiModelProperty(value = "BIM设备位置")
    private String modelPosition;

    @ApiModelProperty(value = "是否启用")
    private String isactivity;

    @ApiModelProperty(value = "启用时间")
    private Date useDate;

    @ApiModelProperty(value = "规格型号")
    private String specification;
}
