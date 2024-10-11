package board;


import personnages.Personnage;

public class CaseVide implements Case {
    @Override
    public void doAction(Personnage personnage) {
        System.out.println( "\n\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤" );
        System.out.println( "¤ Vous êtes sur une case est vide ! ¤" );
        System.out.println( "¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n\n" );
    }
}
