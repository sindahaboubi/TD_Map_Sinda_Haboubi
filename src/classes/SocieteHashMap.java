package classes;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import classes.Employe;
import interfaces.InterfaceSociete;
import classes.Departement;

public class SocieteHashMap implements InterfaceSociete {
	private Map<Employe, Departement> HashMap1;
	
    public SocieteHashMap() {
        this.HashMap1 = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
    	HashMap1.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
    	HashMap1.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : HashMap1.entrySet()) {
            System.out.println(entry.getKey() + " est un membre du département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : HashMap1.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : HashMap1.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = HashMap1.get(e);
        if (d != null) {
            System.out.println(e.getNom() + " est un membre du département " + d);
        } else {
            System.out.println(e.getNom() + " n'est pas un membre du département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return HashMap1.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return HashMap1.containsValue(d);
    }

}
