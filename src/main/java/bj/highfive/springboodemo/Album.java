package bj.highfive.springboodemo;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ref;
    private String name;
    private String title;
    private String description;
    private Integer duration;
    private String status;
    private String url;

    @ElementCollection // signifie qu ela colonne "tags" est une collection d'élément simples (ici une
                       // collection de string)
    private List<String> tags;
    @Column(name = "album_like")
    private String like;

    public Album(String ref, String name, String title, String description, int i,
            String status, String url, List<String> tags, String like) {
        this.ref = ref;
        this.name = name;
        this.title = title;
        this.description = description;
        this.duration = i;
        this.status = status;
        this.url = url;
        this.tags = tags;
        this.like = like;
    }

    public Album() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    };

    @Override
    public boolean equals(Object obj) {
        // si les deux objets onla même addresse mémoire
        if (this == obj) {
            // ils sont égaux
            return true;
        }
        // Si l'objet passé en argument nest pas une instance d'un album
        if (!(obj instanceof Album)) {
            // ils sont différetns
            return false;
        }

        Album o = (Album) obj;
        // comparer l'id, le nom et le titre

        return Objects.equals(this.id, o.id) && Objects.equals(this.name, o.name)
                && Objects.equals(this.title, o.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.title);
    }

    @Override
    public String toString() {
        return "Album {" + ": " + this.id + ", name: " + this.name + "}";
    }

}
