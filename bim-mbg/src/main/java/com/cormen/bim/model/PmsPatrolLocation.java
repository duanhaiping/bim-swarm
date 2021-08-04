package com.cormen.bim.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class PmsPatrolLocation implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer id;

    private Integer region;

    private String address;

    private String code;

    private String patrolPoint;

    private String signType;

    private String bimPoint;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPatrolPoint() {
        return patrolPoint;
    }

    public void setPatrolPoint(String patrolPoint) {
        this.patrolPoint = patrolPoint;
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        this.signType = signType;
    }

    public String getBimPoint() {
        return bimPoint;
    }

    public void setBimPoint(String bimPoint) {
        this.bimPoint = bimPoint;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", region=").append(region);
        sb.append(", address=").append(address);
        sb.append(", code=").append(code);
        sb.append(", patrolPoint=").append(patrolPoint);
        sb.append(", signType=").append(signType);
        sb.append(", bimPoint=").append(bimPoint);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}