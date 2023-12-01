package com.pinguela.shop.enunciado2;

public class Motor {
	private int litrosAceite = 0;
	private int cv = 0;

	public Motor(int cv) {
		this.cv = cv;
	}

	public int getLitrosAceite() {
		return litrosAceite;
	}

	public void setLitrosAceite(int litrosAceite) {
		this.litrosAceite = litrosAceite;
	}

	public int getCv() {
		return cv;
	}
	@Override
	public String toString() {
		return "Motor={litrosAceite:"+litrosAceite
						+",cv="+cv+"}";
	}
}
