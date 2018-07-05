package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PersonneMorale extends Client {
    
    @Column
    private String siren;
    
    @Column
    private String nom;

    public PersonneMorale() {

    }

    /**
     * @return the siren
     */
    public String getSiren() {
        return siren;
    }

    /**
     * @param siren the siren to set
     */
    public void setSiren(String siren) {
        this.siren = siren;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
}
