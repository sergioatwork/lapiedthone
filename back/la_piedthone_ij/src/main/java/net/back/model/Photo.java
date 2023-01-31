package net.back.model;

// tab_photo
public class Photo {
    private static final String SQL_TABLE = "tab_photo";
    private int id;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String note;            // note varchar(256) DEFAULT NULL
    private String file;            // file varchar(256) DEFAULT NULL
    private int idAlbum;            // id_album int(10) unsigned NOT NULL

    public Photo() {
    }
    public Photo(int id, String note, String file, int idAlbum) {
        this.id = id;
        this.note = note;
        this.file = file;
        this.idAlbum = idAlbum;
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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }
}
