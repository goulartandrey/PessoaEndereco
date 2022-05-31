package app;
import java.util.ArrayList;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	Endereco end;
	public ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	

	public Pessoa() {
		
	}

	public Pessoa(String nome, int idade, char sexo, Endereco end) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.end = end;
	}
	public ArrayList<Pessoa> getLista(){
		return lista;
	}
	
	public void armazenar(Pessoa p1) {
		lista.add(p1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Endereco getEnd() {
		return end;
	}

	public void setEnd(Endereco end) {
		this.end = end;
	}

	@Override
	public String toString() {
		return "Nome:" + nome + " Idade: " + idade + " Sexo: " + sexo + " Endereço: " + end;
	}

	
	
}
