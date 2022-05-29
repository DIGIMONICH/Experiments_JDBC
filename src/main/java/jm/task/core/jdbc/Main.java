package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl user = new UserDaoJDBCImpl();
        user.createUsersTable();
        user.saveUser("Timofei", "Nickishenko", (byte) 29);
        user.saveUser("Lev", "Kazancev", (byte) 20);
        user.saveUser("Petr", "Proshin", (byte) 38);
        user.saveUser("Viktoria", "Sidorova", (byte) 22);
        System.out.println(user.getAllUsers());
        user.cleanUsersTable();
        user.dropUsersTable();
    }
}
