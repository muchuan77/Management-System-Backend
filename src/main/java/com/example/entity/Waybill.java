package com.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.util.Identifiable;
import lombok.Data;

@Data
@TableName("waybill")
public class Waybill implements Identifiable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("waybillName")
    private String waybillName;
    @TableField("waybillTime")
    private String waybillTime;
    @TableField("consigneeName")
    private String consigneeName;
    @TableField("waybillDescription")
    private String waybillDescription;

}
