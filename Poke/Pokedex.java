package Poke;

public class Pokedex extends AbstractPokemon {
    private int myPokemons;

    public void listPokemon() {
        System.out.println("Numero de pokemones en la Pokedex: " + myPokemons);
    }

    public void setMyPokemons(int myPokemons) {
        this.myPokemons = myPokemons;
    }

    public int getMyPokemons() {
        return myPokemons;
    }
}


