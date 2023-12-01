package poo;

public class CuentaCorriente {
	private Titular titular;
	private String numeroDeCuenta;
	private double saldo;

	public CuentaCorriente() {
	}

	public CuentaCorriente(Titular titular, String numeroDeCuenta, double saldo) {
		this.titular = titular;
		this.numeroDeCuenta = numeroDeCuenta;
		this.saldo = saldo;
	}

	public CuentaCorriente(Titular titular, String numeroDeCuenta) {
		saldo = 15.3;
		this.numeroDeCuenta = numeroDeCuenta;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumeroCuenta() {
		return numeroDeCuenta;
	}

	public Titular getTitular(Titular t) {
		return titular;
	}

	public void ingressar(int ingresso) {
		saldo += ingresso;
	}

	public void reintegro(int reintegro) {
		saldo -= reintegro;
	}

	public void imprimirCuentaSaldo() {
		System.out.println("Cuenta numero " + getNumeroCuenta() + " el saldo de tu cuenta es " + getSaldo());
	}

	public static boolean comparaCuentas(String cuenta1, String cuenta2) {
		if (cuenta1.compareTo(cuenta2) == 0) {
			return true;
		} else {
			return false;
		}
	}

	
}
