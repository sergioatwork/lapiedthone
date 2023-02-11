package net.back.service;

import net.back.model.Album;
import net.back.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    @Autowired
    private AlbumRepository albumRepo;

    public List<Album> readAll() {
        return albumRepo.findAll();
    }
    public Album readOne(int albumId) {
        return  albumRepo.findById(albumId).orElse(null);
    }
    public Album addOne(Album newAlbum) {
        // prévoir controle des infos du User
        albumRepo.save(newAlbum);
        return newAlbum;
    }
    public Album updateOne(Album updateAlbum) {
        albumRepo.save(updateAlbum);
        return updateAlbum;
    }
    public boolean deleteOne(int albumId) {
        try {
            albumRepo.deleteById(albumId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
