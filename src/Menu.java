public class Menu {
    private int numero;
    private String urlResp;
    private String divisa;

    public String urlUser(int numero) {
        switch (numero){
            case 1:
                this.urlResp = "USD";
                this.numero = numero;
                break;
            case 2:
                this.urlResp = "ARS";
                this.numero = numero;
                break;
            case 3:
                this.urlResp = "USD";
                this.numero = numero;
                break;
            case 4:
                this.urlResp = "BRL";
                this.numero = numero;
                break;
            case 5:
                this.urlResp = "USD";
                this.numero = numero;
                break;
            case 6:
                this.urlResp = "COP";
                this.numero = numero;
                break;
        }
        return this.urlResp;
    }
    public String divisa(String urlResp){
        if(this.urlResp == "USD" && this.numero == 1){
            this.divisa = "ARS";
        }else if(urlResp == "ARS" && this.numero == 2){
            this.divisa = "USD";
        }else if(urlResp == "USD" && this.numero == 3){
            this.divisa = "BRL";
        }else if(urlResp == "BRL" && this.numero == 4){
            this.divisa = "USD";
        }else if(urlResp == "USD" && this.numero == 5){
            this.divisa = "COP";
        }else if(urlResp == "COP" && this.numero == 6){
            this.divisa = "USD";
        }
        return this.divisa;
    }
    public void printMenu(){
        System.out.println("Bienvenido al conversor de monedas, escoja una opción:");
        System.out.println("""
                **************************************************
                1) Dólar =>> Peso argentino
                2) Peso argentino =>> Dólar
                3) Dólar =>> Real brasileño
                4) Real brasileño =>> Dólar
                5) Dólar =>> Peso colombiano
                6) Peso colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                **************************************************""");
    }

    @Override
    public String toString() {
        return urlResp;
    }
}
