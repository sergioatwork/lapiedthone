package net.back.model;

// tab_album
public class Album {
    private static final String SQL_TABLE = "tab_album";
    private int id;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String note;            // note varchar(256) DEFAULT NULL
    private int idUser;             // id_user int(10) unsigned NOT NULL
    private int idRun;              //id_run int(10) unsigned DEFAULT NULL

    public Album() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
