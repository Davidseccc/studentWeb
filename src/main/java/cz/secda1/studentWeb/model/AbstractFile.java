package cz.secda1.studentWeb.model;

import javax.persistence.*;

@Entity
public abstract class AbstractFile {

    @Id
    @GeneratedValue
    private long id;
    String name;
    long fileSize;

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="article_id")
    private Article article;

    public AbstractFile(){

    }
    public AbstractFile(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isInstanceOf(String s){
        return s.equalsIgnoreCase("cz.uhk.model.AbstractFile");
    }
}
