package HomWork4.controller;

import HomWork4.data.Teacher;
import HomWork4.data.User;
import HomWork4.service.TeacherService;
import HomWork4.view.TeacherView;
import java.util.List;

//Принцип инверсии зависимостей (Dependency Inversion Principle)
public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;

    public TeacherController() {
        teacherService = new TeacherService();
        teacherView = new TeacherView();
    }

    public void createTeacher(User user, int teacherId) {
        teacherService.createTeacher(
                user.getFirstName(),
                user.getSecondName(),
                user.getPatronymic(),
                user.getDateOfBirth(),
                teacherId);
    }

    public void editTeacher(int index, Teacher teacher) {
        teacherService.editTeacher(index, teacher);
    }

    public void displayAllTeachers() {
        List<Teacher> teachersList = teacherService.getAllTeachers();
        teacherView.sendOnConsole(teachersList);
    }
}