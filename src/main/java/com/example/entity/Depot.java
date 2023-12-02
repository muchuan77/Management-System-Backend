package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.util.Identifiable;
import lombok.Data;

@Data
@TableName("depot")
public class Depot implements Identifiable {
    @TableId(type = IdType.INPUT)
    private Integer id;
    @TableField("cargoName")
    private String cargoName;
    @TableField("weight")
    private String weight;
    @TableField("outboundTime")
    private String outboundTime;
    @TableField("entryTime")
    private String entryTime;
}
