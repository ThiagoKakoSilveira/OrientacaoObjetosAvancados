package system;

import java.util.ArrayList;

import modelos.Pagamento;
import modelos.Pagamentos;

public class TestaPagamentos {
	
	public static void main(String[] args) {
		Pagamentos pagamentos = new Pagamentos();
		Pagamento pagamento1 = new Pagamento("Empresa X", "00.000.001/0001-01", 105);
		Pagamento pagamento2 = new Pagamento("Empresa Y", "00.000.002/0002-02", 25);
		
		pagamentos.add(pagamento1);
		pagamentos.add(pagamento2);
		
		System.out.println("Valor total pago: " + pagamentos.getValorPago());
		
		Pagamentos pagamentos2 = new Pagamentos();
		ArrayList<Pagamento> colecaoDePagamentos = new ArrayList<>();
		colecaoDePagamentos.add(pagamento1);
		colecaoDePagamentos.add(pagamento2);
		
		pagamentos2.addAll(colecaoDePagamentos);
		
		System.out.println("Valor total pago: " + pagamentos2.getValorPago());
	}

}
