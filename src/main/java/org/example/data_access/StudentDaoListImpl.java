package org.example.data_access;

import org.example.models.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoListImpl implements StudentDao{
    List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        return null;
    }

    @Override
    public Student find(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}