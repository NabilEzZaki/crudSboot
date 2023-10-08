package com.beTalent.game.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "loginUser")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    @Id
    private String username;
    private String password;
}
