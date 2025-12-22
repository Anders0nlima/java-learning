package Step_1_Essential_Fundamentals.Object_Oriented_Programming.RPG_System;

public class Guerreiro extends Personagem implements Combatente{


    public Guerreiro(String nome, double vida, double forca) {
        super(nome, vida, forca);
    }

    @Override
    public void atacar(Combatente alvo) {
        System.out.println("O Guerreiro " + this.nome + " deu " + this.forca + " de dano no oponente");
        alvo.receberDano(this.forca);
    }

    @Override
    public void receberDano(double dano) {
        this.vida -= dano;

        if (this.vida <= 0){
            System.out.println(this.nome + " foi derrotado");
        } else{
            System.out.println(this.nome + " está com " + this.vida + " de vida");
        }
    }
}
