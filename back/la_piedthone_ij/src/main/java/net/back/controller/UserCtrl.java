package net.back.controller;

import net.back.model.Login;
import net.back.model.User;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserCtrl {
    User user = new User();

    //http://localhost:8080/user/create
    @PostMapping("/create")
    public boolean createUser(@RequestBody User newUser) {
        System.out.println("/user/create");

        user = newUser;
        // si OK, enregistrement du User dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/user/read/id
    @GetMapping("/read/{id}")
    public User readUser(@PathVariable("id") int id) {
        System.out.println("/user/read/" + id);

        // Récupérer le User avec l'id dans la DB

        return user;
    }

    //http://localhost:8080/user/read
    @GetMapping("/read")
    public ArrayList<User> readAllUser() {
        System.out.println("/user/read");

        ArrayList<User> listUser = new ArrayList<User>();
        // Récupérer l'ensemble des User dans la DB
        listUser.add(user);

        // renvoyer une liste de User
        return listUser;
    }

    //http://localhost:8080/user/update
    @PostMapping("/update")
    public boolean updateUser(@RequestBody User updateUser) {
        System.out.println("/user/update");

        user = updateUser;
        // si OK, enregistrement du User dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/user/delete/id
    @GetMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") int id) {
        System.out.println("/user/delete/" + id);

        // si OK, suppression du User dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/user/login
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

    //http://localhost:8080/user/reset
    @PostMapping("/reset")
    public boolean resetUser(@RequestBody Login login) {
        System.out.println("/user/login");
        System.out.println("ID: #" + login.getId() + "# PassWord: #" + login.getPwd() + "#");

        // vérification dans la DB de l'identifiant

        // si OK, réinitialiser le mot de passe du User et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/user/check
    @PostMapping("/check")
    public boolean loginUser(@RequestParam(value = "newpwd", defaultValue = "") String newpwd, @RequestBody Login login) {
        System.out.println("/user/check");
        System.out.println("ID: #" + login.getId() + "# PassWord: #" + newpwd + "#");

        login.setPwd(newpwd);

        // vérification dans la DB de l'identifiant et du mot de passe

        // si OK, chargement du User dans la Session, demande de modification du mot de passe et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

}