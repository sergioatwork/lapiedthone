package net.back.controller;

import net.back.model.Photo;
import net.back.service.PhotoService;
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
@RequestMapping("/photo")
public class PhotoCtrl {
    @Autowired
    private PhotoService photoService;
    Photo photo = new Photo();

    // http://localhost:8080/photo/read
    @GetMapping("/read")
    public List<Photo> readAllPhoto() {
        System.out.println("/photo/read");
        return photoService.readAll();
    }

    // http://localhost:8080/photo/read/photoId
    @GetMapping("/read/{photoId}")
    public Photo readPhoto(@PathVariable("photoId") int photoId) {
        System.out.println("/photo/read/" + photoId);
        // Récupérer le Photo avec l'photoId dans la DB
        return photoService.readOne(photoId);
    }

    // http://localhost:8080/photo/create
    @PostMapping("/create")
    public boolean createPhoto(@RequestBody Photo newPhoto) {
        System.out.println("/photo/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newPhoto != null) {
            newPhoto.setPhotoId(0);
            return photoService.addOne(newPhoto) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    // http://localhost:8080/photo/update
    @PutMapping("/update")
    public boolean updatePhoto(@RequestBody Photo updatePhoto) {
        System.out.println("/photo/update");
        if (updatePhoto != null) {
            return photoService.updateOne(updatePhoto) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    // http://localhost:8080/photo/delete/photoId
    @DeleteMapping("/delete/{photoId}")
    public boolean deletePhoto(@PathVariable("photoId") int photoId) {
        System.out.println("/photo/delete/" + photoId);
        return photoService.deleteOne(photoId);
    }
}
