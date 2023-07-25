package Model;

public class PessoaBuilder {
	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	private String email;
	private String endereco;
	private String naturalidade;
	private RedesSociais rede;
	
	public PessoaBuilder setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
		return this;
	}
	
	public PessoaBuilder setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
		return this;
	}
	
	public PessoaBuilder setIdade(int idade) {
		this.idade = idade;
		return this;
	}
	
	public PessoaBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public PessoaBuilder setEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}
	
	public PessoaBuilder setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
		return this;
	}

	public PessoaBuilder setRede(RedesSociais rede) {
		this.rede = rede;
		return this;
	}

	public Pessoa build() {
		return new Pessoa(primeiroNome, ultimoNome, idade, email, endereco, naturalidade, rede);
	}

}
