package com.cormen.bim.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EmsEquMaintenanceTaskPlan implements Serializable {
    private Long id;

    private Integer regionId;

    private Integer equmentId;

    private String taskName;

    @ApiModelProperty(value = "创建人")
    private String createdBy;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    @ApiModelProperty(value = "更新人")
    private String updatedBy;

    @ApiModelProperty(value = "更新时间")
    private Date updatedTime;

    @ApiModelProperty(value = "保养类型")
    private String type;

    @ApiModelProperty(value = "保养频率类型 每日，每月，每年")
    private String frequencyType;

    @ApiModelProperty(value = "保养频率次数")
    private Integer frequencyNumber;

    @ApiModelProperty(value = "经办人")
    private Integer agent;

    private BigDecimal funds;

    private Integer inspection;

    private String address;

    private String mainpoint;

    @ApiModelProperty(value = "计划有效期开始日期")
    private Date taskStartdate;

    @ApiModelProperty(value = "有效期截至")
    private String taskEnddate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getEqumentId() {
        return equmentId;
    }

    public void setEqumentId(Integer equmentId) {
        this.equmentId = equmentId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public Integer getFrequencyNumber() {
        return frequencyNumber;
    }

    public void setFrequencyNumber(Integer frequencyNumber) {
        this.frequencyNumber = frequencyNumber;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public BigDecimal getFunds() {
        return funds;
    }

    public void setFunds(BigDecimal funds) {
        this.funds = funds;
    }

    public Integer getInspection() {
        return inspection;
    }

    public void setInspection(Integer inspection) {
        this.inspection = inspection;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMainpoint() {
        return mainpoint;
    }

    public void setMainpoint(String mainpoint) {
        this.mainpoint = mainpoint;
    }

    public Date getTaskStartdate() {
        return taskStartdate;
    }

    public void setTaskStartdate(Date taskStartdate) {
        this.taskStartdate = taskStartdate;
    }

    public String getTaskEnddate() {
        return taskEnddate;
    }

    public void setTaskEnddate(String taskEnddate) {
        this.taskEnddate = taskEnddate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", regionId=").append(regionId);
        sb.append(", equmentId=").append(equmentId);
        sb.append(", taskName=").append(taskName);
        sb.append(", createdBy=").append(createdBy);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", type=").append(type);
        sb.append(", frequencyType=").append(frequencyType);
        sb.append(", frequencyNumber=").append(frequencyNumber);
        sb.append(", agent=").append(agent);
        sb.append(", funds=").append(funds);
        sb.append(", inspection=").append(inspection);
        sb.append(", address=").append(address);
        sb.append(", mainpoint=").append(mainpoint);
        sb.append(", taskStartdate=").append(taskStartdate);
        sb.append(", taskEnddate=").append(taskEnddate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}