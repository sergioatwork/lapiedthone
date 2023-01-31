package net.back.model;

import java.util.Date;

// tab_run
public class Run {
    private static final String SQL_TABLE = "tab_run";
    private int id;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String name;            // name varchar(50) DEFAULT NULL
    private char type;              // type char(1) NOT NULL DEFAULT 'p' COMMENT 'p : présentielle, v : virtuelle'
    private String description;     // description text DEFAULT NULL
    private Date startDate;         // start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private Date endDate;           // end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'

    public Run() {
    }

    public Run(int id, String name, char type, String description, Date startDate, Date endDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
