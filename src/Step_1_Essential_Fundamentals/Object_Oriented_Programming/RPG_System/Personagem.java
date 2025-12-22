package Step_1_Essential_Fundamentals.Object_Oriented_Programming.RPG_System;

public abstract class Personagem {
    protected String nome;
    protected double vida;
    protected double forca;

    public Personagem(String nome, double vida, double forca){
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

   public String getNome(){
        return nome;
   }

   public void setNome(String nome){
        this.nome = nome;
   }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getForca() {
        return forca;
    }

    public void setForca(double forca) {
        this.forca = forca;
    }
}
