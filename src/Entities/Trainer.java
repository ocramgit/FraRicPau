package Entities;

import java.util.ArrayList;

public class Trainer extends GameEntity {
    private int trainerPokeCoins;
    //private ArrayList<Item> trainerInventory = new ArrayList<>();
    private ArrayList<Pokemon> trainerPokemonList;

    public Trainer(String trainerName) {
        super(trainerName);
        this.trainerPokeCoins = 150;
        this.trainerPokemonList = new ArrayList<>();
    }

    //============== TRAINER METHODS ============\\


    //============== GETTER & SETTER ============\\
    public int getTrainerPokeCoins() {
        return trainerPokeCoins;
    }

    public void setTrainerPokeCoins(int trainerPokeCoins) {
        this.trainerPokeCoins = trainerPokeCoins;
    }

    public ArrayList<Pokemon> getTrainerPokemonList() {
        return trainerPokemonList;
    }

    public void setTrainerPokemonList(ArrayList<Pokemon> trainerPokemonList) {
        this.trainerPokemonList = trainerPokemonList;
    }
}
