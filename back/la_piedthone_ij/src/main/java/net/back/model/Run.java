package net.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tab_run")
public class Run {
//    private static final String SQL_TABLE = "tab_run";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int runId;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String name;            // name varchar(50) DEFAULT NULL
    private char type;              // type char(1) NOT NULL DEFAULT 'p' COMMENT 'p : présentielle, v : virtuelle'
    private String description;     // description text DEFAULT NULL
    private LocalDateTime startDate;         // start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private LocalDateTime endDate;           // end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'

    @OneToMany(mappedBy = "runId", fetch = FetchType.LAZY)
    private List<Runner> runner;

    public Run() {
    }
    public Run(int runId, String name, char type, String description, LocalDateTime startDate, LocalDateTime endDate) {
        this.runId = runId;
        this.name = name;
        this.type = type;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getRunId() {return runId;}
    public void setRunId(int runId) {this.runId = runId;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public char getType() {return type;}
    public void setType(char type) {this.type = type;}
    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public LocalDateTime getStartDate() {return startDate;}
    public void setStartDate(LocalDateTime startDate) {this.startDate = startDate;}
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public List<Runner> getRunner() {return runner;}
}
