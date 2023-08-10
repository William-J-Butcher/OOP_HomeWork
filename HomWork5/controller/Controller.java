package HomWork5.controller;

import HomWork5.model.Student;
import HomWork5.model.Type;
import HomWork5.service.DataService;
import HomWork5.view.StudentView;

import java.util.List;

public class Controller {
    DataService dataService = new DataService();
    StudentView studentView = new StudentView();

    public void createStudent(String lastName, String firstName, String secondName){
        dataService.create(lastName, firstName, secondName, Type.STUDENT);
    }

    public void getAllStudent(){
        List<Student> studentList = dataService.getStudentAll();
        for(Student student : studentList){
            studentView.printConsole(student);
        }
    }
}