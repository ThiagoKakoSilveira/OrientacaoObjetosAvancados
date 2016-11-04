package modelos;

import java.util.HashMap;

public class BalancoEmpresa {
	private HashMap<String, Divida> dividas = new HashMap<>();
	
	public void registraDivida(String credor, String cnpjCredor, double valor){
		Divida divida = new Divida();
		divida.getCnpjCredor().setValor(cnpjCredor);
		divida.setCredor(credor);
		divida.setTotal(valor);
		
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpj, double valor, String nomePagador, String cnpjPagador){
		Divida divida = dividas.get(cnpj);
		if(divida != null){
			Pagamento pagamento = new Pagamento(nomePagador, cnpjPagador, valor);
			divida.registra(pagamento);
		}
	}
}
