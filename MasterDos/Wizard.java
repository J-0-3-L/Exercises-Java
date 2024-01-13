package MasterDos;

public class Wizard extends Human{

    public Wizard(String nombre) {
        super(nombre);
        health=50;
        intelligence=8;
    }

    public void heal(Human e){
        e.health += intelligence;
        System.out.println("Has curado a " + e.getNombre() + " en " + intelligence + " puntos de salud!");
    }

    public void fireBall(Human e){
        int damage = intelligence * 3;
        e.health -= damage;
        System.out.println("Has lanzado una bola de fuego a " + e.getNombre() + " y le has causado " + damage + " puntos de damage!");
    }
}
