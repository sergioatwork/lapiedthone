package net.back.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tab_param")
public class Param {
//    private static final String SQL_TABLE = "tab_param";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paramId;                      // id int(10) unsigned NOT NULL
    private String paramKey;             // param_key varchar(256) NOT NULL
    private String paramValue;           // param_value text DEFAULT NULL

    public Param() {
    }

    public int getParamId() {return paramId;}
    public void setParamId(int paramId) {this.paramId = paramId;}
    public String getParamKey() {
        return paramKey;
    }
    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }
    public String getParamValue() {
        return paramValue;
    }
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}
