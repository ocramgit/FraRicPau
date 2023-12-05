package Entities;

import java.util.ArrayList;

public class NPC extends GameEntity {
    private ArrayList<Pokemon> npcPokemonList;

    public NPC(String npcName) {
        super(npcName);
        this.npcPokemonList = new ArrayList<>();
    }

    //================ NPC METHODS ============\\


    //============== GETTER & SETTER ============\\

    public ArrayList<Pokemon> getNpcPokemonList() {
        return npcPokemonList;
    }

    public void setNpcPokemonList(ArrayList<Pokemon> npcPokemonList) {
        this.npcPokemonList = npcPokemonList;
    }
}
