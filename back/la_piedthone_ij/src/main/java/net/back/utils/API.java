package net.back.utils;

import jakarta.servlet.http.HttpSession;
import net.back.model.*;
import net.back.repository.RunnerRepository;
import net.back.service.RunService;
import net.back.service.RunnerService;
import net.back.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

@RestController
public class API {

    private static ArrayList<User> userDB;
    private static int userAutoIncrement;
    private static ArrayList<Run> runDB;
    private static int runAutoIncrement;
    private static ArrayList<Runner> runnerDB;
    private static int runnerAutoIncrement;
    private static ArrayList<Album> albumDB;
    private static int albumAutoIncrement;
    private static ArrayList<Photo> photoDB;
    private static int photoAutoIncrement;
    private static ArrayList<Article> articleDB;
    private static int articleAutoIncrement;

    @Autowired
    private UserService userService;
    @Autowired
    private RunService runService;
    @Autowired
    private RunnerService runnerService;
    @GetMapping("/db")
    public void peuplementDB() {
        System.out.println("/db");
        for (User u : userDB) {
            u.setUserId(0);
            userService.addOne(u);}
        for (Run r : runDB) {
            r.setRunId(0);
            runService.addOne(r);}
        for (Runner r : runnerDB) {
            runnerService.addOne(r);}
    }
    public static void init() {
        // Initialisation de l'application

        userDB = new ArrayList<User>();
        // User(int userId, String name, String firstName, String email, String password, LocalDateTime subDate, LocalDateTime expDate, boolean admin)
        userDB.add(new User(0, "Admin", "Admin", "admin@toto.com", "abcdefghijklmnopqrstuvwxyz", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), true));
        userDB.add(new User(1, "Dupont", "George", "george.dupond@tata.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2019-11-10T20:00:00"), false));
        userDB.add(new User(2, "Durand", "Marie-Jeanne", "mj.durand@rrrrr.org", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(3, "Ducon", "Marie-Lou", "marie-lou.ducon@pfff.net", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(4, "Perrin", "Stéphane", "steph.perrin@tutu.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(5, "Pignon", "Sandrine", "sandrine.pignon@pfff.net", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2020-11-10T20:00:00"), false));
        userDB.add(new User(6, "Duce", "Jean-Claude", "jean-claude.duce@toto.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(7, "Smith", "Marc", "msmith@tata.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(8, "Yoyo", "Evelyne", "evelyne.yoyo@tata.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(9, "Tuch", "Paulette", "paulette.tuch@tutu.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userDB.add(new User(10, "Vif", "Jean-François", "jean-francois.vif@toto.com", "abcdefghijklmnopqrstuvwxyz0123456789", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2025-11-10T20:00:00"), false));
        userAutoIncrement = userDB.size()-1;
        System.out.println("ArrayList userDB de User, initialisée !!!");

        runDB = new ArrayList<Run>();
        // Run(int runId, String name, char type, String description, LocalDateTime startDate, LocalDateTime endDate)
        runDB.add(new Run(0, "Piethone 2018 - 2km", 'p', "Course de 2 Km à l'Hôpital Pitié Salpêtrière", LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runDB.add(new Run(1, "Piethone 2018 - 4km", 'p', "Course de 4 Km à l'Hôpital Pitié Salpêtrière", LocalDateTime.parse("2018-11-10T14:30:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runDB.add(new Run(2, "Piethone 2018 - 6km", 'p', "Course de 6 Km à l'Hôpital Pitié Salpêtrière", LocalDateTime.parse("2018-11-10T14:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runDB.add(new Run(3, "Piethone 2018 - 8km", 'p', "Course de 8 Km à l'Hôpital Pitié Salpêtrière", LocalDateTime.parse("2018-11-10T13:30:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runDB.add(new Run(4, "Piethone 2018 - 10km", 'p', "Course de 10 Km à l'Hôpital Pitié Salpêtrière", LocalDateTime.parse("2018-11-10T13:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runDB.add(new Run(5, "Piethone 2019 - 2km", 'v', "Course de 2 Km - Lieu libre", LocalDateTime.parse("2019-11-06T14:00:00"), LocalDateTime.parse("2018-11-06T20:00:00")));
        runDB.add(new Run(6, "Piethone 2019 - 4km", 'v', "Course de 4 Km - Lieu libre", LocalDateTime.parse("2019-11-06T14:00:00"), LocalDateTime.parse("2018-11-06T20:00:00")));
        runDB.add(new Run(7, "Piethone 2019 - 4km", 'v', "Course de 4 Km - Lieu libre ou en salle", LocalDateTime.parse("2023-11-12T14:00:00"), LocalDateTime.parse("2018-11-12T20:00:00")));
        runDB.add(new Run(8, "Piethone 2019 - 6km", 'v', "Course de 6 Km - Lieu libre ou en salle", LocalDateTime.parse("2023-11-12T13:00:00"), LocalDateTime.parse("2018-11-12T20:00:00")));
        runAutoIncrement = runDB.size()-1;
        System.out.println("ArrayList runDB de Run, initialisée !!!");

        runnerDB = new ArrayList<Runner>();
        // Runner(int userId, int runId, int contribution, int km, Date startDate, Date endDate)
        runnerDB.add(new Runner(11, 1, 42, 3,  LocalDateTime.parse("2018-11-10T14:30:00"),  LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(10, 6, 42, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(11, 1, 24, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(12, 2, 85, 4, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(13, 3, 6, 2, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(15, 3, 78, 1, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(15, 3, 12, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(16, 1, 10, 6, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(17, 3, 10, 4, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(18, 2, 21, 5, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(19, 2, 32, 6, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(10, 2, 9, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerAutoIncrement = runnerDB.size()-1;
        System.out.println("ArrayList runnerDB de Runner, initialisée !!!");

        albumDB = new ArrayList<Album>();
        // Album(int id, String note, int idUser, int idRun)
        albumAutoIncrement = albumDB.size()-1;
        System.out.println("ArrayList albumDB de Album, initialisée !!!");

        photoDB = new ArrayList<Photo>();
        // Photo(int id, String note, String file, int idAlbum)
        photoAutoIncrement = photoDB.size()-1;
        System.out.println("ArrayList photoDB de Photo, initialisée !!!");

        articleDB = new ArrayList<Article>();
        // Article(int id, String title, String note, int idPhoto, Date startDate, Date endDate, boolean news, int idUser, int idRun)
        articleAutoIncrement = articleDB.size()-1;
        System.out.println("ArrayList articleDB de Article, initialisée !!!");
    }

////////////////    Route Racine
    @GetMapping("/")
    public String racineGet() {
        System.out.println("/");
        return testGet();
    }
    ////////////////    Route Test
    @GetMapping("/test")
    public String testGet() {
        System.out.println("/test");
        return "Hello !!! Everything seem OK ;-)";
    }
    ////////////////    Route Affichage SessionID
    @GetMapping("/sessionid")
    public String sessionIdGet( HttpSession session) {
        System.out.println("/sessionid");
        System.out.println("SessionID: " + session.getId());
        session.setMaxInactiveInterval(60);
        System.out.println("Session Max Inactive Time : " + session.getMaxInactiveInterval());
        session.setAttribute("user", "Coucou, je suis l'attribut de la Session.");
        System.out.println("Session Attributes : " + session.getAttributeNames());
        return "Hello !!! Everything seem OK ;-)";
    }
    ////////////////    Route Suppression SessionID
    @GetMapping("/sessionkillid")
    public String sessionKillIdGet( HttpSession session) {
        System.out.println("/sessionKillId");
        System.out.println("SessionID: #" + session.getId());
        System.out.println("Session Attribute : " + session.getAttribute("user"));
        session.invalidate();
        System.out.println("Kill Session ???");
        System.out.println("New SessionID: #" + session.getId());
        System.out.println("Session Attributes : " + session.getAttributeNames());
        return "Hello !!! Everything seem OK ;-)";
    }

////////////////    Auto-Increment
    public static int incUserAutoIncrement() {
        return ++userAutoIncrement;
    }
    public static int incRunAutoIncrement() {
        return ++runAutoIncrement;
    }
    public static int incRunnerAutoIncrement() {
        return ++runnerAutoIncrement;
    }
    public static int incAlbumAutoIncrement() {
        return ++albumAutoIncrement;
    }
    public static int incPhotoAutoIncrement() {
        return ++photoAutoIncrement;
    }
    public static int incArticleAutoIncrement() {
        return ++articleAutoIncrement;
    }

////////////////    Getter et Setter
    public static ArrayList<User> getUserDB() {
        return userDB;
    }
    public static void setUserDB(ArrayList<User> userDB) {
        API.userDB = userDB;
    }
    public static int getUserAutoIncrement() {
        return userAutoIncrement;
    }
    public static void setUserAutoIncrement(int userAutoIncrement) {
        API.userAutoIncrement = userAutoIncrement;
    }
    public static ArrayList<Run> getRunDB() {
        return runDB;
    }
    public static void setRunDB(ArrayList<Run> runDB) {
        API.runDB = runDB;
    }
    public static int getRunAutoIncrement() {
        return runAutoIncrement;
    }
    public static void setRunAutoIncrement(int runAutoIncrement) {
        API.runAutoIncrement = runAutoIncrement;
    }
    public static ArrayList<Runner> getRunnerDB() {
        return runnerDB;
    }
    public static void setRunnerDB(ArrayList<Runner> runnerDB) {
        API.runnerDB = runnerDB;
    }
    public static int getRunnerAutoIncrement() {
        return runnerAutoIncrement;
    }
    public static void setRunnerAutoIncrement(int runnerAutoIncrement) {
        API.runnerAutoIncrement = runnerAutoIncrement;
    }
    public static ArrayList<Album> getAlbumDB() {
        return albumDB;
    }
    public static void setAlbumDB(ArrayList<Album> albumDB) {
        API.albumDB = albumDB;
    }
    public static int getAlbumAutoIncrement() {
        return albumAutoIncrement;
    }
    public static void setAlbumAutoIncrement(int albumAutoIncrement) {
        API.albumAutoIncrement = albumAutoIncrement;
    }
    public static ArrayList<Photo> getPhotoDB() {
        return photoDB;
    }
    public static void setPhotoDB(ArrayList<Photo> photoDB) {
        API.photoDB = photoDB;
    }
    public static int getPhotoAutoIncrement() {
        return photoAutoIncrement;
    }
    public static void setPhotoAutoIncrement(int photoAutoIncrement) {
        API.photoAutoIncrement = photoAutoIncrement;
    }
    public static ArrayList<Article> getArticleDB() {
        return articleDB;
    }
    public static void setArticleDB(ArrayList<Article> articleDB) {
        API.articleDB = articleDB;
    }
    public static int getArticleAutoIncrement() {
        return articleAutoIncrement;
    }
    public static void setArticleAutoIncrement(int articleAutoIncrement) {
        API.articleAutoIncrement = articleAutoIncrement;
    }
}
