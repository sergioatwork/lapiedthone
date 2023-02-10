package net.back.service;

import net.back.model.Photo;
import net.back.utils.API;

import java.util.ArrayList;

public class PhotoService {
    public static ArrayList<Photo> readAll() {
        ArrayList<Photo> listPhoto = new ArrayList<Photo>();
        listPhoto = API.getPhotoDB();

        return listPhoto;
    }
    public static Photo readOne(int id) {
        Photo photo = new Photo();
        if (id < 0 || id >= API.getPhotoDB().size()) {return null;}
        photo = API.getPhotoDB().get(id);

        return photo;
    }
    public static boolean addOne(Photo newPhoto) {
        newPhoto.setId(API.incPhotoAutoIncrement());
        API.getPhotoDB().add(newPhoto.getId(), newPhoto);

        return true;
    }
    public static boolean updateOne(Photo newPhoto) {
        API.getPhotoDB().set(newPhoto.getId(), newPhoto);

        return true;
    }
    public static boolean deleteOne(int id) {
        if (id < 0 || id >= API.getPhotoDB().size()) {return false;}
        API.getPhotoDB().remove(id);

        return true;
    }
}
