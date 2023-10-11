package com.bxnhub.web.entities;


import jakarta.persistence.*;

@Entity
@Table(name="shoes")
public class Shoes {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        private String title;
        private String description;
        private String imageURL;

    public Shoes(Integer id, String title, String description, String imageURL) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageURL = imageURL;
    }
    public Shoes() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Shoes{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }
}
