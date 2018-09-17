package cn.cucsi.bsd.ucc.data.domain;

import java.util.Date;

/****
 * 任务类型表
 */
public class TaskType {
	
    private String taskTypeId; //主键

    private String taskTypeCode; //任务类型编码

    private String taskTypeName; //任务类型名称

    private Date createTime; //创建时间

    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId == null ? null : taskTypeId.trim();
    }

    public String getTaskTypeCode() {
        return taskTypeCode;
    }

    public void setTaskTypeCode(String taskTypeCode) {
        this.taskTypeCode = taskTypeCode == null ? null : taskTypeCode.trim();
    }

    public String getTaskTypeName() {
        return taskTypeName;
    }

    public void setTaskTypeName(String taskTypeName) {
        this.taskTypeName = taskTypeName == null ? null : taskTypeName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}