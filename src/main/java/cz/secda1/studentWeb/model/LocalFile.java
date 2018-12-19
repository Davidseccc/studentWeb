package cz.secda1.studentWeb.model;

import javax.persistence.Entity;
import java.io.File;

@Entity
public class LocalFile extends AbstractFile {
    String path;
    long fileSize;

    public LocalFile(){
        super();
    }

    public LocalFile(String name, String path, long fileSize) {
        super(name);
        this.path = path;
        this.fileSize = fileSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isInstanceOf(String s){
        return s.equalsIgnoreCase("cz.uhk.model.LocalFile");
    }
}
