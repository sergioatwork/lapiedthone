package net.back.service;

import net.back.model.Photo;
import net.back.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhotoService {
    @Autowired
    private PhotoRepository photoRepo;

    public List<Photo> readAll() {
        return photoRepo.findAll();
    }
    public Photo readOne(int photoId) {
        return  photoRepo.findById(photoId).orElse(null);
    }
    public Photo addOne(Photo newPhoto) {
        // prévoir controle des infos du User
        photoRepo.save(newPhoto);
        return newPhoto;
    }
    public Photo updateOne(Photo updatePhoto) {
        photoRepo.save(updatePhoto);
        return updatePhoto;
    }
    public boolean deleteOne(int photoId) {
        try {
            photoRepo.deleteById(photoId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
