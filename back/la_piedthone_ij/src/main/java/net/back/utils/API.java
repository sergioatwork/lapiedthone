package net.back.utils;

import net.back.model.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

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

    public static void init() {
        // Initialisation de l'application

        userDB = new ArrayList<User>();
        // User(int id, String name, String firstName, String email, String password, LocalDateTime subDate, LocalDateTime expDate, boolean admin)
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
        // Run(int id, String name, char type, String description, Date startDate, Date endDate)
        runDB.add(new Run(0, "Piethone 2018 - 2km", 'p', "Course de 2 Km à l'Hôpital Pitié Salpêtrière", new Date(2018-11-10-15-00-00), new Date(2018-11-10-20-00-00)));
        runDB.add(new Run(1, "Piethone 2018 - 4km", 'p', "Course de 4 Km à l'Hôpital Pitié Salpêtrière",  new Date(2018-11-10-14-30-00),  new Date(2018-11-10-20-00-00)));
        runDB.add(new Run(2, "Piethone 2018 - 6km", 'p', "Course de 6 Km à l'Hôpital Pitié Salpêtrière",  new Date(2018-11-10-14-00-00),  new Date(2018-11-10-20-00-00)));
        runDB.add(new Run(3, "Piethone 2018 - 8km", 'p', "Course de 8 Km à l'Hôpital Pitié Salpêtrière",  new Date(2018-11-10-13-30-00),  new Date(2018-11-10-20-00-00)));
        runDB.add(new Run(4, "Piethone 2018 - 10km", 'p', "Course de 10 Km à l'Hôpital Pitié Salpêtrière",  new Date(2018-11-10-13-00-00),  new Date(2018-11-10-20-00-00)));
        runDB.add(new Run(5, "Piethone 2019 - 2km", 'v', "Course de 2 Km - Lieu libre",  new Date(2019-11-06-14-00-00),  new Date(2018-11-06-20-00-00)));
        runDB.add(new Run(6, "Piethone 2019 - 4km", 'v', "Course de 4 Km - Lieu libre",  new Date(2019-11-06-14-00-00),  new Date(2018-11-06-20-00-00)));
        runDB.add(new Run(7, "Piethone 2019 - 4km", 'v', "Course de 4 Km - Lieu libre ou en salle",  new Date(2023-11-12-14-00-00),  new Date(2018-11-12-20-00-00)));
        runDB.add(new Run(8, "Piethone 2019 - 6km", 'v', "Course de 6 Km - Lieu libre ou en salle",  new Date(2023-11-12-13-00-00),  new Date(2018-11-12-20-00-00)));
        runAutoIncrement = runDB.size()-1;
        System.out.println("ArrayList runDB de Run, initialisée !!!");

        runnerDB = new ArrayList<Runner>();
        // Runner(int idUser, int idRun, int contribution, int km, Date startDate, Date endDate)
        runnerDB.add(new Runner(1, 1, 42, 3,  LocalDateTime.parse("2018-11-10T14:30:00"),  LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(0, 0, 42, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(1, 1, 24, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(2, 2, 85, 4, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(3, 3, 6, 2, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(4, 3, 78, 1, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(5, 3, 12, 3, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(6, 1, 10, 6, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(7, 3, 10, 4, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(8, 2, 21, 5, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
        runnerDB.add(new Runner(9, 2, 32, 6, LocalDateTime.parse("2018-11-10T15:00:00"), LocalDateTime.parse("2018-11-10T20:00:00")));
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
