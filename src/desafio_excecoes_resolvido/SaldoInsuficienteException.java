package desafio_excecoes_resolvido;

public class SaldoInsuficienteException extends OperacaoBancariaException {

    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public SaldoInsuficienteException(String message, Throwable cause) {
        super(message, cause);
    }

}
