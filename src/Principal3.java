public class Principal3 {

    public static void main(String[] args) {
        System.out.println("Início");

        Double valor = null; /* tem uma referencia nulla */
        valor.intValue(); /* esta tentando acessar um valor mais o valor esta recebendo um valor nulo */

        System.out.println("Fim");
    }

}