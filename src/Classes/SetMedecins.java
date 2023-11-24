package Classes;

import java.util.Set;
import java.util.TreeSet;

public class SetMedecins {
    private Set<Medecin> setM;
    public SetMedecins(){
        setM = new TreeSet<Medecin>();
    }
    public void ajouterMedecin(Medecin m) throws MedecinException {
        if(setM.contains(m))
            throw new MedecinException("Medecin existe deja");
        setM.add(m);
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return setM.stream().filter(medecin -> medecin.getCin() == cin).count() > 0;
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(medecin -> System.out.println(medecin));
    }
    /* Avec l’api Stream */
    public long nombreMedecins(){
        return setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        return setM.stream().sorted().collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
    }
}
