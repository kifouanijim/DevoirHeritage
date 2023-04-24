package Entities;

public class Projet implements Comparable<Projet>
{
    private int idProjet;
    private double duree;
    private int tauxHoraire;
    private String nomProjet;

    public Projet(int idProjet, String nomProjet, int tauxHoraire, double duree) {
        this.idProjet = idProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
        this.nomProjet = nomProjet;
    }

    @Override
    public int compareTo(Projet o) {
        return Integer.compare((int) o.tauxHoraire, (int) this.tauxHoraire);
    }
    public double calculerMontant(){
        return duree * tauxHoraire * 8;
    }
    public String getInfos(){
        return"Numero"+idProjet+"Nom"+nomProjet+"Durée"+duree+"taux horaire"+tauxHoraire;
    }
}
