package HomWork3;

import java.util.List;

public class StidentGroupService {
    private StudentsGroup studentsGroup;
    public StidentGroupService(StudentsGroup studentsGroup){
        this.studentsGroup = studentsGroup;
    }
    public  StidentGroupService(){
        this.studentsGroup = new StudentsGroup();
    }

    public  StudentsGroup getStudentsGroup(){
        return studentsGroup;
    }
    public void setStudentsGroup(StudentsGroup studentsGroup){
        this.studentsGroup = studentsGroup;
    }

    public boolean removeStudent(String firstName, String secondName, String lastName){
        Student removeStudent = new Student(null, firstName, secondName, lastName);
        if (studentsGroup.getStudentsList() == null) return false;
        List<Student> studentList = studentsGroup.getStudentsList();
        for (Student student: studentList){
             if (student.equals(removeStudent)){
                 studentList.remove(student);
                 return true;
             }

        }
        return false;
    }
}
