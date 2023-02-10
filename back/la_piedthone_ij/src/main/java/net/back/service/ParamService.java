package net.back.service;


import net.back.model.Param;
import net.back.repository.ParamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParamService {
    @Autowired
    private ParamRepository paramRepo;

    public List<Param> readAll() {
        return paramRepo.findAll();
    }
    public Param readOne(int paramId) {
        return  paramRepo.findById(paramId).orElse(null);
    }
    public Param addOne(Param newParam) throws Exception {
        if (newParam.getParamKey().trim().length() == 0) {throw (new Exception("Nom du paramètre absent !!!"));}
        newParam.setParamId(0);
        paramRepo.save(newParam);
        return newParam;
    }
    public Param updateOne(Param updateParam) {
        paramRepo.save(updateParam);
        return updateParam;
    }
    public boolean deleteOne(int paramId) {
        try {
            paramRepo.deleteById(paramId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
