package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class AssuranceAuto extends Assurance{
    
    @Column
    private String immatriculation;
    
    @Column 
    private String bonusMalus;

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * @return the bonusMalus
     */
    public String getBonusMalus() {
        return bonusMalus;
    }

    /**
     * @param bonusMalus the bonusMalus to set
     */
    public void setBonusMalus(String bonusMalus) {
        this.bonusMalus = bonusMalus;
    }
    
    
}
