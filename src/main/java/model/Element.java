package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Element extends ToDo{
    public List<Tag> tags = new ArrayList<>();
    public int state;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return  "</br>creation date: " + new SimpleDateFormat("yyyy-MM-dd").format(super.getCreationDate()) + "\n" +
                "</br>last modified: " + new SimpleDateFormat("yyyy-MM-dd").format(super.getLastModified()) + "\n" +
                "</br>Title: " + super.getTitle() + "\n" +
                "</br>Description: " + super.getDescription() + "\n" +
                "</br>";

    }
}
