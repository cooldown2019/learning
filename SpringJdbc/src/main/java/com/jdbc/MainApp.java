package com.jdbc;

import com.jdbc.dao.StudentJDBCTemplate;
import com.jdbc.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
//        //创建学生
//        System.out.println("------Records Creation--------");
//        studentJDBCTemplate.create(5, "小明", 006151441);
//        studentJDBCTemplate.create(6, "Nuha", 244003144);
//        studentJDBCTemplate.create(7, "Ayan", 1599444);
//        System.out.println("------Listing Multiple Records--------");
        //添加学生，不想要设置主键id
        System.out.println("------add Records -------");
        studentJDBCTemplate.add("小明", 006151441);
        studentJDBCTemplate.add("Nuha", 244003144);
        studentJDBCTemplate.add("Ayan", 1599444);
        System.out.println("------Listing Multiple Records--------");
        //查询所有
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record : students) {
            System.out.print("ID : " + record.getId());
            System.out.print(", Name : " + record.getName());
            System.out.println(", Age : " + record.getqq());
        }
        //修改qq
        System.out.println("----Updating Record with ID = 2 -----");
        studentJDBCTemplate.update(2, 201908);
        System.out.println("----Listing Record with ID = 2 -----");
        Student student = studentJDBCTemplate.getStudent(2);
        System.out.print("ID : " + student.getId());
        System.out.print(", Name : " + student.getName());
        System.out.println(", Age : " + student.getqq());
        //删除
        System.out.println("----delete Record with ID = 3-----");
        studentJDBCTemplate.delete(3);
        System.out.println("----删除成功 -----");
    }
}
