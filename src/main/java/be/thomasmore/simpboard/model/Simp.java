package be.thomasmore.simpboard.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Simp {
    @Id
    private int id;
    private String groupName;
    private String linkMoreInfo;
    private String adresse;
    private int leeftijd;
    private int punten;

    @ManyToMany(mappedBy = "simps")
    private Collection<Bier> biers;

    public Collection<Bier> getBiers() {
        return biers;
    }

    public void setBiers(Collection<Bier> biers) {
        this.biers = biers;
    }
// Bijhouden hoeveel de leiding dronk en naar pitta


    public Simp(int id, String groupName, String linkMoreInfo, String adresse, int leeftijd, int punten, Collection<Bier> biers) {
        this.id = id;
        this.groupName = groupName;
        this.linkMoreInfo = linkMoreInfo;
        this.adresse = adresse;
        this.leeftijd = leeftijd;
        this.punten = punten;
        this.biers = biers;
    }

    public Simp() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getLinkMoreInfo() {
        return linkMoreInfo;
    }

    public void setLinkMoreInfo(String linkMoreInfo) {
        this.linkMoreInfo = linkMoreInfo;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }
}
