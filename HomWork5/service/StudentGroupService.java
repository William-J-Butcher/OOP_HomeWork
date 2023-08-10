package HomWork5.service;

import HomWork5.model.Student;
import HomWork5.model.StudentGroup;
import HomWork5.model.Teacher;

import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;
    public void create(Teacher teacher, List<Student> listStudents){
        studentGroup = new StudentGroup(teacher, listStudents);
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}