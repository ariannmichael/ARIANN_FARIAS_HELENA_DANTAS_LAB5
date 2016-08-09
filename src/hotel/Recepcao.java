package hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Recepcao {
	private List<Estadia> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias,
			double valor) throws Exception {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		for (int i = 0; i < estadias.size(); i++){
			if(estadias.get(i).getNome().equals(nome)){
				estadias.remove(i);
			}
		}
	}

	public int getNumDeHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double resultado = 0.0;

		for (Estadia estadia : estadias) {
			resultado += (estadia.getValor());
		}
		return resultado;
	}

	public String toString() {
		String resultado = "Estadias:\n";

		for (Estadia estadia : estadias) {
			String valor = String.format(Locale.US, "%.2f", estadia.getValor());
			resultado += estadia.getNome() + " (" + estadia.getTipo() + "): "
					+ estadia.getDias() + " dias com o preco de R$ " + valor;
		}

		return resultado;
	}
}
