package hotel;

public class Estadia {

	private Animal animal;
	private int dias;
	private double valor;

	public Estadia(String nome, String tipo, int idade, int dias, double valor)
			throws Exception {

		if (dias < 1) {
			throw new Exception(
					"Estadia de um animal nao pode ser abaixo de 1 dia");
		}
		if (valor <= 0) {
			throw new Exception(
					"Valor da estadia de uma animal nao pode ser abaixo de 0");
		}
		animal = new Animal(nome, tipo, idade);
		this.dias = dias;
		this.valor = valor;
		
	}

	public String getNome() {
		return animal.getNome();
	}

	public String getTipo() {
		return animal.getTipo();
	}

	public int getIdade() {
		return animal.getIdade();
	}

	public int getDias() {
		return dias;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((animal == null) ? 0 : animal.hashCode());
		result = prime * result + dias;
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public String toString() {
		String retorno = animal.getNome() + ", " + animal.getIdade() + ", "
				+ dias + "dias com o preco de R$ " + valor;
		return retorno;
	}

}
