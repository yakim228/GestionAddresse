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
public class TestRepertoire {
    
    public static void main(String[] args){
            Repertoire repertoire = new Repertoire(6);
            Abonne mark = new Abonne("12344321", "mark");
            Abonne jean = new Abonne("54321", "jean");
            Abonne rose = new Abonne("0987", "rose");
            
            System.out.println(repertoire.addAbonne(rose));
            System.out.println(repertoire.addAbonne(jean));
            System.out.println(repertoire.addAbonne(mark));
            
            System.out.println(repertoire.getNumero("rose"));
            
            System.out.println(repertoire.getNAbonnes());
            
            System.out.println(repertoire.getAbonne(1));
            
            System.out.println(repertoire.getAbonneTries());
            
            
    }
    
}
