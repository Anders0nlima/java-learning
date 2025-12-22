package Step_1_Essential_Fundamentals.Object_Oriented_Programming.RPG_System;

public class Mago extends Personagem implements Combatente{

    protected double mana;

    public Mago(String nome, double vida, double forca, double mana) {
        super(nome, vida, forca);
        this.mana = mana;
    }

    @Override
    public void atacar(Combatente alvo){
        if (mana >= 10){
            System.out.println("O Mago " + this.nome + " deu " + ((this.forca)*2.0) + " em seu oponete" );
        }else{
            System.out.println("O Mago " + this.nome + " deu " + this.forca + " em seu oponete" );
        }
        alvo.receberDano(this.forca);
        //gasta 10 de mana para dar o dobro da forca como dano
    }

    @Override
    public void receberDano(double dano) {
        this.vida -= dano;

        if (this.vida <= 0){
            System.out.println(this.nome + " foi derrotado");
        }else{
            System.out.println(this.nome + " está com " + this.vida + " de vida");
        }
    }
}
