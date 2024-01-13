package Master;

public class Human extends Atributo {
    public void attack(Human luchador) {
        luchador.health -= strength;
        System.out.println("Ataque exitoso , la salud del enemigo se a reducido en " + strength + " puntos.");
    }
}
