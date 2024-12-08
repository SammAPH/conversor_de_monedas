import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        double valorUser = 0;
        double tasaCambio = 0;
        Menu menu = new Menu();

        while (numero != 7) {

            menu.printMenu();
            numero = entrada.nextInt();
            
            if(numero != 7){

                System.out.println("Introduzca el valor a convertir: ");
                valorUser = entrada.nextDouble();

                Menu UserIn = new Menu();
                UserIn.urlUser(numero);
                System.out.println(UserIn.toString());
                ConsultaApi consulta = new ConsultaApi();

                try {
                    Response respuesta = consulta.convertir(UserIn.toString());
                    System.out.println(respuesta);
                    tasaCambio = respuesta.conversion_rates().get(UserIn.divisa(UserIn.toString()));
                    CalculadoraDivisas valores = new CalculadoraDivisas();
                    valores.calculadora(valorUser, tasaCambio, UserIn.divisa(UserIn.toString()));
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }
        System.out.println("Bye =)");
    }
}
