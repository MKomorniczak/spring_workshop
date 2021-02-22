package org.example.data_access;

import org.example.models.Student;
import org.example.sequencer.StudentSequencer;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoListImpl implements StudentDao{
    List<Student> students = new ArrayList<>();

    @Override
    public Student save(Student student) {
        if (student.getId() == 0){
            student.setId(StudentSequencer.nextStudentId());
            students.add(student);
        }
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
