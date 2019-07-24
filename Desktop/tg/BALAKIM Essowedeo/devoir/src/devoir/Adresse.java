/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class Adresse implements Comparable<Adresse>,Serializable {
    private String localisation, quartier, telephone,email;

    public Adresse() {
    }

    public Adresse(String localisation, String quartier, String telephone, String email) {
        this.localisation = localisation;
        this.quartier = quartier;
        this.telephone = telephone;
        this.email = email;
    }

    public String getLocalisation() {
        return localisation;
    }

    public String getQuartier() {
        return quartier;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString(){
        return "Adresse(localisation: "+localisation+" quartier: "+quartier+" telephone: "+telephone+" email: "+email+")";
    }

    @Override
    public int compareTo(Adresse autreAdresse) {
        return this.getQuartier().compareTo(autreAdresse.getQuartier());
    }
    
}
