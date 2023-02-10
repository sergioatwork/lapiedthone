package net.back.model;

import jakarta.persistence.*;

import java.io.Serializable;

//@Embeddable
public class RunnerPK implements Serializable {

    @Column(name = "user_id", nullable = false)
    private int userId;             // id_user int(10) unsigned NOT NULL
    @Column(name = "run_id", nullable = false)
    private int runId;              // id_run int(10) unsigned NOT NULL

    public RunnerPK() {
    }
    public RunnerPK(int userId, int runId) {
        this.userId = userId;
        this.runId = runId;
    }

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public int getRunId() {return runId;}
    public void setRunId(int runId) {this.runId = runId;}
}
