package MasterDos;

public class HumanTest {
    public static void main(String[] args){
        Human luchador = new Human("Kail");

        Wizard wizard = new Wizard("Merlín");
        Ninja ninja = new Ninja("Tobi");
        Samurai samurai = new Samurai("Sagiri");

        wizard.heal(luchador);
        wizard.fireBall(luchador);

        ninja.steal(luchador);
        ninja.runAway();

        samurai.deathBlow(luchador);
        samurai.meditate();
        samurai.howMany();
    }
}
