public class ContaPoupanca extends Conta{
    private double taxaDeJuros;

    public void calculaJuros(){

        double juros = this.getSaldo() * taxaDeJuros;
        System.out.println("Juros Atual:" + juros
        );
    }

    public void sacar(double valor){
        double taxaSaque = 0.01;
        super.sacar(valor + taxaSaque);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
