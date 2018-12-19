package cz.secda1.studentWeb.db.repositories;

import cz.secda1.studentWeb.model.AbstractFile;

import java.util.List;

public interface FileService {
    public List<AbstractFile> findAll();
    public List<AbstractFile> findByArticleId(long articleId);
}
