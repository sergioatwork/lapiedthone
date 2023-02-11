package net.back.controller;

import net.back.model.Article;
import net.back.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleCtrl {
    @Autowired
    private ArticleService articleService;
    Article article = new Article();

    // http://localhost:8080/article/read
    @GetMapping("/read")
    public List<Article> readAllArticle() {
        System.out.println("/article/read");
        return articleService.readAll();
    }

    // http://localhost:8080/article/read/articleId
    @GetMapping("/read/{articleId}")
    public Article readArticle(@PathVariable("articleId") int articleId) {
        System.out.println("/article/read/" + articleId);
        // Récupérer le Article avec l'articleId dans la DB
        return articleService.readOne(articleId);
    }

    // http://localhost:8080/article/create
    @PostMapping("/create")
    public boolean createArticle(@RequestBody Article newArticle) {
        System.out.println("/article/create");
        // si newUser non null, envoi de newUser au Service pour ajout dans la DB
        if (newArticle != null) {
            newArticle.setArticleId(0);
            return articleService.addOne(newArticle) != null;}
        // si  newUser null retour FALSE
        return false;
    }

    // http://localhost:8080/article/update
    @PutMapping("/update")
    public boolean updateArticle(@RequestBody Article updateArticle) {
        System.out.println("/article/update");
        if (updateArticle != null) {
            return articleService.updateOne(updateArticle) != null;}
        // si  updateUser null retour FALSE
        return false;
    }

    // http://localhost:8080/article/delete/articleId
    @DeleteMapping("/delete/{articleId}")
    public boolean deleteArticle(@PathVariable("articleId") int articleId) {
        System.out.println("/article/delete/" + articleId);
        return articleService.deleteOne(articleId);
    }
}
