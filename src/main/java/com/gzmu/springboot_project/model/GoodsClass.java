package com.gzmu.springboot_project.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author author
 */
@Entity
@Table(name = "goods_class")
public class GoodsClass implements Serializable {

    private static final long serialVersionUID = 1556269309428L;

    /**
     * 主键
     * 类别编号
     * isNullAble:0,defaultVal:0
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品类别
     * isNullAble:1
     */
    @Column(name = "class_name")
    private String className;

    /**
     * 消费对象
     * isNullAble:1
     */
    @Column(name = "object")
    private String object;

    /**
     * 竞争对手
     * isNullAble:1
     */
    @Column(name = "rival")
    private String rival;

    /**
     * 传播手段
     * isNullAble:1
     */
    @Column(name = "means")
    private String means;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String getMeans() {
        return means;
    }

    public void setMeans(String means) {
        this.means = means;
    }

    @Override
    public String toString() {
        return "GoodsClass{" +
                "id=" + id +
                ", className='" + className + '\'' +
                ", object='" + object + '\'' +
                ", rival='" + rival + '\'' +
                ", means='" + means + '\'' +
                '}';
    }
}