package com.cormen.bim.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class EqumentTypeParam {
    @NotEmpty
    @ApiModelProperty(value = "类型名称", required = true)
    private String name;
    @NotEmpty
    @ApiModelProperty(value = "类型排序编码", required = true)
    private Integer code;
}
