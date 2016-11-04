package modelos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

public class Pagamentos extends ArrayList<Pagamento>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private double valorPago;

	public ArrayList<Pagamento> pagamentoAntesDe(Calendar data){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for(Pagamento pagamento : this){
			if(pagamento.getData().before(data)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for(Pagamento pagamento : this){
			if(pagamento.getValor() > valorMinimo){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	public ArrayList<Pagamento> pagamentosDo(String cnpjPagador){
		ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
		for(Pagamento pagamento : this){
			if(pagamento.getCnpjPagador().equals(cnpjPagador)){
				pagamentosFiltrados.add(pagamento);
			}
		}
		return pagamentosFiltrados;
	}
	
	private void paga(double valor){
		if(valor <= 0){
			throw new IllegalArgumentException("Valor inválido para pagamento");
		}
		if(valor > 100) {
			valor = valor -8;
		}
		
		this.valorPago += valor;
	}
	
	public void registra(Pagamento pagamento){
		this.add(pagamento);
		this.paga(pagamento.getValor());
	}
	//Overrides
	@Override
	public boolean add(Pagamento pagamento) {
		this.paga(pagamento.getValor());
		return super.add(pagamento);
	}
	
	@Override
	public boolean addAll(Collection<? extends Pagamento> pgtos) {
		for (Pagamento pagamento : pgtos) {
			this.paga(pagamento.getValor());
		}
		return super.addAll(pgtos);
	}
	
	//GETERS & SETERS
	public double getValorPago() {
		return valorPago;
	}

}
