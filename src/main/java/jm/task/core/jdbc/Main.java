package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.dropUsersTable();
        userService.createUsersTable();
        userService.saveUser("Petr", "Proshin", (byte) 35);
        userService.saveUser("Viktor", "Lebedev", (byte) 19);
        userService.saveUser("Evgeniy", "Astapov", (byte) 41);
        System.out.println(userService.getAllUsers());
        userService.removeUserById(3);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        System.out.println(userService.getAllUsers());
        userService.createUsersTable();
        userService.dropUsersTable();
        userService.dropUsersTable();


    }
}
