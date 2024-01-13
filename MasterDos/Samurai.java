package MasterDos;

public class Samurai extends Human {
    public Samurai(String nombre) {
        super(nombre);
        health = 200;
    }

    public void deathBlow(Human f){
        f.health = 0;
        health /= 2;
        System.out.println("Has ejecutado un golpe mortal a " + f.getNombre() + ". Su salud se ha reducido a 0 y tu salud ahora es " + health + ".");
    }

    public void meditate(){
        int healingAmount = health / 2;
        health += healingAmount;
        System.out.println("Estas meditando y te has curado en " + healingAmount + " puntos de salud!");
    }

    public int howMany(){
        return 1;
    }
}
