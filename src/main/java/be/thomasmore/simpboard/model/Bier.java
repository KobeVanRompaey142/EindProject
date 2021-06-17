package be.thomasmore.simpboard.model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Bier {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bier_generator")
    @SequenceGenerator(name = "bier_generator", sequenceName = "bier_seq", allocationSize = 1)
    @Id
    private Integer id;
    private String bierNaam;
    private int alcholNiveau;
    private int aantalStickers;
    private boolean gluten;
    private int brouwjaar;
    private String brouwer;
    private boolean fruit;

    @ManyToMany(fetch = FetchType.LAZY)
    Collection<Simp> simps;


    public Bier(Integer id, String bierNaam, int alcholNiveau, int aantalStickers, boolean gluten, int brouwjaar, String brouwer, boolean fruit) {
        this.id = id;
        this.bierNaam = bierNaam;
        this.alcholNiveau = alcholNiveau;
        this.aantalStickers = aantalStickers;
        this.gluten = gluten;
        this.brouwjaar = brouwjaar;
        this.brouwer = brouwer;
        this.fruit = fruit;
    }

    public Bier(){

   }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBierNaam() {
        return bierNaam;
    }

    public void setBierNaam(String bierNaam) {
        this.bierNaam = bierNaam;
    }

    public int getAlcholNiveau() {
        return alcholNiveau;
    }

    public void setAlcholNiveau(int alcholNiveau) {
        this.alcholNiveau = alcholNiveau;
    }

    public int getAantalStickers() {
        return aantalStickers;
    }

    public void setAantalStickers(int aantalStickers) {
        this.aantalStickers = aantalStickers;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public int getBrouwjaar() {
        return brouwjaar;
    }

    public void setBrouwjaar(int brouwjaar) {
        this.brouwjaar = brouwjaar;
    }

    public String getBrouwer() {
        return brouwer;
    }

    public void setBrouwer(String brouwer) {
        this.brouwer = brouwer;
    }

    public boolean getFruit() {
        return fruit;
    }

    public void setFruit(boolean fruit) {
        this.fruit = fruit;
    }
}
