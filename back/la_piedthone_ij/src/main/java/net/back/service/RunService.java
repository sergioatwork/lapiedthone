package net.back.service;

import net.back.model.Run;
import net.back.repository.RunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunService {
    @Autowired
    private RunRepository runRepo;

    public List<Run> readAll() {
        return runRepo.findAll();
    }
    public Run readOne(int runId) {
        return  runRepo.findById(runId).orElse(null);
    }
    public Run addOne(Run newRun) {
        // prévoir controle des infos du User
        runRepo.save(newRun);
        return newRun;
    }
    public Run updateOne(Run updateRun) {
        runRepo.save(updateRun);
        return updateRun;
    }
    public boolean deleteOne(int runId) {
        try {
            runRepo.deleteById(runId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
