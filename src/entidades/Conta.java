package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limitesaque;
	
	public Conta() {
		
	}
	public Conta(Integer numero, String titular, Double saldo, Double limitesaque) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limitesaque = limitesaque;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getLimitesaque() {
		return limitesaque;
	}
	public void setLimitesaque(Double limitesaque) {
		this.limitesaque = limitesaque;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void deposito(double deposito) {
	  this.saldo=saldo+deposito;
	}
	public void saque(double saque) {
		  validarsaque(saque);
		  this.saldo=saldo-saque;
	}
	private void validarsaque(double saque) {
		if (saque > getLimitesaque()) {
			throw new IllegalArgumentException("Erro de saque: A quantia excede o limite de saque");
		} 
		if (saque > getSaldo()) {
			throw new IllegalArgumentException("Erro de saque: Saldo insuficiente");
		}
}
}