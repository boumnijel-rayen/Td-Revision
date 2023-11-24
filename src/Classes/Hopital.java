package Classes;

import java.util.HashMap;
import java.util.Map;

public class Hopital {
    public Map<Medecin,ListPatients> medecinPatiens;
    public Hopital(){
        medecinPatiens = new HashMap<Medecin,ListPatients>();
    }
    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m,new ListPatients());
    }
    public void ajouterPatient(Medecin m,Patient p){
        if(medecinPatiens.containsKey(m)){
            medecinPatiens.get(m).ajouterPatient(p);
        }else {
            System.out.println("Medecin n'existe pas");
        }
    }
    /*Avec l&#39;api stream */
    public void afficherMap(){
        medecinPatiens.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey());
            entry.getValue().afficherPatients();
        });
    }
    /* Afficher les patients d’un medecin dont le nom est &quot;mohamed&quot; */
    public void afficherMedcinPatients (Medecin m){
        if(medecinPatiens.containsKey(m)){
            medecinPatiens.get(m).afficherPatients();
        }else {
            System.out.println("Medecin n'existe pas");
        }
    }
}
