package net.back.controller;

import net.back.model.Photo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/photo")
public class PhotoCtrl {

    Photo photo = new Photo();

    //http://localhost:8080/photo/create
    @PostMapping("/create")
    public boolean createPhoto(@RequestBody Photo newPhoto) {
        System.out.println("/photo/create");

        photo = newPhoto;
        // si OK, enregistrement du Photo dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/photo/read/id
    @GetMapping("/read/{id}")
    public Photo readPhoto(@PathVariable("id") int id) {
        System.out.println("/photo/read/" + id);

        // Récupérer le Photo avec l'id dans la DB

        return photo;
    }

    //http://localhost:8080/photo/read
    @GetMapping("/read")
    public ArrayList<Photo> readAllPhoto() {
        System.out.println("/photo/read");

        ArrayList<Photo> listPhoto = new ArrayList<Photo>();
        // Récupérer l'ensemble des Photo dans la DB
        listPhoto.add(photo);

        // renvoyer une liste de Photo
        return listPhoto;
    }

    //http://localhost:8080/photo/update
    @PostMapping("/update")
    public boolean updatePhoto(@RequestBody Photo updatePhoto) {
        System.out.println("/photo/update");

        photo = updatePhoto;
        // si OK, enregistrement du Photo dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/photo/delete/id
    @GetMapping("/delete/{id}")
    public boolean deletePhoto(@PathVariable("id") int id) {
        System.out.println("/photo/delete/" + id);

        // si OK, suppression du Photo dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }
}