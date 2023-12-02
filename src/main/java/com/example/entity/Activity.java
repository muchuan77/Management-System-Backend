package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.util.Identifiable;
import lombok.Data;

@Data
@TableName("activity")
public class Activity implements Identifiable {
    @TableId(type = IdType.INPUT)
    private Integer id;
    @TableField("activityName")
    private String activityName;
    @TableField("activityTime")
    private String activityTime;
    @TableField("activityType")
    private String activityType;
    @TableField("activityForm")
    private String activityForm;
    @TableField("activityZone")
    private String activityZone;
}
