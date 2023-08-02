package HomWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>{
    private List<Student> studentsList;
    public StudentsGroup(){
        studentsList = new ArrayList<>();
    }
    public StudentsGroup(List<Student> students){
        setStudentsList(students);
    }
    public void addStudent(Student student){
        if (studentsList != null) {
            studentsList.add(student);
        }
    }

    public List<Student> getStudentsList(){
        return studentsList;
    }
    public void setStudentsList(List<Student> students){
        this.studentsList = students;
    }

    @Override
    public String toString() {
        return "StudentsGroup{" +
                "students=" + studentsList +
                '}';
    }

    @Override
    public StudentsGroupIterator iterator() {
        return new StudentsGroupIterator(this);
    }
}
