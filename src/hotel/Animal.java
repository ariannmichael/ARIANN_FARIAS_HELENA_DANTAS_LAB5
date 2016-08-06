package hotel;

public class Animal {
	String nome;
	String tipo;
	int idade;

	public Animal(String nome, String tipo, int idade) throws Exception {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		if(nome == null || nome.trim().equals("")){
			throw new Exception("Nome invalido");
		}
		if(tipo == null || tipo.trim().equals("")){
			throw new Exception("Tipo invalido");
		}
		if(idade < 0){
			throw new Exception("Idade invalida");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal novoAnimal = (Animal) obj;
			if (novoAnimal.getNome().equals(nome) && novoAnimal.getTipo().equals(tipo)) {
				return true;
			}
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
