package test.Java;

import java.util.ArrayList;
import java.util.List;

import main.Java.Entreprise;
import main.Java.Personne;

public class App {
public static void main(String[] args) {

// this is a comment
	
    Personne personne1 = new Personne("Majda", "Ennahli");
    Personne personne2 = new Personne("Malak", "Iziki");

    List<Personne> employes = new ArrayList<>();
    employes.add(personne1);
    employes.add(personne2);
    Entreprise entreprise = new Entreprise("Mon entreprise", employes);

    System.out.println("Entreprise : " + entreprise.getNom());
    System.out.println("Employés : ");
    for (Personne employe : entreprise.getEmployes()) {
        System.out.println(employe.getPrenom() + " " + employe.getNom());
    }
}
}