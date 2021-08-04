package com.cormen.bim.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsPatrolPlan implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer id;

    private Integer regionId;

    private String name;

    private Date staetDate;

    private Date endDate;

    private Integer pathId;

    @ApiModelProperty(value = "保养频率类型 每日，每月，每年")
    private String frequencyType;

    private String bimPath;

    @ApiModelProperty(value = "经办人")
    private Integer agent;

    @ApiModelProperty(value = "保养频率次数")
    private Integer frequencyNumber;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStaetDate() {
        return staetDate;
    }

    public void setStaetDate(Date staetDate) {
        this.staetDate = staetDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getPathId() {
        return pathId;
    }

    public void setPathId(Integer pathId) {
        this.pathId = pathId;
    }

    public String getFrequencyType() {
        return frequencyType;
    }

    public void setFrequencyType(String frequencyType) {
        this.frequencyType = frequencyType;
    }

    public String getBimPath() {
        return bimPath;
    }

    public void setBimPath(String bimPath) {
        this.bimPath = bimPath;
    }

    public Integer getAgent() {
        return agent;
    }

    public void setAgent(Integer agent) {
        this.agent = agent;
    }

    public Integer getFrequencyNumber() {
        return frequencyNumber;
    }

    public void setFrequencyNumber(Integer frequencyNumber) {
        this.frequencyNumber = frequencyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", regionId=").append(regionId);
        sb.append(", name=").append(name);
        sb.append(", staetDate=").append(staetDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", pathId=").append(pathId);
        sb.append(", frequencyType=").append(frequencyType);
        sb.append(", bimPath=").append(bimPath);
        sb.append(", agent=").append(agent);
        sb.append(", frequencyNumber=").append(frequencyNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}