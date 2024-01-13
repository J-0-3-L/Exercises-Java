package ZooDos;

public class Bat extends Especimen{

    public void fly(){
        energia-=50;
        System.out.println("\nZzZ...Zumm...ZzZ");
        System.out.println("Energia del especimen: "+energia);
    }

    public void eatHumans(){
        energia+=25;
        System.out.println("\nBueno, no importa");
        System.out.println("Energia del especimen: "+energia);
    }

    public void attackTown(){
        energia-=100;
        System.out.println("Boom,Bam,Crash!!!");
        System.out.println("Energia del especimen: "+energia);
    }
}
