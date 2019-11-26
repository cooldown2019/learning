package com.jdbc.dao;

import com.jdbc.mapper.StudentMapper;
import com.jdbc.pojo.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;

import javax.sql.DataSource;
import java.util.List;

public class StudentJDBCTemplate {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public int create(Integer id, String name, Integer qq) {
        String SQL = "insert into Student (id,name, qq ) values (?,?, ?)";
        jdbcTemplateObject.update(SQL, id, name, qq);
        System.out.println("Created Record id =" + id + " Name = " + name + " qq = " + qq);
        return id;
    }

    public int add(String name, Integer qq) {
        String SQL = "insert into Student (name, qq ) values (?, ?)";
        GeneratedKeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplateObject.update(SQL, name, qq,keyHolder);
        System.out.println("Created Record  Name = " + name + " qq = " + qq);
       int id = (int) keyHolder.getKey().longValue();
        return id;
    }

    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(SQL, new StudentMapper());
        return students;
    }

    public boolean delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        int flag = jdbcTemplateObject.update(SQL, id);
        System.out.println("Deleted Record with ID = " + id);
        return (flag > 0);
    }

    public boolean update(Integer id, Integer qq) {
        String SQL = "update Student set qq  = ? where id = ?";
        int flag = jdbcTemplateObject.update(SQL, qq, id);
        System.out.println("Updated Record with ID = " + id);
        return  (flag>0);
    }
}


