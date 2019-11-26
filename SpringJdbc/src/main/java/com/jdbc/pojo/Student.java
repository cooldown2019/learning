package com.jdbc.pojo;

public class Student {
    private Integer qq;
    private String name;
    private Integer id;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + qq +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    public void setAge(Integer age) {
        this.qq  = age;
    }

    public Integer getqq() {
        return qq ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}