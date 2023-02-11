package net.back.controller;

import net.back.model.Album;
import net.back.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/album")
public class AlbumCtrl {
    @Autowired
    private AlbumService albumService;
    Album album = new Album();

    // http://localhost:8080/album/read
    @GetMapping("/read")
    public List<Album> readAllAlbum() {
            System.out.println("/album/read");
        return albumService.readAll();
    }

    // http://localhost:8080/album/read/albumId
    @GetMapping("/read/{albumId}")
    public Album readAlbum(@PathVariable("albumId") int albumId) {
            System.out.println("/album/read/" + albumId);
        // Récupérer le Album avec l'albumId dans la DB
        return albumService.readOne(albumId);
    }

    // http://localhost:8080/album/create
    @PostMapping("/create")
    public boolean createAlbum(@RequestBody Album newAlbum) {
            System.out.println("/album/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newAlbum != null) {
            newAlbum.setAlbumId(0);
            return albumService.addOne(newAlbum) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    // http://localhost:8080/album/update
    @PutMapping("/update")
    public boolean updateAlbum(@RequestBody Album updateAlbum) {
            System.out.println("/album/update");
        if (updateAlbum != null) {
            return albumService.updateOne(updateAlbum) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    // http://localhost:8080/album/delete/albumId
    @DeleteMapping("/delete/{albumId}")
    public boolean deleteAlbum(@PathVariable("albumId") int albumId) {
            System.out.println("/album/delete/" + albumId);
        return albumService.deleteOne(albumId);
    }
}
