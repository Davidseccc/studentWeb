package cz.secda1.studentWeb.db.repositories;

import cz.secda1.studentWeb.model.Article;
import cz.secda1.studentWeb.model.Category;


import java.util.List;
public interface ArticleService{
    List<Article> findAll();

    List<Article> getByCategory(Category category);

    Article findById(long id);
    Article findByIdFetchFiles(long id);


}
