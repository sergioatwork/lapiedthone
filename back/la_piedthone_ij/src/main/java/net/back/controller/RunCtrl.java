package net.back.controller;

import net.back.model.Run;
import net.back.service.RunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/run")
public class RunCtrl {
    @Autowired
    private RunService runService;
    private Run run = new Run();

    // http://localhost:8080/run/read
    @GetMapping("/read")
    public List<Run> readAllRun() {
            System.out.println("/run/read");
        return runService.readAll();
    }

    // http://localhost:8080/run/read/runId
    @GetMapping("/read/{runId}")
    public Run readRun(@PathVariable("runId") int runId) {
            System.out.println("/run/read/" + runId);
        // Récupérer le Run avec l'runId dans la DB
        return runService.readOne(runId);
    }

    // http://localhost:8080/run/create
    @PostMapping("/create")
    public boolean createRun(@RequestBody Run newRun) {
            System.out.println("/run/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newRun != null) {
            newRun.setRunId(0);
            return runService.addOne(newRun) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    // http://localhost:8080/run/update
    @PutMapping("/update")
    public boolean updateRun(@RequestBody Run updateRun) {
            System.out.println("/run/update");
        if (updateRun != null) {
            return runService.updateOne(updateRun) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    // http://localhost:8080/run/delete/runId
    @DeleteMapping("/delete/{runId}")
    public boolean deleteRun(@PathVariable("runId") int runId) {
            System.out.println("/run/delete/" + runId);
        return runService.deleteOne(runId);
    }
}
