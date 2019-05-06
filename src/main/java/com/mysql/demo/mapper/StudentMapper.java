package com.mysql.demo.mapper;

import com.mysql.demo.pojo.Student;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * StudentMapper继承基类
 */
@Repository
public interface StudentMapper extends MyBatisBaseDao<Student, Integer> {
}