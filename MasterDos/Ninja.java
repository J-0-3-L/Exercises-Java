package MasterDos;

public class Ninja extends Human {
    
    public Ninja(String nombre) {
        super(nombre);
        stealth = 10;
    }

    public void steal(Human n){
        int stolenHealth = stealth;
        n.health -= stolenHealth;
        health += stolenHealth;
        System.out.println("Has robado " + stolenHealth + " puntos de salud de " + n.getNombre() + "!");
    }

    public void runAway(){
        stealth-=10;
        System.out.println("Te has escapado! Tu sigilo se ha reducido en 10 puntos.");
    }

}
