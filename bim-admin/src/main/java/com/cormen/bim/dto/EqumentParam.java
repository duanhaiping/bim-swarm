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

    @ApiModelProperty(value = "材料")
    private String material;

    @ApiModelProperty(value = "安装位置")
    private String placement;

    @ApiModelProperty(value = "重量")
    private BigDecimal weight;

    @ApiModelProperty(value = "BIMGUID")
    private String bimModelCode;

    @ApiModelProperty(value = "BIM设备位置")
    private String modelPosition;

    @ApiModelProperty(value = "安装日期")
    private Date installTime;

    @ApiModelProperty(value = "报废日期")
    private Date scrapDate;

    @ApiModelProperty(value = "使用年限")
    private Integer lifeUseful;

    @ApiModelProperty(value = "已用月份")
    private Integer monthsUsed;

    @ApiModelProperty(value = "维修次数")
    private Integer repairTimes;

    @ApiModelProperty(value = "保养次数")
    private Integer maintainTimes;

    @ApiModelProperty(value = "设备原值")
    private Integer originalPrice;

    @ApiModelProperty(value = "已提旧职")
    private Integer oldPrice;

    @ApiModelProperty(value = "设备净值")
    private Integer equity;

    @ApiModelProperty(value = "维保单位")
    private String repairOrganization;

    @ApiModelProperty(value = "维保电话")
    private String repairTel;

    @ApiModelProperty(value = "维保单位地址")
    private String repairAddress;

    @ApiModelProperty(value = "设备保养人")
    private Long repairBy;

    @ApiModelProperty(value = "生产厂家")
    private String manufacturer;

    @ApiModelProperty(value = "厂家地址")
    private String manufacturerAddress;

    @ApiModelProperty(value = "规格型号")
    private String specification;

    @ApiModelProperty(value = "标准")
    private String repairStandard;
}
