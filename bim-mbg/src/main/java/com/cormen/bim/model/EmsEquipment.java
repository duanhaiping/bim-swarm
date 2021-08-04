package com.cormen.bim.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EmsEquipment implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer id;

    @ApiModelProperty(value = "管理区")
    private Integer region;

    @ApiModelProperty(value = "设备名称")
    private String name;

    @ApiModelProperty(value = "设备编码")
    private String code;

    @ApiModelProperty(value = "设备类型")
    private String type;

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

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新人")
    private String updatedBy;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;

    @ApiModelProperty(value = "规格型号")
    private String specification;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMaintenanceCycle() {
        return maintenanceCycle;
    }

    public void setMaintenanceCycle(String maintenanceCycle) {
        this.maintenanceCycle = maintenanceCycle;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getBimModelCode() {
        return bimModelCode;
    }

    public void setBimModelCode(String bimModelCode) {
        this.bimModelCode = bimModelCode;
    }

    public String getModelPosition() {
        return modelPosition;
    }

    public void setModelPosition(String modelPosition) {
        this.modelPosition = modelPosition;
    }

    public String getIsactivity() {
        return isactivity;
    }

    public void setIsactivity(String isactivity) {
        this.isactivity = isactivity;
    }

    public Date getUseDate() {
        return useDate;
    }

    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", region=").append(region);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", type=").append(type);
        sb.append(", state=").append(state);
        sb.append(", maintenanceCycle=").append(maintenanceCycle);
        sb.append(", weight=").append(weight);
        sb.append(", bimModelCode=").append(bimModelCode);
        sb.append(", modelPosition=").append(modelPosition);
        sb.append(", isactivity=").append(isactivity);
        sb.append(", useDate=").append(useDate);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", specification=").append(specification);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}