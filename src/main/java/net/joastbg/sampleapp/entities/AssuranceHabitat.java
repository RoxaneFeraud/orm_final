package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AssuranceHabitat extends Assurance {

    @Column
    private String adresseAssuree;

    @Column
    private Long valeurCouverte;

    /**
     * @return the adresseAssuree
     */
    public String getAdresseAssuree() {
        return adresseAssuree;
    }

    /**
     * @param adresseAssuree the adresseAssuree to set
     */
    public void setAdresseAssuree(String adresseAssuree) {
        this.adresseAssuree = adresseAssuree;
    }

    /**
     * @return the valeurCouverte
     */
    public Long getValeurCouverte() {
        return valeurCouverte;
    }

    /**
     * @param valeurCouverte the valeurCouverte to set
     */
    public void setValeurCouverte(Long valeurCouverte) {
        this.valeurCouverte = valeurCouverte;
    }

}
