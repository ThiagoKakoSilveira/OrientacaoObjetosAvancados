package modelos;

public class GerenciadorDeDividas {
	
	public void efetuadorDePagamento(Divida divida, double valor, String nomePagador, String cnpjPagador){
		Pagamento pagamento = new Pagamento(nomePagador, cnpjPagador, valor);
		divida.registra(pagamento);
	}

}
