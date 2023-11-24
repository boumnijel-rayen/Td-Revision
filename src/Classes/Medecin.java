package Classes;

public class Medecin {
    private int cin;
    private String nom;
    private String prenom;
    private int numOrdre;
    public Medecin(int cin, String nom, String prenom, int numOrdre) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.numOrdre = numOrdre;
    }
    public int getCin() {
        return cin;
    }
    public void setCin(int cin) {
        this.cin = cin;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getNumOrdre() {
        return numOrdre;
    }
    public String toString() {
        return cin + " " + nom + " " + prenom + " " + numOrdre;
    }
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(!(obj instanceof Medecin)) {
            return false;
        }
        if (obj.getClass() != this.getClass())
            return false;
        Medecin medecin = (Medecin) obj;
        return medecin.cin == this.cin;
    }
}
