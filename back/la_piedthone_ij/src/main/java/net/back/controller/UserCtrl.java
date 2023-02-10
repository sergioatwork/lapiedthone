package net.back.controller;

import net.back.model.Login;
import net.back.model.User;
import net.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserCtrl {
    @Autowired
    private UserService userService;
    private User user = new User();

    // http://localhost:8080/user/read
    @GetMapping("/read")
    public List<User> readAllUser() {
            System.out.println("/user/read");
        return userService.readAll();
    }

    // http://localhost:8080/user/read/userId
    @GetMapping("/read/{userId}")
    public User readUser(@PathVariable("userId") int userId) {
        System.out.println("/user/read/" + userId);
        // Récupérer le User avec l'userId dans la DB
        return userService.readOne(userId);
    }

    // http://localhost:8080/user/create
    @PostMapping("/create")
    public boolean createUser(@RequestBody User newUser) {
            System.out.println("/user/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newUser != null) {
            newUser.setUserId(0);
            return userService.addOne(newUser) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    // http://localhost:8080/user/update
    @PutMapping("/update")
    public boolean updateUser(@RequestBody User updateUser) {
            System.out.println("/user/update");
        // si updateUser non null, envoi de updateUser au Service pour modification dans la DB
        if (updateUser != null) {
            return userService.updateOne(updateUser) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    // http://localhost:8080/user/delete/userId
    @DeleteMapping("/delete/{userId}")
    public boolean deleteUser(@PathVariable("userId") int userId) {
            System.out.println("/user/delete/" + userId);
        return userService.deleteOne(userId);
    }

    // http://localhost:8080/user/enable
    @PatchMapping("/enable/{userId}")
    public boolean enableUser(@PathVariable("userId") int userId) {
            System.out.println("/user/enable/" + userId);
        return userService.enableOne(userId);
    }

    // http://localhost:8080/user/disable
    @PatchMapping("/disable/{userId}")
    public boolean disableUser(@PathVariable("userId") int userId) {
            System.out.println("/user/disable/" + userId);
        return userService.disableOne(userId);
    }


    ////////////////    User Authentification    ////////////////


    // http://localhost:8080/user/login
    @PostMapping("/login")
    public boolean loginUser(@RequestBody Login login) {
        System.out.println("/user/login");
        System.out.println("ID: #" + login.getId() + "# PassWord: #" + login.getPwd() + "#");

        // vérification dans la DB de l'identifiant et du mot de passe

        // si OK, chargement du User dans la Session et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/user/reset
    @PostMapping("/reset")
    public boolean resetUser(@RequestBody Login login) {
        System.out.println("/user/reset");
        System.out.println("ID: #" + login.getId() + "# PassWord: #" + login.getPwd() + "#");

        // vérification dans la DB de l'identifiant

        // si OK, réinitialiser le mot de passe du User et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/user/check/{rstpwd}
    @GetMapping("/check/{rstpwd}")
    public boolean loginUser(@PathVariable(value = "rstpwd") String rstpwd) {
        System.out.println("/user/check/" + rstpwd);

        // vérification dans la DB du rstpwd

        // si OK, chargement du User dans la Session, demande de modification du mot de passe et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

}
