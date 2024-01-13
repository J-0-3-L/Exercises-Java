package ZooDos;

public class BatTest {
    public static void main(String[] args){
        Bat accion= new Bat();

        accion.displayEnergy();

        accion.attackTown();
        accion.attackTown();
        accion.attackTown();

        accion.eatHumans();
        accion.eatHumans();

        accion.fly();
        accion.fly();

        accion.displayEnergy();
    }
}
