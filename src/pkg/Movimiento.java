package pkg;

public class Movimiento {

	public enum signo {D, H};

	private double importe;
	private String detalle;
	private signo sig;

	public Movimiento(double importe, signo sig) {
		this.importe = importe;
		this.sig = sig;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public signo getSig() {
		return sig;
	}

	public void setSig(signo sig) {
		this.sig = sig;
	}
}
