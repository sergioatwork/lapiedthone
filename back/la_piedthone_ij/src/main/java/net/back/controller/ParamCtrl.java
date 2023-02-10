package net.back.controller;

import net.back.model.Param;
import net.back.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParamCtrl {
    @Autowired
    private ParamService paramService;
    Param param = new Param();

    //http://localhost:8080/param/read
    @GetMapping("/param/read")
    public List<Param> readParam() {
            System.out.println("/param/read");
        return paramService.readAll();
    }

    //http://localhost:8080/param/create?key="key"&value="value"
    @GetMapping("/param/create")
    public boolean createParam(
            @RequestParam(value = "key", defaultValue = "missing_key") String newKey,
            @RequestParam(value = "value", defaultValue = "") String newValue) {
                System.out.println("/param/create?key=" + newKey + "&value=" + newValue);

        try {
            if (newKey == null) {throw (new Exception("Nom du paramètre absent !!!"));}
            param.setParamKey(newKey);
            param.setParamValue(newValue);
            paramService.addOne(param);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    //http://localhost:8080/run/delete/paramId
    @GetMapping("/param/delete/{paramId}")
    public boolean deleteParam(@PathVariable("paramId") int paramId) {
            System.out.println("/param/delete/" + paramId);
        return paramService.deleteOne(paramId);
    }

}
