package net.back.controller;

import net.back.model.Param;
import net.back.model.Run;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ParamCtrl {
    Param param = new Param();
    public static void init() {
        // Initialisation de l'application
    }
    @GetMapping("/")
    public String racineGet() {
        System.out.println("/");
        return testGet();
    }
    @GetMapping("/test")
    public String testGet() {
        System.out.println("/test");
        return "Hello !!! Everything seem OK ;-)";
    }
    //http://localhost:8080/param/create?key="key"&value="value"
    @GetMapping("/param/create")
    public boolean createParam(
            @RequestParam(value = "key", defaultValue = "missing_key") String newKey,
            @RequestParam(value = "value", defaultValue = "") String newValue) {
        System.out.println("/param/create?key=" + newKey + "&value=" + newValue);

        param.setParamKey(newKey);
        param.setParamValue(newValue);
        // si OK, enregistrement du Param dans la DB et retour TRUE
        if (true) {return true;}

        // si KO, retour FALSE
        return false;
    }

    //http://localhost:8080/param/read
    @GetMapping("/param/read")
    public ArrayList<Param> readParam() {
        System.out.println("/param/read");

        ArrayList<Param> listParam = new ArrayList<Param>();
        // Récupérer l'ensemble des Param dans la DB
        listParam.add(param);

        // renvoyer une liste de Run
        return listParam;
    }

    //http://localhost:8080/run/delete/id
    @GetMapping("/param/delete/{id}")
    public boolean deleteParam(@PathVariable("id") int id) {
        System.out.println("//param/delete/" + id);

        // si OK, suppression du Param dans la DB et retour TRUE
        if (true) {return true;}

        // si K, retour FALSE
        return false;
    }

}
