package com.gzmu.springboot_project.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author author
 */
@Entity
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Integer getGoodsClassId() {
        return goodsClassId;
    }

    public void setGoodsClassId(Integer goodsClassId) {
        this.goodsClassId = goodsClassId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStockTime() {
        return stockTime;
    }

    public void setStockTime(String stockTime) {
        this.stockTime = stockTime;
    }

    public String getPutTime() {
        return putTime;
    }

    public void setPutTime(String putTime) {
        this.putTime = putTime;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    @Override
    public String toString() {
        return "GoodsManage{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", goodsClassId=" + goodsClassId +
                ", channel='" + channel + '\'' +
                ", number=" + number +
                ", price='" + price + '\'' +
                ", stockTime='" + stockTime + '\'' +
                ", putTime='" + putTime + '\'' +
                ", states='" + states + '\'' +
                '}';
    }
}
