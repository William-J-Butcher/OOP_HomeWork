package HomWork4.controller;
import HomWork4.data.User;

public interface IUserController<T extends User> {
    void create(String firstName, String surName, String lastName);
}