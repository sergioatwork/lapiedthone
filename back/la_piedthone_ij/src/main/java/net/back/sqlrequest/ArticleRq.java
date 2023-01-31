package net.back.sqlrequest;

import net.back.model.Article;
import net.back.utils.API;

import java.util.ArrayList;

public class ArticleRq {
    public static ArrayList<Article> readAll() {
        ArrayList<Article> listArticle = new ArrayList<Article>();
        listArticle = API.getArticleDB();

        return listArticle;
    }
    public static Article readOne(int id) {
        Article article = new Article();
        if (id < 0 || id >= API.getArticleDB().size()) {return null;}
        article = API.getArticleDB().get(id);

        return article;
    }
    public static boolean addOne(Article newArticle) {
        newArticle.setId(API.incArticleAutoIncrement());
        API.getArticleDB().add(newArticle.getId(), newArticle);

        return true;
    }
    public static boolean updateOne(Article newArticle) {
        API.getArticleDB().set(newArticle.getId(), newArticle);

        return true;
    }
    public static boolean deleteOne(int id) {
        if (id < 0 || id >= API.getArticleDB().size()) {return false;}
        API.getArticleDB().remove(id);

        return true;
    }
}
