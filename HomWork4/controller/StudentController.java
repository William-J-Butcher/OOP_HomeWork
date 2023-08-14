package HomWork4.controller;

import HomWork4.data.Student;
import HomWork4.data.User;
import HomWork4.view.StudentView;
import HomWork4.view.UserView;

import java.util.List;
import java.time.LocalDate;

// Реализация принципа единственной ответственности (Single Responsibility Principle)
public class StudentController implements IUserController{

    private UserView studentsView = new StudentView();

    @Override
    public void create(String firstName, String surName, String lastName) {
        Student newStudent = new Student(firstName,lastName,surName, LocalDate.now());
    }

    public void printConsole(List<Student> students) {
        studentsView.sendOnConsole(students);
    }
}