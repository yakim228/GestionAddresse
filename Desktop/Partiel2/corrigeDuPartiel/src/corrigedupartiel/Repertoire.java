/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corrigedupartiel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Repertoire {
    private int nbreMax;
    private List<Abonne> abonnes= new ArrayList<Abonne>();
    public Repertoire(int nbreMax){
        this.nbreMax=nbreMax;
    }
    public boolean addAbonne(Abonne abonne){
        if(abonnes.size()==nbreMax){
            return false;
        }
        abonnes.add(abonne);
        return true;
    }
    
    public String getNumero(String nom){
        for (Abonne abonne: abonnes){
            if (abonne.getNom().equals(nom)){
                return abonne.getNumTelephone();
            }
        }
        return "Nom invalide";
    }
    
    public int getNAbonnes(){
        return abonnes.size();
    }
    
    public Abonne getAbonne(int rang){
        return abonnes.get(rang);
    }
    
    public List getAbonneTries(){
        Collections.sort(abonnes);
        return abonnes;
    }
}
