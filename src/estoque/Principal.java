package estoque;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.ativar();
        produto.adicionarEstoque(20);

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada");

                break; /* se chegar a executar ele sai do while usando break*/
            } catch (IllegalArgumentException iae) { /* caso ele saia ele printa na tela o erro */
//                iae.printStackTrace(System.out);
                iae.printStackTrace(); /* vai imprimir o erro no console */
                System.out.println("Erro na compra: " + iae.getMessage());
            }
        } while (true); // Loop infinito, vai ficar retornando pro do
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
//        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                    quantidade, produto.getQuantidadeEstoque());
//        } catch (IllegalArgumentException iae) {
//            System.out.println("Erro ao efetuar baixa no estoque: " + iae.getMessage());
//            throw iae;
//        }
    }

}
