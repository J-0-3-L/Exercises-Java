package Master;

public class HumanTest {
    public static void main(String[] args){
        Human luchador = new Human();
        Human luchador2= new Human();

        System.out.println("Salud del luchador: " + luchador.health);
        System.out.println("Salud del luchador enemigo: " + luchador2.health);

        luchador.attack(luchador2);
        
        System.out.println("Salud del luchador enemigo: " + luchador2.health);
    }
}
