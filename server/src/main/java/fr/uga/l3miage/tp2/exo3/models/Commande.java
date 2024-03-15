package fr.uga.l3miage.tp2.exo3.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Commande {
    @Id
    private Long id;
    private LocalDate date;
    private Double montant;


}
