package HomWork5.service;

import HomWork5.model.Student;
import HomWork5.model.Teacher;
import HomWork5.model.Type;
import HomWork5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    public List<User> userList = new ArrayList<>();

    public void create(String lastName, String firstName, String secondName, Type type){
        int id = getFreeID(type);
        if(Type.STUDENT == type){
            Student student = new Student(lastName, firstName, secondName, id);
            userList.add(student);
        }
        if(Type.TEACHER == type){
            Teacher teacher = new Teacher(lastName, firstName, secondName, id);
            userList.add(teacher);
        }
    }

    public User getUserID(Type type, int id){
        User resultUser = null;
        boolean itsStudent = Type.STUDENT == type;
        for(User user : userList){
            if(itsStudent && user instanceof Student && ((Student) user).getStudentID() == id){
                resultUser = user;
            }
            if(!itsStudent && user instanceof Teacher && ((Teacher) user).getTeacherID() == id){
                resultUser = user;
            }
        }
        return resultUser;
    }

    public List<User> getAllUsers(){
        return userList;
    }

    public List<Student> getStudentAll(){
        List<Student> resultList = new ArrayList<>();
        for(User user : userList){
            if(user instanceof Student){
                resultList.add((Student)user);
            }
        }
        return resultList;
    }

    private int getFreeID(Type type){
        int lastID = 1;
        boolean itsStudent = Type.STUDENT == type;
        for(User user : userList){
            if(itsStudent && user instanceof Student){
                lastID = ((Student) user). getStudentID() + 1;
            }
            if(!itsStudent && user instanceof Teacher){
                lastID = ((Teacher) user).getTeacherID() + 1;
            }
        }
        return lastID;
    }
}