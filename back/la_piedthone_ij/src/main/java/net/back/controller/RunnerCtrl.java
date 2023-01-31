package net.back.controller;

import net.back.model.Runner;
import net.back.model.User;
import net.back.model.Run;
import net.back.sqlrequest.RunnerRq;
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
        if (true) {return RunnerRq.addOne(runner);}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/runner/read/idUser/idRun
    @GetMapping("/read/{idUser}/{idRun}")
    public Runner readRunner(@PathVariable("idUser") int idUser, @PathVariable("idRun") int idRun) {
        System.out.println("/runner/read/" + idUser + "/" + idRun);

        // Récupérer le Runner avec les id idUser + idRun dans la DB
        runner = RunnerRq.readOne(idUser, idRun);

        return runner;
    }

    //http://localhost:8080/runner/readAllUser/id
    @GetMapping("/readAllUser/{idRun}")
    public ArrayList<Runner> readAllUser(@PathVariable("idRun") int idRun) {
        System.out.println("/runner/readAllUser/" + idRun);

        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        // Récupérer tout les Run d'un User avec l'id dans la DB
        listRunner = RunnerRq.readAllUser(idRun);

        return listRunner;
    }

    //http://localhost:8080/runner/readAllRun/id
    @GetMapping("/readAllRun/{idUser}")
    public ArrayList<Runner> readAllRun(@PathVariable("idUser") int idUser) {
        System.out.println("/runner/readAllUser/" + idUser);

        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        // Récupérer tout les Run d'un User avec l'id dans la DB
        listRunner = RunnerRq.readAllRun(idUser);

        return listRunner;
    }

    //http://localhost:8080/runner/read
    @GetMapping("/read")
    public ArrayList<Runner> readAllRunner() {
        System.out.println("/runner/read");

        ArrayList<Runner> listRunner = new ArrayList<Runner>();
        // Récupérer l'ensemble des Runner dans la DB
        listRunner = RunnerRq.readAll();

        return listRunner;
    }

    //http://localhost:8080/runner/update
    @PutMapping("/update")
    public boolean updateRunner(@RequestBody Runner updateRunner) {
        System.out.println("/runner/update");

        runner = updateRunner;
        // si OK, enregistrement du Runner dans la DB et retour TRUE
        if (true) {return RunnerRq.updateOne(runner);}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/runner/delete/id
    @DeleteMapping("/delete/{idUser}/{idRun}")
    public boolean deleteRunner(@PathVariable("idUser") int idUser, @PathVariable("idRun") int idRun) {
        System.out.println("/runner/delete/" + idUser + "/" + idRun);

        return RunnerRq.deleteOne(idUser, idRun);
    }

}
