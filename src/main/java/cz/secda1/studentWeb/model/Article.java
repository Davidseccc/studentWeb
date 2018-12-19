package cz.secda1.studentWeb.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Article implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String name;

    @Column(columnDefinition = "TEXT")
    private String content;
    private int number;

    @OneToMany(mappedBy = "article",fetch = FetchType.EAGER)
    @Column(nullable = true)
    private List<AbstractFile> files;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_category")
    Category category;
    String imagePath;
    LocalDateTime createdDate;

    public Article() {
        this.files = new ArrayList<>();
    }

    public Article(String name, String content) {
        this.name = name;
        this.content = content;
        this.files = new ArrayList<>();
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public List<AbstractFile> getFiles() {
        return files;
    }

    public void setFiles(List<AbstractFile> files) {
        this.files = files;
    }

    public void addFile(AbstractFile file) {
        if (this.files == null) {
            this.files = new ArrayList<>();
        }
        this.files.add(file);

    }

}
