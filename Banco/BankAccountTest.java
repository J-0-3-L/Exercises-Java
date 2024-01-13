package Banco;

public class BankAccountTest {
    public static void main(String[] args){

        BankAccount cuenta = new BankAccount();
        // BankAccount cuenta2 = new BankAccount();

        System.out.println("\nNumero de cuenta: " + cuenta.getNumeroCuenta());
        // System.out.println("\nNumero de cuenta: " + cuenta2.getNumeroCuenta());
        

        // Depositar dinero en las cuentas
        cuenta.depositarEnCorriente(1000);
        cuenta.depositarEnAhorros(500);

        // Verificar saldos
        System.out.println("\nSaldo corriente: " + cuenta.getSaldoCorriente());
        System.out.println("Saldo ahorros: " + cuenta.getSaldoAhorros());

        System.out.println("Dinero total: " + BankAccount.getDineroTotal());

        // Retirar dinero de las cuentas
        cuenta.retirarDeCorriente(50);
        // cuenta.retirarDeAhorros(70);

        // Verificar saldos actualizados
        System.out.println("\nSaldo corriente actualizado: " + cuenta.getSaldoCorriente());
        System.out.println("Saldo ahorros actualizado: " + cuenta.getSaldoAhorros());

        // Ver el saldo total
        System.out.println("Dinero total: " + BankAccount.getDineroTotal());
    
    }
    
}
