package Poke;

public class PokemonTest {
    public static void main(String[] args) {
        // Pokemon
        Pokemon pikachu = new Pokemon("Pikachu", 100, "Electric");

        // Crear una Pokedex
        Pokedex pokedex = new Pokedex();

        // Atacante
        Pokemon squirtle = pokedex.createPokemon("Squirtle", 80, "Water");
        pikachu.attackPokemon(squirtle);

        // Listar todos los Pokemones en la Pokedex
        // String pok=pokedex.pokemonInfo(squirtle);
        // System.out.println(pok);
        pokedex.setMyPokemons(Pokemon.getCount());
        pokedex.listPokemon();
    }
}
