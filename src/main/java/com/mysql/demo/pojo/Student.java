package com.mysql.demo.pojo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * student
 * @author 
 */
@Table(name="student")
public class Student implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue
    @GeneratedValue(generator = "JDBC")
    private Integer studentId;

    /**
     * 姓名
     */
    @NotEmpty
    private String name;

    /**
     * 年龄
     */
    @NotEmpty
    private Integer age;

    /**
     * 性别
     */
    @NotEmpty
    private String sex;

    /**
     * 年级
     */
    @NotEmpty
    private Integer grade;

    /**
     * 家庭地址
     */
    private String homeAddress;

    /**
     * 电话
     */
    private String phone;

    private static final long serialVersionUID = 1L;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}