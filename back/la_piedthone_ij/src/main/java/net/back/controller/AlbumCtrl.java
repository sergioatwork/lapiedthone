package net.back.controller;

import net.back.model.Album;
import net.back.service.AlbumService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/album")
public class AlbumCtrl {

    Album album = new Album();

    // http://localhost:8080/album/create
    @PostMapping("/create")
    public boolean createAlbum(@RequestBody Album newAlbum) {
        System.out.println("/album/create");

        album = newAlbum;
        // si OK, enregistrement du Album dans la DB et retour TRUE
        if (true) {return AlbumService.addOne(album);}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/album/read/id
    @GetMapping("/read/{id}")
    public Album readAlbum(@PathVariable("id") int id) {
        System.out.println("/album/read/" + id);

        // Récupérer le Album avec l'id dans la DB
        album = AlbumService.readOne(id);

        return album;
    }

    // http://localhost:8080/album/read
    @GetMapping("/read")
    public ArrayList<Album> readAllAlbum() {
        System.out.println("/album/read");

        ArrayList<Album> listAlbum = new ArrayList<Album>();
        // Récupérer l'ensemble des Album dans la DB
        listAlbum = AlbumService.readAll();

        // renvoyer une liste de Album
        return listAlbum;
    }

    // http://localhost:8080/album/update
    @PutMapping("/update")
    public boolean updateAlbum(@RequestBody Album updateAlbum) {
        System.out.println("/album/update");

        album = updateAlbum;
        // si OK, enregistrement du Album dans la DB et retour TRUE
        if (true) {return AlbumService.updateOne(album);}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/album/delete/id
    @DeleteMapping("/delete/{id}")
    public boolean deleteAlbum(@PathVariable("id") int id) {
        System.out.println("/album/delete/" + id);

        return AlbumService.deleteOne(id);
    }
}
