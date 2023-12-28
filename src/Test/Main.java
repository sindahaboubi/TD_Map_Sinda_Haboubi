package Test;

import classes.Departement;
import classes.Employe;
import classes.SocieteHashMap;
import classes.SocieteTreeMap;
import interfaces.InterfaceSociete;

public class Main {
    public static void main(String[] args) {
        InterfaceSociete societeHashMap = new SocieteHashMap();
        Employe e1 = new Employe("14547855", "ETU1", "Haboubi", "Sinda");
        Employe e2 = new Employe("789012", "ETU2", "Rabhi", "Mariem");
        Departement departement1 = new Departement(1, "Informatiques");
        Departement departement2 = new Departement(2, "Finances");

        societeHashMap.ajouterEmployeDepartement(e1, departement1);
        societeHashMap.ajouterEmployeDepartement(e2, departement2);
        societeHashMap.afficherLesEmployesLeursDepartements();

        InterfaceSociete societeTreeMap = new SocieteTreeMap();

        Employe e3 = new Employe("345678", "E003", "Halloul", "NourAllah");
        Employe e4 = new Employe("901234", "E004", "Msahli", "Aziz");

        Departement departement3 = new Departement(3, "Marketing");
        Departement departement4 = new Departement(4, "RH");

        societeTreeMap.ajouterEmployeDepartement(e3, departement3);
        societeTreeMap.ajouterEmployeDepartement(e4, departement4);

        societeTreeMap.afficherLesEmployesLeursDepartements();
    }
}
