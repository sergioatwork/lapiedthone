package net.back.model;

// tab_param
public class Param {
    private static final String SQL_TABLE = "tab_param";
    private String paramKey;             // param_key varchar(256) NOT NULL
    private String paramValue;           // param_value text DEFAULT NULL

    public Param() {
    }

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