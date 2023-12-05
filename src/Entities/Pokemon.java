package Entities;

public class Pokemon extends GameEntity {
    private int pokemonLevel;
    private int pokemonLife;
    private int pokemonAttackDamage;

    public Pokemon(String pokemonName, int pokemonLevel, int pokemonLife, int pokemonAttackDamage) {
        super(pokemonName);
        this.pokemonLevel = pokemonLevel;
        this.pokemonLife = pokemonLife;
        this.pokemonAttackDamage = pokemonAttackDamage;
    }

    //============== POKEMON METHODS ============\\

    //============== GETTER & SETTER ============\\

    public int getPokemonLevel() {
        return pokemonLevel;
    }

    public void setPokemonLevel(int pokemonLevel) {
        this.pokemonLevel = pokemonLevel;
    }

    public int getPokemonLife() {
        return pokemonLife;
    }

    public void setPokemonLife(int pokemonLife) {
        this.pokemonLife = pokemonLife;
    }

    public int getPokemonAttackDamage() {
        return pokemonAttackDamage;
    }

    public void setPokemonAttackDamage(int pokemonAttackDamage) {
        this.pokemonAttackDamage = pokemonAttackDamage;
    }
}
