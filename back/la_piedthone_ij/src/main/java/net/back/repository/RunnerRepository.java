package net.back.repository;

import net.back.model.Runner;
import net.back.model.RunnerPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RunnerRepository extends JpaRepository<Runner, RunnerPK> {
    List<Runner> findRunnersByUserId(int userId);
    List<Runner> findRunnersByRunId(int runId);
    Runner findRunnerByUserIdAndRunId(int userId, int runId);
}
