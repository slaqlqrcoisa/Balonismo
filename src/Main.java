public class Main {
public static void main(String[] args) {


    Balao b1 = new Balao();

    String resposta = b1.voar(new Combustivel());

        System.out.println(resposta);

        Balao b2 = new Balao();
        Combustivel alcool = new Combustivel();
        System.out.println(b2.voar(alcool));


    }


}