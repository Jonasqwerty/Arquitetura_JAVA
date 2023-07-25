package Model;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private int idade;
	private String email;
	private String endereco;
	private String naturalidade;
	private RedesSociais rede; 
	
	public Pessoa(String primeiroNome, String ultimoNome, int idade, String email, String endereco, String naturalidade, RedesSociais rede) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.idade = idade;
		this.email = email;
		this.endereco = endereco;
		this.naturalidade = naturalidade;
		this.rede = rede;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public RedesSociais getRede() {
		return rede;
	}

	public void setRede(RedesSociais rede) {
		this.rede = rede;
	}
	
	

}
