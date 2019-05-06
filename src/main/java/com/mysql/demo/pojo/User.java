package com.mysql.demo.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * user
 * @author 
 */
@Table(name="user")
public class User implements Serializable {
    /**
     * 用户id
     */
    @Id
    @GeneratedValue
    private Integer id;

    /**
     * 用户名
     */
    @NotEmpty
    private String userName;

    /**
     * 密码
     */
    @NotEmpty
    private String password;

    /**
     * 创建时间
     */
    @NotEmpty
    private Date createdDate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}