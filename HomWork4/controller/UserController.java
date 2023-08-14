package HomWork4.controller;

import HomWork4.data.User;

import java.time.LocalDate;

// Принцип разделения интерфейсов (Interface Segregation Principle)
public class UserController implements IUserController{

    @Override
    public void create(String firstName, String surName, String lastName) {
        User newUser = new User(firstName,lastName,surName, LocalDate.now());
    }

    public void printConsole(User user) {

    }
}