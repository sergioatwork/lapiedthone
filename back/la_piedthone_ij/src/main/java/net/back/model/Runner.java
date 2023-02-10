package net.back.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tab_runner")
@IdClass(RunnerPK.class)
public class Runner {
//    private static final String SQL_TABLE = "tab_runner";

//    @EmbeddedId
//    private RunnerPK runnerId;

    @Id
    @Column(name = "user_id", nullable = false)
    private int userId;             // id_user int(10) unsigned NOT NULL
    @Id
    @Column(name = "run_id", nullable = false)
    private int runId;              // id_run int(10) unsigned NOT NULL

//    @MapsId("userId")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private User user;
//    @MapsId("runId")
//    @ManyToOne(fetch = FetchType.LAZY)
//    private Run run;



//    @ManyToOne(fetch = FetchType.LAZY)      // 1 Runner as 1 User
//    @JoinColumn(name = "userId", referencedColumnName = "userId")
//    private User user;
//    @ManyToOne(fetch = FetchType.LAZY)      // 1 Runner as 1 Run
//    @JoinColumn(name = "runId()", referencedColumnName = "runId")
//    private Run run;


    private int contribution;       // contribution int(10) unsigned NOT NULL DEFAULT 0
    private int km;                 // km int(10) unsigned NOT NULL DEFAULT 0
    private LocalDateTime startDate;         // start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private LocalDateTime endDate;           // end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'

    public Runner() {
    }
//    public Runner(RunnerPK runnerId, int contribution, int km, LocalDateTime startDate, LocalDateTime endDate) {
//        this.runnerId = runnerId;
//        this.contribution = contribution;
//        this.km = km;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }
    public Runner(int userId, int runId, int contribution, int km, LocalDateTime startDate, LocalDateTime endDate) {
//        this.runnerId = new RunnerPK(userId, runId);
        this.userId = userId;
        this.runId = runId;
        this.contribution = contribution;
        this.km = km;
        this.startDate = startDate;
        this.endDate = endDate;
    }

//    public RunnerPK getRunnerId() {return runnerId;}
//    public void setRunnerId(RunnerPK runnerId) {this.runnerId = runnerId;}

    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public int getRunId() {return runId;}
    public void setRunId(int runId) {this.runId = runId;}
    public int getContribution() {return contribution;}
    public void setContribution(int contribution) {this.contribution = contribution;}
    public int getKm() {return km;}
    public void setKm(int km) {this.km = km;}
    public LocalDateTime getStartDate() {return startDate;}
    public void setStartDate(LocalDateTime startDate) {this.startDate = startDate;}
    public LocalDateTime getEndDate() {return endDate;}
    public void setEndDate(LocalDateTime endDate) {this.endDate = endDate;}
}
