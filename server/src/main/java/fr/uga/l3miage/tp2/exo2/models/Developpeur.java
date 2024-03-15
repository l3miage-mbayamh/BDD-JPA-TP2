package fr.uga.l3miage.tp2.exo2.models;

import fr.uga.l3miage.tp2.exo2.enums.NiveauCompetence;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Entity
@DiscriminatorValue("D")
public class Developpeur extends Employe {
    private  String langagePrefer;
    @Enumerated(EnumType.STRING)
   private NiveauCompetence niveauCompetence;
}
