package app;

public class Endereco {

	private String logradouro, complemento, cep;
	private int numero;
	
	public Endereco() {
		
	}
	
	public Endereco(String logradouro, String complemento, String cep, int numero) {
		this.logradouro = logradouro;
		this.complemento = complemento;
		this.cep = cep;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Logradouro:" + logradouro + " Complemento:" + complemento + " CEP:" + cep + " Numero:"
				+ numero;
	}
	
}
