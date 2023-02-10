package net.back.service;

import net.back.model.Runner;
import net.back.model.RunnerPK;
import net.back.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunnerService {
    @Autowired
    private RunnerRepository runnerRepo;

    public List<Runner> readAll() {
        return runnerRepo.findAll();
    }
    public List<Runner> readAllUser(int runId) {
        return runnerRepo.findRunnersByRunId(runId);
    }
    public List<Runner> readAllRun(int userId) {
        return runnerRepo.findRunnersByUserId(userId);
    }
    public Runner readOne(int userId, int runId) {
//        RunnerPK runnerPK = new RunnerPK(userId, runId);
//        return runnerRepo.findById(runnerPK).orElse(null);
        return runnerRepo.findRunnerByUserIdAndRunId(userId, runId);
    }
    public Runner addOne(Runner newRunner) {
// prévoir controle des infos du User
        runnerRepo.save(newRunner);
        return newRunner;
    }
    public Runner updateOne(Runner updateRunner) {
        runnerRepo.save(updateRunner);
        return updateRunner;
    }
    public boolean deleteOne(int userId, int runId) {
        RunnerPK runnerPK = new RunnerPK(userId, runId);
        try {
            runnerRepo.deleteById(runnerPK);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
