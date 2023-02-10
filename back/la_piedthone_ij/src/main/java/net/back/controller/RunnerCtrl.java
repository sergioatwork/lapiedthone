package net.back.controller;

import net.back.model.Runner;
import net.back.service.RunnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/runner")
public class RunnerCtrl {
    @Autowired
    private RunnerService runnerService;

    //http://localhost:8080/runner/read
    @GetMapping("/read")
    public List<Runner> readAllRunner() {
            System.out.println("/runner/read");
        return runnerService.readAll();
    }

    //http://localhost:8080/runner/readAllUser/id
    @GetMapping("/readAllUser/{runId}")
    public List<Runner> readAllUser(@PathVariable("runId") int runId) {
            System.out.println("/runner/readAllUser/" + runId);
        return runnerService.readAllUser(runId);
    }

    //http://localhost:8080/runner/readAllRun/id
    @GetMapping("/readAllRun/{userId}")
    public List<Runner> readAllRun(@PathVariable("userId") int userId) {
            System.out.println("/runner/readAllUser/" + userId);
        return runnerService.readAllRun(userId);
    }

    //http://localhost:8080/runner/read/userId/runId
    @GetMapping("/read/{userId}/{runId}")
    public Runner readRunner(@PathVariable("userId") int userId, @PathVariable("runId") int runId) {
            System.out.println("/runner/read/" + userId + "/" + runId);
        // Récupérer le Runner avec les id userId + runId dans la DB
        return runnerService.readOne(userId, runId);
    }

    //http://localhost:8080/runner/create
    @PostMapping("/create")
    public boolean createRunner(@RequestBody Runner newRunner) {
            System.out.println("/runner/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newRunner != null) {
            return runnerService.addOne(newRunner) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    //http://localhost:8080/runner/update
    @PutMapping("/update")
    public boolean updateRunner(@RequestBody Runner updateRunner) {
            System.out.println("/runner/update");
        if (updateRunner != null) {
            return runnerService.updateOne(updateRunner) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    //http://localhost:8080/runner/delete/id
    @DeleteMapping("/delete/{userId}/{runId}")
    public boolean deleteRunner(@PathVariable("userId") int userId, @PathVariable("runId") int runId) {
            System.out.println("/runner/delete/" + userId + "/" + runId);
        return runnerService.deleteOne(userId, runId);
    }
}
