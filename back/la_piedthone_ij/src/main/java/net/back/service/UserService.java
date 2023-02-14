package net.back.service;

import jakarta.servlet.http.HttpSession;
import net.back.model.Login;
import net.back.model.User;
import net.back.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    public List<User> readAll() {
        List<User> listUser = userRepo.findAll();
        return listUser;
    }
    public User readOne(int userId) {
        return userRepo.findById(userId).orElse(null);
    }
    public User addOne(User newUser) {
        // prévoir controle des infos du User
        userRepo.save(newUser);
        return newUser;
    }
    public User updateOne(User updateUser) {
        userRepo.save(updateUser);
        return updateUser;
    }
    public boolean deleteOne(int userId) {
        try {
            userRepo.deleteById(userId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
    public boolean enableOne(int userId) {
        User user = this.readOne(userId);
        if (user != null) {
            user.setExpDate(LocalDateTime.now().plusYears(10));
            return this.updateOne(user) != null;
        }
        return false;
    }
    public boolean disableOne(int userId) {
        User user = this.readOne(userId);
        if (user != null) {
            user.setExpDate(LocalDateTime.now());
            return this.updateOne(user) != null;
        }
        return false;
    }
    public User login(Login login, HttpSession session) {
System.out.println("Login Service");
System.out.println("SessionID: #" + session.getId());
System.out.println("Session Attributes : " + session.getAttributeNames());
        User user = userRepo.findUserByEmail(login.getId());
        if (user != null
                && user.getPassword().equals(login.getPwd())
                && user.getExpDate().isAfter(LocalDateTime.now())) {
            return user;
        }
        return null;
    }
}
