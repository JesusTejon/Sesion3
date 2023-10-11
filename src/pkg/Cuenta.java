package pkg;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private String mNumero;
	private String nTitular;
	private double saldo;
	private List<Movimiento> mMovimientos;

	public Cuenta(String mNumero, double saldo) {
		this.mNumero = mNumero;
		this.saldo = saldo;
		this.mMovimientos = new ArrayList<>();
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void reintegro(double i) {
		mMovimientos.add(new Movimiento(i, Movimiento.signo.D));
	}

	public void ingreso(double i) {
		mMovimientos.add(new Movimiento(i, Movimiento.signo.H));

	}

	public void getHistorialMov() {

		for (int i = 0; i < mMovimientos.size(); i++) {
			if (mMovimientos.get(i).getSig() == Movimiento.signo.D)
				System.out.println("Reintegro de " + mMovimientos.get(i).getImporte() +" en la cuenta numero: " + this.mNumero);
			else
				System.out.println("Ingreso de " + mMovimientos.get(i).getImporte()+" en la cuenta numero: " + this.mNumero);
		}

	}

	public double getSaldoFinal() {

		double saldoFinal = this.saldo;

		for (int i = 0; i < mMovimientos.size(); i++) {
			if (mMovimientos.get(i).getSig() == Movimiento.signo.D)
				if (saldoFinal - mMovimientos.get(i).getImporte() <= -500) {
					saldoFinal = -500;
					System.out.println("Saldo Minimo alcanzado en el movimiento: " + i + " de la cuenta " + this.mNumero);
				}
					
				else
					saldoFinal = saldoFinal - mMovimientos.get(i).getImporte();
			else
				saldoFinal = saldoFinal + mMovimientos.get(i).getImporte();
		}

		return saldoFinal;
	}

}
