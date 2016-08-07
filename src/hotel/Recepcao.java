package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	private List<Estadia> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equals(nome)) {
				estadias.remove(estadia);
			}
		}
	}

	public int getNumDeHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double resultado = 0.0;

		for (Estadia estadia : estadias) {
			resultado += (estadia.getDias() * estadia.getValor());
		}
		return resultado;
	}

	public String toString() {
		String resultado = "Estadias: \n";

		for (Estadia estadia : estadias) {
			resultado += String.format("%s (%s): %d dias com o preço de R$ %.2f\n", estadia.getNome, estadia.getTipo(),
					estadia.getDias(), estadia.getValor());
		}

		return resultado;
	}
}
