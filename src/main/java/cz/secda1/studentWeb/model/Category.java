package cz.secda1.studentWeb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @ManyToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="category_id")
    private Category parentCategory;

    @OneToMany(mappedBy="parentCategory", fetch = FetchType.EAGER)
    private List<Category> childCategories = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    List<Article> articles;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, Category parentCategory) {
        this.name = name;
        this.parentCategory = parentCategory;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
    public void addArticle(Article article) {
        if (this.articles == null){
            this.articles = new ArrayList<>();
        }
        this.articles.add(article);
    }

    public Category getParentCategory() {
        return parentCategory;
    }

    public void setParentCategory(Category parentCategory) {
        this.parentCategory = parentCategory;
    }

    public List<Category> getChildCategories() {
        return childCategories;
    }

    public void setChildCategories(List<Category> childCategories) {
        this.childCategories = childCategories;
    }

    @Override
    public String toString() {
        return id + " - " + name ;
    }
}
