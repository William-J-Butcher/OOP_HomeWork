package HomWork5.controller;

import HomWork5.model.Student;
import HomWork5.model.Teacher;
import HomWork5.service.StudentGroupService;
import HomWork5.view.StudentGroupView;

import java.util.List;

public class ControllerStudentGroup {
    StudentGroupService studentGroupService = new StudentGroupService();
    StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudentGroup(Teacher teacher, List<Student> listStudents) {
        studentGroupService.create(teacher, listStudents);
    }

    public void getStudents(){
        List<Student> studentList = studentGroupService.getStudentGroup().getListStudents();
        for(Student student : studentList){
            studentGroupView.printConsoleStudents(student);
        }
    }

    public void getTeacher(){
        Teacher teacher = studentGroupService.getStudentGroup().getTeacher();
        studentGroupView.printConsoleTeacher(teacher);
    }

}