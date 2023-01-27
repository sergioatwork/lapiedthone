package net.back.controller;

import net.back.model.Runner;
import net.back.model.User;
import net.back.model.Run;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/runner")
public class RunnerCtrl {

    Runner runner = new Runner();
    User user = new User();
    Run run = new Run();

    //http://localhost:8080/runner/create
    @PostMapping("/create")
    public boolean createRunner(@RequestBody Runner newRunner) {
        System.out.println("/runner/create");

        runner = newRunner;
        // si OK, enregistrement du Runner dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/runner/read/idUser/idRun
    @GetMapping("/read/{idUser}/{idRun}")
    public Runner readRunner(@PathVariable("idUser") int idUser, @PathVariable("idRun") int idRun) {
        System.out.println("/runner/read/" + idUser + "/" + idRun);

        // Récupérer le Runner avec les id idUser + idRun dans la DB

        return runner;
    }

    //http://localhost:8080/runner/readAllUser/id
    @GetMapping("/readAllUser/{idRun}")
    public ArrayList<User> readAllUser(@PathVariable("idRun") int idRun) {
        System.out.println("/runner/readAllRun/" + idRun);

        ArrayList<User> listUser = new ArrayList<User>();
        // Récupérer tout les Run d'un User avec l'id dans la DB
        listUser.add(user);

        return listUser;
    }

    //http://localhost:8080/runner/readAllRun/id
    @GetMapping("/readAllRun/{idUser}")
    public ArrayList<Run> readAllRun(@PathVariable("idUser") int idUser) {
        System.out.println("/runner/readAllRun/" + idUser);

        ArrayList<Run> listRun = new ArrayList<Run>();
        // Récupérer les User d'un Run avec l'id dans la DB
        listRun.add(run);

        return listRun;
    }

    //http://localhost:8080/runner/read
    @GetMapping("/read")
    public ArrayList<Runner> readAllRunner() {
        System.out.println("/runner/read");

        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        // Récupérer l'ensemble des Runner dans la DB
        listRunner.add(runner);

        // renvoyer une liste de Runner
        return listRunner;
    }

    //http://localhost:8080/runner/update
    @PostMapping("/update")
    public boolean updateRunner(@RequestBody Runner updateRunner) {
        System.out.println("/runner/update");

        runner = updateRunner;
        // si OK, enregistrement du Runner dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/runner/delete/id
    @GetMapping("/delete/{idUser}/{idRun}")
    public boolean deleteRunner(@PathVariable("idUser") int idUser, @PathVariable("idRun") int idRun) {
        System.out.println("/runner/delete/" + idUser + "/" + idRun);

        // si OK, suppression du Runner dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

}
