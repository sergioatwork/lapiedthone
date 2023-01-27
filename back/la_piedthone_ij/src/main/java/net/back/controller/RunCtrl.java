package net.back.controller;

import net.back.model.Run;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/run")
public class RunCtrl {
    Run run = new Run();

    //http://localhost:8080/run/create
    @PostMapping("/create")
    public boolean createRun(@RequestBody Run newRun) {
        System.out.println("/run/create");

        run = newRun;
        // si OK, enregistrement du Run dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/run/read/id
    @GetMapping("/read/{id}")
    public Run readRun(@PathVariable("id") int id) {
        System.out.println("/run/read/" + id);

        // Récupérer le Run avec l'id dans la DB

        return run;
    }

    //http://localhost:8080/run/read
    @GetMapping("/read")
    public ArrayList<Run> readAllRun() {
        System.out.println("/run/read");

        ArrayList<Run> listRun = new ArrayList<Run>();
        // Récupérer l'ensemble des Run dans la DB
        listRun.add(run);

        // renvoyer une liste de Run
        return listRun;
    }

    //http://localhost:8080/run/update
    @PostMapping("/update")
    public boolean updateRun(@RequestBody Run updateRun) {
        System.out.println("/run/update");

        run = updateRun;
        // si OK, enregistrement du Run dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/run/delete/id
    @GetMapping("/delete/{id}")
    public boolean deleteRun(@PathVariable("id") int id) {
        System.out.println("/run/delete/" + id);

        // si OK, suppression du Run dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

}
