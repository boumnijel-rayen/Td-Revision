package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ListPatients implements InterfacePatient{

    private List<Patient> listP;

    public ListPatients(){
        listP = new ArrayList<Patient>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }
    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(Patient p){
        return listP.stream().filter(patient -> patient.equals(p)).count() > 0;
    }
    /* Avec l’api Stream */
    public boolean rechercherPatient(int cin) {
        return listP.stream().filter(patient -> patient.getCin() == cin).count() > 0;
    }
    public void afficherPatients() {
        listP.stream().forEach(patient -> System.out.println(patient));
    }
    /* Avec l’api Stream */
    public void trierPatientsParNom() {
        listP.stream().sorted((p1, p2) -> p1.getNom().compareTo(p2.getNom()));
    }
    /* Avec l'api stream */
    public void PatientSansRedondance(){
        listP.stream().distinct().collect(Collectors.toList()).forEach(patient -> System.out.println(patient));
    }
}
