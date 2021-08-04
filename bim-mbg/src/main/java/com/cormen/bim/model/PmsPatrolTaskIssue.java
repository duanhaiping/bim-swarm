package com.cormen.bim.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class PmsPatrolTaskIssue implements Serializable {
    @ApiModelProperty(value = "ID")
    private Integer id;

    private String desc;

    private Integer taskId;

    private String name;

    private Date soluteTime;

    @ApiModelProperty(value = "创建时间")
    private Date createdTime;

    private Integer princeple;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSoluteTime() {
        return soluteTime;
    }

    public void setSoluteTime(Date soluteTime) {
        this.soluteTime = soluteTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getPrinceple() {
        return princeple;
    }

    public void setPrinceple(Integer princeple) {
        this.princeple = princeple;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", desc=").append(desc);
        sb.append(", taskId=").append(taskId);
        sb.append(", name=").append(name);
        sb.append(", soluteTime=").append(soluteTime);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", princeple=").append(princeple);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}