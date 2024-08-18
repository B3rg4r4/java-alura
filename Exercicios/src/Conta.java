public class Conta {

    private String titular;
    private double saldo;

    public void sacar ( double valor ){

        if (valor <= 0){
            System.out.println("O valor deve ser maior que zero !!");

        }else if(saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso. Saldo atual:" + saldo );

        } else {
            System.out.println("Saldo insuficiente !");
        }

    }
    public void depositar(double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.println(" Deposito realizado com o valor de " + valor + " O saldo atual e de " + saldo );
        } else {
            System.out.println("O valor deve ser maior que 0");
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
