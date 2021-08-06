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

    @ApiModelProperty(value = "创建人")
    private Long createdBy;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新人")
    private Long updatedBy;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;

    @ApiModelProperty(value = "规格型号")
    private String specification;

    @ApiModelProperty(value = "标准")
    private String repairStandard;

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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement;
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

    public Date getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Date installTime) {
        this.installTime = installTime;
    }

    public Date getScrapDate() {
        return scrapDate;
    }

    public void setScrapDate(Date scrapDate) {
        this.scrapDate = scrapDate;
    }

    public Integer getLifeUseful() {
        return lifeUseful;
    }

    public void setLifeUseful(Integer lifeUseful) {
        this.lifeUseful = lifeUseful;
    }

    public Integer getMonthsUsed() {
        return monthsUsed;
    }

    public void setMonthsUsed(Integer monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    public Integer getRepairTimes() {
        return repairTimes;
    }

    public void setRepairTimes(Integer repairTimes) {
        this.repairTimes = repairTimes;
    }

    public Integer getMaintainTimes() {
        return maintainTimes;
    }

    public void setMaintainTimes(Integer maintainTimes) {
        this.maintainTimes = maintainTimes;
    }

    public Integer getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Integer getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Integer oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Integer getEquity() {
        return equity;
    }

    public void setEquity(Integer equity) {
        this.equity = equity;
    }

    public String getRepairOrganization() {
        return repairOrganization;
    }

    public void setRepairOrganization(String repairOrganization) {
        this.repairOrganization = repairOrganization;
    }

    public String getRepairTel() {
        return repairTel;
    }

    public void setRepairTel(String repairTel) {
        this.repairTel = repairTel;
    }

    public String getRepairAddress() {
        return repairAddress;
    }

    public void setRepairAddress(String repairAddress) {
        this.repairAddress = repairAddress;
    }

    public Long getRepairBy() {
        return repairBy;
    }

    public void setRepairBy(Long repairBy) {
        this.repairBy = repairBy;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturerAddress() {
        return manufacturerAddress;
    }

    public void setManufacturerAddress(String manufacturerAddress) {
        this.manufacturerAddress = manufacturerAddress;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
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

    public String getRepairStandard() {
        return repairStandard;
    }

    public void setRepairStandard(String repairStandard) {
        this.repairStandard = repairStandard;
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
        sb.append(", material=").append(material);
        sb.append(", placement=").append(placement);
        sb.append(", weight=").append(weight);
        sb.append(", bimModelCode=").append(bimModelCode);
        sb.append(", modelPosition=").append(modelPosition);
        sb.append(", installTime=").append(installTime);
        sb.append(", scrapDate=").append(scrapDate);
        sb.append(", lifeUseful=").append(lifeUseful);
        sb.append(", monthsUsed=").append(monthsUsed);
        sb.append(", repairTimes=").append(repairTimes);
        sb.append(", maintainTimes=").append(maintainTimes);
        sb.append(", originalPrice=").append(originalPrice);
        sb.append(", oldPrice=").append(oldPrice);
        sb.append(", equity=").append(equity);
        sb.append(", repairOrganization=").append(repairOrganization);
        sb.append(", repairTel=").append(repairTel);
        sb.append(", repairAddress=").append(repairAddress);
        sb.append(", repairBy=").append(repairBy);
        sb.append(", manufacturer=").append(manufacturer);
        sb.append(", manufacturerAddress=").append(manufacturerAddress);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", specification=").append(specification);
        sb.append(", repairStandard=").append(repairStandard);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}