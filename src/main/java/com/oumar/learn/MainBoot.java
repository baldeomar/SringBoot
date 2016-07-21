package com.oumar.learn;

import com.oumar.learn.dao.UtilisateurDao;
import com.oumar.learn.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@EnableAutoConfiguration
public class MainBoot {

    @Autowired
    private UtilisateurDao utilisateurDao;

    @RequestMapping("/")
    String main(){
        return "how high";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    String home() {
        return "at home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    String user(){
        Utilisateur utilisateur = utilisateurDao.findOne("1");
        if(utilisateur == null){
            utilisateur = new Utilisateur();
            utilisateur.setUsername("jack");
            utilisateur.setPassword("ouille");
            utilisateurDao.save(utilisateur);
            List<Utilisateur> utilisateurs = utilisateurDao.findAll();
            return "how high user null";
        }
        return "how high user not null";
    }

    public static void main(String args[]) throws Exception{
        SpringApplication.run(MainBoot.class, args);
    }
}
