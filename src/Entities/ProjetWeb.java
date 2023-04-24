package Entities;

public class ProjetWeb extends Projet
{
    private int nbPages;
    private boolean responsive;

    public ProjetWeb(int idProjet, String nomProjet, int tauxHoraire, double duree, int i, boolean b) {
        super(idProjet, nomProjet, tauxHoraire, duree);

    }


    @Override
    public double calculerMontant() {
        return super.calculerMontant()+nbPages*100;
    }

    @Override
    public String getInfos() {
        return super.getInfos()+"nb de pages"+nbPages+"Responsive"+responsive;
    }
}
