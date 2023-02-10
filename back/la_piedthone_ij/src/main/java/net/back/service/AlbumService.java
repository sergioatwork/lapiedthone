package net.back.service;

import net.back.model.Album;
import net.back.utils.API;

import java.util.ArrayList;

public class AlbumService {
    public static ArrayList<Album> readAll() {
        ArrayList<Album> listAlbum = new ArrayList<Album>();
        listAlbum = API.getAlbumDB();

        return listAlbum;
    }
    public static Album readOne(int id) {
        Album album = new Album();
        if (id < 0 || id >= API.getAlbumDB().size()) {return null;}
        album = API.getAlbumDB().get(id);

        return album;
    }
    public static boolean addOne(Album newAlbum) {
        newAlbum.setId(API.incAlbumAutoIncrement());
        API.getAlbumDB().add(newAlbum.getId(), newAlbum);

        return true;
    }
    public static boolean updateOne(Album newAlbum) {
        API.getAlbumDB().set(newAlbum.getId(), newAlbum);

        return true;
    }
    public static boolean deleteOne(int id) {
        if (id < 0 || id >= API.getAlbumDB().size()) {return false;}
        API.getAlbumDB().remove(id);

        return true;
    }
}
