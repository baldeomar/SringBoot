package com.oumar.learn.dao;

import com.oumar.learn.model.Utilisateur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UtilisateurDao extends MongoRepository<Utilisateur, String>{

}
