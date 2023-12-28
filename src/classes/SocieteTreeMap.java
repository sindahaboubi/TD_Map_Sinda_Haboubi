package classes;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

import interfaces.InterfaceSociete;

public class SocieteTreeMap implements InterfaceSociete{
    private Map<Employe, Departement> TreeMap1;

    public SocieteTreeMap() {
        this.TreeMap1 = new TreeMap<>(Comparator.comparing(Employe::getCin));
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
    	TreeMap1.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
    	TreeMap1.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : TreeMap1.entrySet()) {
            System.out.println(entry.getKey() + " est un membre du département " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : TreeMap1.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (Departement d : TreeMap1.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = TreeMap1.get(e);
        if (d != null) {
            System.out.println(e.getNom() + " est un membre du département " + d);
        } else {
            System.out.println(e.getNom() + " n'est pas un membre du département.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return TreeMap1.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return TreeMap1.containsValue(d);
    }
}
