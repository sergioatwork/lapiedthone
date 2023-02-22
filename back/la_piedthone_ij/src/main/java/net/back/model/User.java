package net.back.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "tab_user")
public class User {
//    private static final String SQL_TABLE = "tab_user";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;                 // id int(10) unsigned NOT NULL AUTO_INCREMENT
    private String name;            // name varchar(20) DEFAULT NULL
    private String firstName;       // first_name varchar(20) DEFAULT NULL
    private String email;           // email varchar(100) DEFAULT NULL
    private String password;        // password varchar(100) DEFAULT NULL
    private LocalDateTime subDate;           // sub_date datetime NOT NULL DEFAULT '0000-01-01 00:00:00'
    private LocalDateTime expDate;           // exp_date datetime NOT NULL DEFAULT '9999-12-31 23:59:59'
    private boolean admin;          // admin tinyint(1) NOT NULL DEFAULT 0

    @OneToMany(mappedBy = "runId", fetch = FetchType.LAZY)
    private List<Runner> runner;

    public User() {
    }
    public User(int userId, String name, String firstName, String email, String password, LocalDateTime subDate, LocalDateTime expDate, boolean admin) {
        this.userId = userId;
        this.name = name;
        this.firstName = firstName;
        this.email = email;
        this.password = password;
        this.subDate = subDate;
        this.expDate = expDate;
        this.admin = admin;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public LocalDateTime getSubDate() {return subDate;}
    public void setSubDate(LocalDateTime subDate) {this.subDate = subDate;}
    public LocalDateTime getExpDate() {return expDate;}
    public void setExpDate(LocalDateTime expDate) {this.expDate = expDate;}
    public boolean isAdmin() {
        return admin;
    }
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isEnable() {
        if (this.expDate.isAfter(LocalDateTime.now())) {return true;}
        return false;
    }

//    public String endodePassword(String password) {
//        return BCryptPasswordEncoder().encode(password);
//    }
//    public boolean checkPassword(String password) {
//        return BCryptPasswordEncoder().matches(password, this.getPassword());
//    }
}
