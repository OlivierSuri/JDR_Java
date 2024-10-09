package Board;


import personnages.Personnage;

public class CaseVide implements Case {
    @Override
    public void doAction(Personnage personnage) {
        System.out.println( "Cette case est vide ! \n Continuez" );
    }
}
