package Step_1_Essential_Fundamentals.Object_Oriented_Programming.RPG_System;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    List<Combatente> membros = new ArrayList<>();

    public void adicionarMembro(Combatente combatente){
        membros.add(combatente);
    }

    public void sofrerAtaque(double danoTotal){
        List<Combatente> vivos = new ArrayList<>();
        for (Combatente c: membros){
            if (c instanceof Personagem){
                if (((Personagem) c).getVida() > 0){
                    vivos.add(c);
                }
            }
        }

        if (vivos.isEmpty()){
            System.out.println("A equipe ja foi derrotada");
            return;
        }

        double danoPorMembro = danoTotal/ vivos.size();
        System.out.println("O ataque de " + danoTotal + "foi dividido entre " + vivos.size() + " membros");
        //Esse metodo deve distribuir o dano igualmente entre todos os membros da equipe que ainda têm vida

        for(Combatente vivo: vivos){
            vivo.receberDano(danoPorMembro);
        }
    }
}
