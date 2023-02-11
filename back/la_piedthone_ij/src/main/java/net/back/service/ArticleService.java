package net.back.service;

import net.back.model.Article;
import net.back.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {
    @Autowired
    private ArticleRepository articleRepo;

    public List<Article> readAll() {
        return articleRepo.findAll();
    }
    public Article readOne(int articleId) {
        return  articleRepo.findById(articleId).orElse(null);
    }
    public Article addOne(Article newArticle) {
        // prévoir controle des infos du User
        articleRepo.save(newArticle);
        return newArticle;
    }
    public Article updateOne(Article updateArticle) {
        articleRepo.save(updateArticle);
        return updateArticle;
    }
    public boolean deleteOne(int articleId) {
        try {
            articleRepo.deleteById(articleId);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
