package MasterDos;

public class Human {
    int strength=3;
    int stealth=3;
    int intelligence=3;
    int health=100;
    String nombre;

    public Human(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
