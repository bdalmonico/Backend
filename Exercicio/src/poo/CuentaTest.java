package poo;

public class CuentaTest {

	public static void main(String[] args) {
		Titular t = new Titular();
		t.setApelido("Dalmonico");
		t.setEdad(26);
		t.setNombre("Bruno");

		Titular t2 = new Titular();
		t2.setNombre("Camila");
		t2.setApelido("Safanelli");
		t2.setEdad(32);
		
		Titular t3 = new Titular();
		t3.setNombre("Gisele");
		t3.setApelido("Dalmonico");
		t3.setEdad(48);

		CuentaCorriente c1 = new CuentaCorriente(t, "IBAN ES64 69 0000 0 000 000", 2222.22);

		CuentaCorriente c2 = new CuentaCorriente(t2, "ES 53535 1252525", 5000.00);

		System.out.println("Titular: " + c1.getTitular(t).getNombre() + " " + c1.getNumeroCuenta());
		System.out.println();
		System.out.println("Cuenta: " + c2.getNumeroCuenta() + " " + c2.getTitular(t2).getNombre());
		System.out.println();
		c1.imprimirCuentaSaldo();
		System.out.println();
		c2.imprimirCuentaSaldo();
		System.out.println();
		c2.ingressar(200);
		System.out.println("Ingressando dinheiro na sua conta " + c2.getTitular(t2).getNombre());
		System.out.println();
		c2.imprimirCuentaSaldo();
		System.out.println();
		c1.reintegro(400);
		c1.imprimirCuentaSaldo();
		
		CuentaCorriente ca = new CuentaAhorro(t3, "BR 5535 5151 8864", 50000.00, 4);
		
		System.out.println(ca.getSaldo() + ca.getNumeroCuenta() + ca.getTitular(t3).getNombre());
		
	}

}
