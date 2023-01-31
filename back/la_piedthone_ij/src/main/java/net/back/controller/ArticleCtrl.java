package net.back.controller;

import net.back.model.Article;
import net.back.sqlrequest.ArticleRq;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/article")
public class ArticleCtrl {

    Article article = new Article();

    // http://localhost:8080/article/create
    @PostMapping("/create")
    public boolean createArticle(@RequestBody Article newArticle) {
        System.out.println("/article/create");

        article = newArticle;
        // si OK, enregistrement du Article dans la DB et retour TRUE
        if (true) {return ArticleRq.addOne(article);}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/article/read/id
    @GetMapping("/read/{id}")
    public Article readArticle(@PathVariable("id") int id) {
        System.out.println("/article/read/" + id);

        // Récupérer le Article avec l'id dans la DB
        article = ArticleRq.readOne(id);

        return article;
    }

    // http://localhost:8080/article/read
    @GetMapping("/read")
    public ArrayList<Article> readAllArticle() {
        System.out.println("/article/read");

        ArrayList<Article> listArticle = new ArrayList<Article>();
        // Récupérer l'ensemble des Article dans la DB
        listArticle = ArticleRq.readAll();

        // renvoyer une liste de Article
        return listArticle;
    }

    // http://localhost:8080/article/update
    @PutMapping("/update")
    public boolean updateArticle(@RequestBody Article updateArticle) {
        System.out.println("/article/update");

        article = updateArticle;
        // si OK, enregistrement du Article dans la DB et retour TRUE
        if (true) {return ArticleRq.updateOne(article);}

        // si KO, retour FALSE
        return false;
    }

    // http://localhost:8080/article/delete/id
    @DeleteMapping("/delete/{id}")
    public boolean deleteArticle(@PathVariable("id") int id) {
        System.out.println("/article/delete/" + id);

        return ArticleRq.deleteOne(id);
    }
}
