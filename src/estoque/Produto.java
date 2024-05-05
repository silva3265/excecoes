package estoque;

import java.util.Objects;

public class Produto {

	private String nome;
	private int quantidadeEstoque;
	private boolean ativo;

	public Produto(String nome) {
		setNome(nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Objects.requireNonNull(nome, "Nome deve ser informado"); /* � um classe utilitaria para dizer que o nome deve ser informado */
		this.nome = nome;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public boolean isInativo() {
		return !isAtivo();
	}

	public void ativar() {
		this.ativo = true;
	}

	public void desativar() {
		this.ativo = false;
	}

	public void retirarEstoque(int quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("Quantidade não pode ser negativa para retirada no estoque"); /* IllegalArgumentException - ja lan�a e instancia na frente  */
		}

		if (isInativo()) {
			throw new IllegalStateException("Retirada no estoque não pode ser realizada em produto inativo"); /* IllegalStateException - � usada quando estado do objeto atual ele esta ilegal para a opera��o ser executada*/
		}

		if (this.quantidadeEstoque - quantidade < 0) {
			throw new IllegalArgumentException("Quantidade inválida porque estoque ficaria negativo");
		}

		this.quantidadeEstoque -= quantidade;
	}

	public void adicionarEstoque(int quantidade) {
		this.quantidadeEstoque += quantidade;
	}

}