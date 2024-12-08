public class CalculadoraDivisas {

    double total;

    public void calculadora(double valorUser, double tasaCambio, String divisa){
        this.total = valorUser * tasaCambio;
        System.out.println("-----------------------------------");
        System.out.println("Valor = " + this.total + " " + divisa);
        System.out.println("-----------------------------------");
    }
}
