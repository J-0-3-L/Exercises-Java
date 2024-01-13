package Banco;
import java.util.Random;

public class BankAccount {
    private String numeroCuenta;
    private double saldoCorriente;
    private double saldoAhorros;
    private static int cuentasCreadas = 0;
    private static double dineroTotal = 0;

    //Llamar numero de cuenta:
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    //Creacion del numero de cuenta:
    private String generarNumeroCuenta() {
        Random random = new Random();
        String numeroCuenta = "";
        for (int i = 0; i<10; i++) {
            int digito = random.nextInt(10);
            numeroCuenta += digito;
        }
        return numeroCuenta;
    }

    //Constructor:
    public BankAccount() {
        this.numeroCuenta = generarNumeroCuenta();
        cuentasCreadas++;
    }

    //getters:
    public double getSaldoCorriente() {
        return saldoCorriente;
    }
    public double getSaldoAhorros() {
        return saldoAhorros;
    }

    //metodos de deposito y retiro:
    public void depositarEnCorriente(double dinero) {
        saldoCorriente += dinero;
        dineroTotal += dinero;
    }
    public void depositarEnAhorros(double dinero) {
        saldoAhorros += dinero;
        dineroTotal += dinero;
    }
    public void retirarDeCorriente(double dinero) {
        if (saldoCorriente >= dinero) {
            saldoCorriente -= dinero;
            dineroTotal -= dinero;
            System.out.println("\nMonto retirado de cuenta corriente: "+ dinero);
        } else {
            System.out.println("Fondos insuficientes en cuenta corriente.");
        }
    }
    public void retirarDeAhorros(double dinero) {
        if (saldoAhorros >= dinero) {
            saldoAhorros -= dinero;
            dineroTotal -= dinero;
            System.out.println("Monto retirado de cuenta ahorros: "+ dinero);
        } else {
            System.out.println("Fondos insuficientes en cuenta de ahorros.");
        }
    }

    //getter para llamar total y nª cuentas:
    public static int getCuentasCreadas() {
        return cuentasCreadas;
    }

    public static double getDineroTotal() {
        return dineroTotal;
    }
}
