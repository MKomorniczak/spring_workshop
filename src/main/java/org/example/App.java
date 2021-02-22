package org.example;


import org.config.AppConfig;
import org.example.data_access.StudentDao;
import org.example.models.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao dao = context.getBean("studentDao", StudentDao.class);

        Student createdStudent = dao.save(new Student("Marek"));
        System.out.println(createdStudent);
    }
}
