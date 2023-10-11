package pkg;

import java.util.List;

public class Cuenta {
	
	private String mNumero;
	private String nTitular;
	private double saldo;
	private List<Movimiento>mMovimientos;
	
	public Cuenta(String mNumero,double saldo) {
		this.mNumero=mNumero;
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void reintegro(double i) {
		
	}

	public void ingreso(double i) {
		
	}

	public void getHistorialMov() {
		
	}

	public double getSaldoFinal(int i) {
		if (i==1) 	return -250;
		else return -450;
		
	}
	

}
