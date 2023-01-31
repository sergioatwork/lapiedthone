package net.back.model;

import java.util.Date;

// tab_runner
public class Runner {
    private static final String SQL_TABLE = "tab_runner";
    private int idUser;             // id_user int(10) unsigned NOT NULL
    private int idRun;              // id_run int(10) unsigned NOT NULL
    private int contribution;       // contribution int(10) unsigned NOT NULL DEFAULT 0
    private int km;                 // km int(10) unsigned NOT NULL DEFAULT 0
    private Date startDate;// start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private Date endDate;// end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'

    public Runner() {
    }

    public Runner(int idUser, int idRun, int contribution, int km, Date startDate, Date endDate) {
        this.idUser = idUser;
        this.idRun = idRun;
        this.contribution = contribution;
        this.km = km;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getIdRun() {
        return idRun;
    }

    public void setIdRun(int idRun) {
        this.idRun = idRun;
    }

    public int getContribution() {
        return contribution;
    }

    public void setContribution(int contribution) {
        this.contribution = contribution;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
