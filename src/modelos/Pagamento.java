package modelos;

import java.util.Calendar;

public class Pagamento {
	private String pagador, cnpjPagador;
	private double valor;
	private Calendar data;
		
	public Pagamento(String pagador, String cnpjPagador, double valor) {
		this.pagador = pagador;
		this.cnpjPagador = cnpjPagador;
		this.valor = valor;
	}
	//GETERS & SETERS
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public String getPagador() {
		return pagador;
	}
	public void setPagador(String pagador) {
		this.pagador = pagador;
	}
	public String getCnpjPagador() {
		return cnpjPagador;
	}
	public void setCnpjPagador(String cnpjPagador) {
		this.cnpjPagador = cnpjPagador;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
