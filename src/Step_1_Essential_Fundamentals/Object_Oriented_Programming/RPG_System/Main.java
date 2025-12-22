package Step_1_Essential_Fundamentals.Object_Oriented_Programming.RPG_System;

public class Main {
    public static void main(String[] args) {
        Equipe minhaEquipe = new Equipe();
        minhaEquipe.adicionarMembro(new Guerreiro("Anderson", 100.0, 20.0));
        minhaEquipe.adicionarMembro(new Mago("Felipe", 100.0, 40.0, 10.0));

        minhaEquipe.sofrerAtaque(40.0);

    }
}
