package hotel;

public class Estadia {
	Animal animal;
	String nome;
	String tipo;
	int idade;
	int dias;
	double valor;

	public Estadia(String nome, String tipo, int idade, int dias, double valor) throws Exception {
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
		this.dias = dias;
		this.valor = valor;
		if (nome == null || nome.trim().equals("")){
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}
		if (tipo == null || tipo.trim().equals("")){
			throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
		}
		if (idade < 0){
			throw new Exception("Idade de um animal nao pode ser abaixo de 0");
		}
		if (dias < 1){
			throw new Exception("Estadia de um animal nao pode ser abaixo de 1 dia");
		}
		if (valor < 0){
			throw new Exception("Valor da estadia de uma animal nao pode ser abaixo de 0");
		}
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

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dias;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	public String toString(){
		String retorno = nome + ", " + tipo + ", " + dias + "dias com o preço de R$ " + valor;
		return retorno;
	}

	

}
