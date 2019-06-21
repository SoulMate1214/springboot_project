package com.gzmu.springboot_project.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author author
 */
@Entity
@Data
@Table(name = "goods_manage")
public class GoodsManage implements Serializable {

    private static final long serialVersionUID = 1556269343823L;
    /**
     * 主键
     * 进货编号
     * isNullAble:0
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 货品名称
     * isNullAble:1
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 所属类别
     * isNullAble:1
     */
    @Column(name = "goods_class_id")
    private Integer goodsClassId;

    /**
     * 进货渠道
     * isNullAble:1
     */
    @Column(name = "channel")
    private String channel;

    /**
     * 数量
     * isNullAble:1
     */
    @Column(name = "number")
    private Integer number;

    /**
     * 单价
     * isNullAble:1
     */
    @Column(name = "price")
    private String price;

    /**
     * 进货时间
     * isNullAble:1
     */
    @Column(name = "stock_time")
    private String stockTime;

    /**
     * 入库时间
     * isNullAble:1
     */
    @Column(name = "put_time")
    private String putTime;

    /**
     * 当前状态
     * isNullAble:1
     */
    @Column(name = "states")
    private String states;

}
