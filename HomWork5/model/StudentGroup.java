package HomWork5.model;

import java.util.List;
public class StudentGroup {
    private Teacher teacher;
    private List<Student> listStudents;

    public StudentGroup(Teacher teacher, List<Student> listStudents) {
        this.teacher = teacher;
        this.listStudents = listStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(List<Student> listStudents) {
        this.listStudents = listStudents;
    }
}