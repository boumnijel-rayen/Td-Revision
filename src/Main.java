import Classes.ListPatients;
import Classes.Patient;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ListPatients listPatients = new ListPatients();

        /*listPatients.ajouterPatient(new Patient(1, "A", "B", 1));
        listPatients.ajouterPatient(new Patient(2, "C", "D", 2));
        listPatients.ajouterPatient(new Patient(3, "E", "F", 3));

        listPatients.afficherPatients();
        System.out.println();

        System.out.println(listPatients.rechercherPatient(new Patient(1, "A", "B", 1)));

        System.out.println(listPatients.rechercherPatient(1));

        listPatients.trierPatientsParNom();

        listPatients.afficherPatients();
        System.out.println();

        listPatients.supprimerPatient(new Patient(1, "A", "B", 1));

        listPatients.afficherPatients();
        System.out.println();*/

        listPatients.ajouterPatient(new Patient(1, "A", "B", 1));
        listPatients.ajouterPatient(new Patient(1, "A", "B", 1));


        listPatients.PatientSansRedondance();
    }
}