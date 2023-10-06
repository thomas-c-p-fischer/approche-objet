package entities;

public class Personne{
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	 public Personne(String name, String surname, AdressePostale adr) {
		nom = name;
		prenom = surname;
		adresse = adr;
	}
	 
	 @Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + "]";
	}

	public void afficherNomMajPrenom(String name, String firstName) {
		 System.out.println("NOM : " + name.toUpperCase() + ", Prénom : " + firstName);
	 }
	 
	 public void setNom(String name) {
		 this.nom = name;
	 }
	 
	 public String getNom() {
		 return this.nom;
	 }
	 
	 public void setPrenom(String surName) {
		 this.prenom = surName;
	 }
	 
	 public String getPrenom() {
		 return this.prenom;
	 }
	 
	 public void setAdresse(AdressePostale adr) {
		 this.adresse = adr;
	 }
	 
	 public AdressePostale getAdresse() {
		 return this.adresse;
	 }
	 
	 

}
