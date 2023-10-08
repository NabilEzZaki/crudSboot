package com.beTalent.game.model;

import jakarta.persistence.*;


@Entity
@Table(name="game_table")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "id", length = 45)
    private Long id;
    @Column(name = "title", length = 150)
    private String title;
    @Column(name = "price", length = 150)
    private String price;
    @Column(name = "codebar", length = 150)
    private String codebar;
    @Column(name = "description", length = 150)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCodebar() {
        return codebar;
    }

    public void setCodebar(String codebar) {
        this.codebar = codebar;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
