package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Client {
    @Id
    private  Long id;
    private String nom;
    private String email;
    @OneToMany
    private Set<Commande> commandes;


}
