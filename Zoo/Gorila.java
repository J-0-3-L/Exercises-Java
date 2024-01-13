package Zoo;

class Gorila extends Mammal {

    public void throwSomething() {
        energyLevel -= 5;
        System.out.println("El gorila ha tirado algo!");
        System.out.println("Energia del animal: "+energyLevel);
    }

    public void eatBananas() {
        energyLevel += 10;
        System.out.println("\nEl gorila esta satisfecho despues de comer platanos");
        System.out.println("Energia del animal: "+energyLevel);
    }

    public void climb() {
        energyLevel -= 10;
        System.out.println("\nEl gorila ha trepado un arbol!");
        System.out.println("Energia del animal: "+energyLevel);
        
    }
}
