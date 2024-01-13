package ProyectClass;

public class ProjecTest {
    public static void main(String[] args){
        Projec  salida = new Projec("NovelPedia","Encuentras las novelas de la actualidad");
        salida.setCost(100.50);
        System.out.println(salida.elevatorPitch());
    }
}
