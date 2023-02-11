package net.back.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tab_photo")
public class Photo {
//    private static final String SQL_TABLE = "tab_photo";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int photoId;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String note;            // note varchar(256) DEFAULT NULL
    private String file;            // file varchar(256) DEFAULT NULL
    private int albumId;            // id_album int(10) unsigned NOT NULL

    public Photo() {
    }
    public Photo(int photoId, String note, String file, int albumId) {
        this.photoId = photoId;
        this.note = note;
        this.file = file;
        this.albumId = albumId;
    }

    public int getPhotoId() {return photoId;}
    public void setPhotoId(int photoId) {this.photoId = photoId;}
    public String getNote() {return note;}
    public void setNote(String note) {this.note = note;}
    public String getFile() {return file;}
    public void setFile(String file) {this.file = file;}
    public int getAlbumId() {return albumId;}
    public void setAlbumId(int albumId) {this.albumId = albumId;}
}
