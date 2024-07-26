package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Name1","a",(byte) 1);
        userService.saveUser("Name2","b",(byte) 2);
        userService.saveUser("Name3","c",(byte) 3);
        userService.saveUser("Name4","d",(byte) 4);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

