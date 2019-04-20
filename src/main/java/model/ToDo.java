package model;

import java.util.Date;

/**
 *
 */
public abstract class ToDo {

    //
    private int id;
    //
    private String title;
    //
    private String description;
    //
    private Date creationDate;
    //
    private Date lastModified;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }
    @Override
    public String toString(){
        return "</br>Title:"+ title +"</br>Description:  +" +description +"</br>";
    }
}
