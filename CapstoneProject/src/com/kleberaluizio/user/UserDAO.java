package com.kleberaluizio.user;

import com.kleberaluizio.Database;

public class UserDAO {
    public static void saveUser(User user, Database database){
        database.setUsers(user);
    }
}
