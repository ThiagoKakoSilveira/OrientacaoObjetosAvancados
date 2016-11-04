package system;

import java.text.NumberFormat;
import java.util.Locale;

import modelos.Divida;
import modelos.Pagamento;

public class RelatorioDeDivida {
	private final Divida divida;

	public RelatorioDeDivida(Divida divida) {
		this.divida = divida;
	}
	
	public void geraRelatorio(NumberFormat formatador){
		System.out.println("Cnpj do Credor: " + divida.getCnpjCredor());
		System.out.println("Credor: " + divida.getCredor());
				 
		System.out.println("Valor da dívida: " + formatador.format(divida.getTotal()));
		System.out.println("Valor pago: " + formatador.format(divida.getValorPago()));
	}
	
	public static void main(String[] args) {
		Divida dividaMain = new Divida();
		dividaMain.setCredor("Uma empresa qualquer");
		dividaMain.setTotal(100);
		dividaMain.getCnpjCredor().setValor("00.000.001/0001-01");
		
		Pagamento pagamento = new Pagamento("Outra Empresa", "00.000.001/0002-02", 20);
		
		dividaMain.registra(pagamento);
		
		RelatorioDeDivida relatorioDeDivida = new RelatorioDeDivida(dividaMain);
		NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		relatorioDeDivida.geraRelatorio(formatador);
	}

}
