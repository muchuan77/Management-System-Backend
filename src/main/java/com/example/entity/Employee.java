package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.util.Identifiable;
import lombok.Data;

@Data
@TableName("employee")
public class Employee implements Identifiable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("employeeName")
    private String employeeName;
    @TableField("age")
    private Integer age;
    @TableField("gender")
    private String gender;
    @TableField("address")
    private String address;
    @TableField("manHour")
    private Integer manHour;

}
