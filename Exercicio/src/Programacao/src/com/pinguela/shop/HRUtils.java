package Programacao.src.com.pinguela.shop;

public class HRUtils {

	public static double getSalarioTotal(Empleado e) {
		return e.getSalario() + e.getBonus();
	}
	
	public static double getSalarioNuevo(double salario, double pcn) {
		return Math.round(salario*(1+pcn/100));
	}
}
