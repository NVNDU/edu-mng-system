package lk.dreamj.edumanage.database;

import lk.dreamj.edumanage.model.User;

import java.util.ArrayList;

public class Database {
    public static ArrayList<User> userTable = new ArrayList<>();

    static {
        userTable.add(
                new User(
                "s001","Navindu","Ranjuka","n@gmail.com","1234"
            )
        );
    }

}
