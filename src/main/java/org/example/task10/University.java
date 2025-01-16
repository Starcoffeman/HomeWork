package org.example.task10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {

    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        return students;
    }

    public List<Student> filterByGrade(double grade) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() >= grade) {
                result.add(student);
            }
        }
        return result;
    }
}
