package poo;

public class CuentaAhorro extends CuentaCorriente {

	private Titular titular;
	private String numeroDeCuenta;
	private double saldo = 0.0d;
	private double interes = 0.0d;

	public CuentaAhorro() {
		// TODO Auto-generated constructor stub
	}

	public CuentaAhorro(Titular titular, String numeroDeCuenta, double saldo, double interes) {
		this.titular = titular;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
		this.interes = interes;
	}

	public CuentaAhorro(Titular titular, String numeroDeCuenta, double interes) {
		setSaldo(15.3);

	}

	public CuentaAhorro(Titular titular, String numeroDeCuenta) {
		setSaldo(15.3);
		setInteres(2.5);
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public Titular getTitular(Titular t) {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}