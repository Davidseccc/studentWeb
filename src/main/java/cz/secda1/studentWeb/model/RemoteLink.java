package cz.secda1.studentWeb.model;

import javax.persistence.Entity;

@Entity
public class RemoteLink extends AbstractFile {
    String url;
    long fileSize;

    public RemoteLink(){
        super();
    }

    public RemoteLink(String name, String url, long fileSize) {
        super(name);
        this.url = url;
        this.fileSize = fileSize;
    }
    public RemoteLink(String name, String url) {
        super(name);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }

    public boolean isInstanceOf(String s){
        return s.equalsIgnoreCase("cz.uhk.model.RemoteLink");
    }
}
