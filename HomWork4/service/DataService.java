package HomWork4.service;

import HomWork4.data.Student;
import HomWork4.data.User;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Принцип единственной ответственности (Single Responsibility Principle)
public class DataService {

    private final List<User> users;

    public DataService() {
        this.users = new ArrayList<>();
    }

    public List<User> getAll(){
        return this.users;
    }

    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        Long countMaxId = 0L;
        for (User user: this.users){
            if(user instanceof Student){
                if (((Student) user).getStudentId() > countMaxId){
                    countMaxId = ((Student) user).getStudentId();
                }
            }
        }
        countMaxId++;

        Student student = new Student(firstName, secondName, patronymic, dateOfBirth, countMaxId);
        this.users.add(student);
    }
}