package net.back.controller;

import net.back.model.Album;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/album")
public class AlbumCtrl {

    Album album = new Album();

    //http://localhost:8080/album/create
    @PostMapping("/create")
    public boolean createAlbum(@RequestBody Album newAlbum) {
        System.out.println("/album/create");

        album = newAlbum;
        // si OK, enregistrement du Album dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/album/read/id
    @GetMapping("/read/{id}")
    public Album readAlbum(@PathVariable("id") int id) {
        System.out.println("/album/read/" + id);

        // Récupérer le Album avec l'id dans la DB

        return album;
    }

    //http://localhost:8080/album/read
    @GetMapping("/read")
    public ArrayList<Album> readAllAlbum() {
        System.out.println("/album/read");

        ArrayList<Album> listAlbum = new ArrayList<Album>();
        // Récupérer l'ensemble des Album dans la DB
        listAlbum.add(album);

        // renvoyer une liste de Album
        return listAlbum;
    }

    //http://localhost:8080/album/update
    @PostMapping("/update")
    public boolean updateAlbum(@RequestBody Album updateAlbum) {
        System.out.println("/album/update");

        album = updateAlbum;
        // si OK, enregistrement du Album dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/album/delete/id
    @GetMapping("/delete/{id}")
    public boolean deleteAlbum(@PathVariable("id") int id) {
        System.out.println("/album/delete/" + id);

        // si OK, suppression du Album dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }
}
