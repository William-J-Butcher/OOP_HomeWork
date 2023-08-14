package HomWork4.controller;
import HomWork4.data.User;

// Принцип разделения интерфейсов (Interface Segregation Principle)
public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}