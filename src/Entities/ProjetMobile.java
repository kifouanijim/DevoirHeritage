package Entities;

public class ProjetMobile extends Projet
{
    private int nbEcrans;

    public ProjetMobile(int idProjet, String nomProjet, int tauxHoraire, double duree, int i) {
        super(idProjet, nomProjet, tauxHoraire, duree);
    }


    @Override
    public double calculerMontant() {
        return super.calculerMontant()+nbEcrans * 200;
    }

    @Override
    public String getInfos() {
        return super.getInfos()+"nb ecran"+nbEcrans;
    }
}
