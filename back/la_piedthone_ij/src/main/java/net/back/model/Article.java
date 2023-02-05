package net.back.model;

import java.time.LocalDateTime;

// tab_article
public class Article {
    private static final String SQL_TABLE = "tab_article";
    private int id;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String title;           // title varchar(100) DEFAULT NULL
    private String note;            // note text DEFAULT NULL
    private int idPhoto;            // id_photo int(10) unsigned DEFAULT NULL
    private LocalDateTime startDate;         // start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private LocalDateTime endDate;           // end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'
    private boolean news;           // news tinyint(1) NOT NULL DEFAULT 0
    private int idUser;             // id_user int(10) unsigned DEFAULT NULL
    private int idRun;              // id_run int(10) unsigned DEFAULT NULL

    public Article() {
    }
    public Article(int id, String title, String note, int idPhoto, LocalDateTime startDate, LocalDateTime endDate, boolean news, int idUser, int idRun) {
        this.id = id;
        this.title = title;
        this.note = note;
        this.idPhoto = idPhoto;
        this.startDate = startDate;
        this.endDate = endDate;
        this.news = news;
        this.idUser = idUser;
        this.idRun = idRun;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}
    public int getIdPhoto() {return idPhoto;}
    public void setIdPhoto(int idPhoto) {this.idPhoto = idPhoto;}
    public LocalDateTime getStartDate() {return startDate;}
    public void setStartDate(LocalDateTime  startDate) {this.startDate = startDate;}
    public LocalDateTime getEndDate() {
        return endDate;
    }
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }
    public boolean isNews() {
        return news;
    }
    public void setNews(boolean news) {
        this.news = news;
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
}
