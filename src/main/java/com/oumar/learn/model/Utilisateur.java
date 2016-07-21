package com.oumar.learn.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Utilisateur")
@Getter
@Setter
@SuppressWarnings("PMD.UnusedPrivateField")
public class Utilisateur {

    @Id
    private String id;

    private String username;

    private String password;
}
