package clausula_finally;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Principal {

    public static void main(String[] args) {
        Path arquivo = Path.of("/Users/thiago/Desktop/teste2.txt");
        BufferedReader reader = null;

        try {
            reader = Files.newBufferedReader(arquivo); // leitura de arquivos
            System.out.println(reader.readLine()); // vai ler a primeira linha do txt

            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        } finally { /* finally 'finalmente' -  ele sempre vai ser executado no termino, independente se der certo ou nao   */
            try {
                reader.close(); // boa pratica sempre fechar
            } catch (IOException ex) {
                System.out.println("Erro fechando leitor de arquivo");
            }
        }
    }

}