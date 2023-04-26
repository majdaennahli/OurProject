package main.Java;

import java.util.List;

public class Entreprise {
    private String nom;
    private List<Personne> employes;

    public Entreprise(String nom, List<Personne> employes) {
        this.nom = nom;
        this.employes = employes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Personne> getEmployes() {
        return employes;
    }

    public void setEmployes(List<Personne> employes) {
        this.employes = employes;
    }

	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", employes=" + employes + "]";
	}
    
}