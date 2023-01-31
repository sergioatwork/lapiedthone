package net.back.sqlrequest;

import net.back.model.Runner;
import net.back.utils.API;

import java.util.ArrayList;

public class RunnerRq {
    public static ArrayList<Runner> readAll() {
        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        listRunner = API.getRunnerDB();

        return listRunner;
    }
    public static ArrayList<Runner> readAllUser(int idRun) {
        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        if (idRun < 0 || idRun >= API.getRunDB().size()) {return null;}
        for (Runner runner : API.getRunnerDB()) {
            if (runner.getIdRun() == idRun) {listRunner.add(runner);}
        }

        return listRunner;
    }
    public static ArrayList<Runner> readAllRun(int idUser) {
        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        if (idUser < 0 || idUser >= API.getUserDB().size()) {return null;}
        for (Runner runner : API.getRunnerDB()) {
            if (runner.getIdUser() == idUser) {listRunner.add(runner);}
        }

        return listRunner;
    }
    public static Runner readOne(int idUser, int idRun) {
        Runner runner = new Runner();
        runner = null;
        if ((idRun < 0 || idRun >= API.getRunDB().size()) || idUser < 0 || idUser >= API.getUserDB().size()) {return null;}
        for (Runner runnerInList : API.getRunnerDB()) {
            if (runnerInList.getIdUser() == idUser && runnerInList.getIdRun() == idRun) {
                runner = runnerInList;
                break;
            }
        }

        return runner;
    }
    public static boolean addOne(Runner newRunner) {
        API.getRunnerDB().add(newRunner);

        return true;
    }
    public static boolean updateOne(Runner newRunner) {
        for (int id = 0; id < API.getRunnerDB().size(); id++) {
            if (API.getRunnerDB().get(id).getIdUser() == newRunner.getIdUser()
                && API.getRunnerDB().get(id).getIdRun() == newRunner.getIdRun()) {
                API.getRunnerDB().set(id, newRunner);
                return true;
            }
        }

        return true;
    }
    public static boolean deleteOne(int idUser, int idRun) {
        if ((idRun < 0 || idRun >= API.getRunDB().size()) || idUser < 0 || idUser >= API.getUserDB().size()) {return false;}
        for (int id = 0; id < API.getRunnerDB().size(); id++) {
            if (API.getRunnerDB().get(id).getIdUser() == idUser && API.getRunnerDB().get(id).getIdRun() == idRun) {
                API.getRunnerDB().remove(id);
                return true;
            }
        }

        return false;
    }
}
