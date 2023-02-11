package net.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "tab_article")
public class Article {
    //    private static final String SQL_TABLE = "tab_article";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int articleId;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String title;           // title varchar(100) DEFAULT NULL
    private String note;            // note text DEFAULT NULL
    private int photoId;            // id_photo int(10) unsigned DEFAULT NULL
    private LocalDateTime startDate;         // start_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private LocalDateTime endDate;           // end_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'
    private boolean news;           // news tinyint(1) NOT NULL DEFAULT 0
    private int userId;             // id_user int(10) unsigned DEFAULT NULL
    private int runId;              // id_run int(10) unsigned DEFAULT NULL

    public Article() {
    }
    public Article(int articleId, String title, String note, int photoId, LocalDateTime startDate, LocalDateTime endDate, boolean news, int userId, int runId) {
        this.articleId = articleId;
        this.title = title;
        this.note = note;
        this.photoId = photoId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.news = news;
        this.userId = userId;
        this.runId = runId;
    }

    public int getArticleId() {return articleId;}
    public void setArticleId(int articleId) {this.articleId = articleId;}
    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}
    public int getPhotoId() {return photoId;}
    public void setPhotoId(int photoId) {this.photoId = photoId;}
    public LocalDateTime getStartDate() {return startDate;}
    public void setStartDate(LocalDateTime startDate) {this.startDate = startDate;}
    public LocalDateTime getEndDate() {return endDate;}
    public void setEndDate(LocalDateTime endDate) {this.endDate = endDate;}
    public boolean isNews() {return news;}
    public void setNews(boolean news) {this.news = news;}
    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public int getRunId() {return runId;}
    public void setRunId(int runId) {this.runId = runId;}
}
