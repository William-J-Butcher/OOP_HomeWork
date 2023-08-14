package HomWork4.view;

import HomWork4.data.Student;

import java.util.List;

// Принцип единственной ответственности (Single Responsibility Principle)
public class StudentView implements UserView<Student>{
    @Override
    public void sendOnConsole(List<Student> listT) {
        System.out.println("Список студентов");
        for (Student student: listT) {
            System.out.println(student.getStudentId());
        }
    }
}