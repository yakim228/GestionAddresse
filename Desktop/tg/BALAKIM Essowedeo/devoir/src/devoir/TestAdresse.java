/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAdresse {

    /**
     * 
     */
    public static File ajouter(Adresse adresse, File file){
        List liste = lire(file);
        liste.add(adresse);
        return ecrire(liste,file);
    }
    static List<Adresse> lire(File file1){
        List<Adresse> liste;
        liste = new ArrayList();
        try{
            FileInputStream fis = new FileInputStream(file1);
            ObjectInputStream oos = new ObjectInputStream(fis);
            do{
                Object o = (List)oos.readObject();
               if (o==null) break;
               liste =(List) o;
            }while(true);
        }catch(Exception e){
            e.getMessage();
        }
        
        return liste;
    }
    
    static List<Adresse> valideEmail(List<Adresse> adresses){
        List listeObtenue=new ArrayList();
        for(Adresse adresse:adresses){
            if(verifierEmail(adresse.getEmail())){
                listeObtenue.add(adresse);
            }
        }
        return listeObtenue;
    }
    static List<Adresse> valideTelephone(List<Adresse> adresses){
        List listeObtenue=new ArrayList<Adresse>();
        for(Adresse adresse:adresses){
            if(verifierTelephone(adresse.getTelephone())){
                listeObtenue.add(adresse);
            }
        }
        return listeObtenue;
    }
    static List<Adresse> trierParQuartier(File file){
        List<Adresse> listeTriee= lire(file);
        Collections.sort(listeTriee);        
        return listeTriee;
    }
    
    static File ecrire(List<Adresse> liste ,File file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(liste);
            
        }catch(IOException e){
            e.getMessage();
        }
        return file;
    }
    static boolean verifierTelephone(String telephone){
        Pattern pattern = Pattern.compile("\\b00228-[0-9]{2}-[0-9]{2}-[0-9]{2}-[0-9]{2}\\b");
        Matcher matcher = pattern.matcher(telephone);
        boolean flag = matcher.matches();
        return flag;
    }
    static boolean verifierEmail(String email){
        Pattern pattern = Pattern.compile("\\b\\w{4,20}@\\w{5,10}.\\w{2,}\\b");
        Matcher matcher = pattern.matcher(email);
        boolean flag = matcher.matches();
        return flag;
    }
    
    
    public static void main(String[] args) {
        File file= new File("addres.tmp");
        ArrayList<Adresse> adresses= new ArrayList();
       
       
        Adresse adresse1 = new Adresse("2km du National numero 1", "Agoe-gnamassi","00228-92-22-33-22","adresse@gmail.com");
        Adresse adresse2 =new Adresse("Zone portuaire", "Adakpame","00228-22-52-13-25","adresAx1@gmail.com");
        Adresse adresse3 = new Adresse("17km du RAMCO", "Agoe-gnamassi","00229-94-25-33-20","AppTg123@gmail.com");
        Adresse adresse4 = new Adresse("5km du National numero 2", "Agoe","00228-2-22-33-22","Gneko@gmail.com");
        Adresse adresse5 = new Adresse("Proche de Togocel", "","00220-90-23-a2-23","adresse@gmail.com");
        adresses.add(adresse1);
        adresses.add(adresse2);
        adresses.add(adresse3);
        adresses.add(adresse4);
        adresses.add(adresse5);
        ajouter(adresse1, file);
        for(Object adresse:adresses){
            ajouter((Adresse) adresse, file);
        }
        
        System.out.println("===========================Contenue du fichier===================================");
        System.out.println(lire(file).size());
        System.out.println("=============================Liste des Adresse ayant Email valide=================================");
        System.out.println(valideEmail(adresses));
        System.out.println("==============================Liste des adresse de numero de Telephone valide================================");
        System.out.println(valideTelephone(adresses));
       
        System.out.println("==========================Liste triee ====================================");
        System.out.println(trierParQuartier(file));
        System.out.println("==============================================================");
        
    }
    
}
