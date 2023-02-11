package net.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_album")
public class Album {
//    private static final String SQL_TABLE = "tab_album";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int albumId;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String note;            // note varchar(256) DEFAULT NULL
    private int userId;             // id_user int(10) unsigned NOT NULL
    private int runId;              //id_run int(10) unsigned DEFAULT NULL

    public Album() {
    }
    public Album(int albumId, String note, int userId, int runId) {
        this.albumId = albumId;
        this.note = note;
        this.userId = userId;
        this.runId = runId;
    }

    public int getAlbumId() {return albumId;}
    public void setAlbumId(int albumId) {this.albumId = albumId;}
    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}
    public int getUserId() {return userId;}
    public void setUserId(int userId) {this.userId = userId;}
    public int getRunId() {return runId;}
    public void setRunId(int runId) {this.runId = runId;}
}
