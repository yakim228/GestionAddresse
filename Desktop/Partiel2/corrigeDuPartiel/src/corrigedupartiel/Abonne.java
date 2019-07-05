/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigedupartiel;

/**
 *
 * @author Administrator
 */

        
public class Abonne implements Comparable<Abonne> {

    private String numTelephone;
    private String nom;

    public Abonne() {
    }

    public Abonne(String numTelephone, String nom) {
        this.numTelephone = numTelephone;
        this.nom = nom;
    }
    
    public int compareTo(Abonne abonne){
        return nom.compareTo(abonne.getNom());
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Abonne{" + "numTelephone=" + numTelephone + ", nom=" + nom + '}';
    }
    
    
    
    
}
