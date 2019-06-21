package com.gzmu.springboot_project.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @className: User
 * @author: 冫soul丶
 * @version: 1.0
 * @date: created in 上午12:37 19-6-22
 * @modified:
 */
@Data
@Entity
@Table(name = "user")
public class User implements Serializable {
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
     * 用户名
     * isNullAble:1
     */
    @Column(name = "username")
    private String username;

    /**
     * 密码
     * isNullAble:1
     */
    @Column(name = "userpwd")
    private String userpwd;

    /**
     * 邮箱
     * isNullAble:1
     */
    @Column(name = "email")
    private String email;

    /**
     * 创建日期
     * isNullAble:1
     */
    @Column(name = "createdate")
    private Date createdate;

    /**
     * 状态
     * isNullAble:1
     */
    @Column(name = "userstatus")
    private Integer userstatus;

    /**
     * 角色
     * isNullAble:1
     */
    @Column(name = "role")
    private Integer role;
}
