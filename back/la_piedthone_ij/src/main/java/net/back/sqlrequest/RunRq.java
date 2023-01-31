package net.back.sqlrequest;

import net.back.model.Run;
import net.back.utils.API;

import java.util.ArrayList;

public class RunRq {
    public static ArrayList<Run> readAll() {
        ArrayList<Run> listRun = new ArrayList<Run>();
        listRun = API.getRunDB();

        return listRun;
    }
    public static Run readOne(int id) {
        Run run = new Run();
        if (id < 0 || id >= API.getRunDB().size()) {return null;}
        run = API.getRunDB().get(id);

        return run;
    }
    public static boolean addOne(Run newRun) {
        newRun.setId(API.incRunAutoIncrement());
        API.getRunDB().add(newRun.getId(), newRun);

        return true;
    }
    public static boolean updateOne(Run newRun) {
        API.getRunDB().set(newRun.getId(), newRun);

        return true;
    }
    public static boolean deleteOne(int id) {
        if (id < 0 || id >= API.getRunDB().size()) {return false;}
        API.getRunDB().remove(id);

        return true;
    }
}
