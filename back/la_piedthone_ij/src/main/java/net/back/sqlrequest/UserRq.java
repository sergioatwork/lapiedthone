package net.back.sqlrequest;

import net.back.model.User;
import net.back.utils.API;

import java.util.ArrayList;

public class UserRq {
    public static ArrayList<User> readAll() {
        ArrayList<User> listUser = new ArrayList<User>();
        listUser = API.getUserDB();

        return listUser;
    }
    public static User readOne(int id) {
        User user = new User();
        if (id < 0 || id >= API.getUserDB().size()) {return null;}
        user = API.getUserDB().get(id);

        return user;
    }
    public static boolean addOne(User newUser) {
        newUser.setId(API.incUserAutoIncrement());
        API.getUserDB().add(newUser.getId(), newUser);

        return true;
    }
    public static boolean updateOne(User newUser) {
        API.getUserDB().set(newUser.getId(), newUser);

        return true;
    }
    public static boolean deleteOne(int id) {
        if (id < 0 || id >= API.getUserDB().size()) {return false;}
        API.getUserDB().remove(id);

        return true;
    }
}
