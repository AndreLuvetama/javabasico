package org.com.aulajava;

public class Calculadora {
	int valorPadraMultiplicacao = 2;
	float valorPadraoSoma = 3.3f;
	static int valorPadraoSomaInteiro = (int) 3.4f; // conversao do valor

	public int realizarMultiplicacao(int valor) {
		return valor * this.valorPadraMultiplicacao;
	}

	public float realizarSoma(int valor) {
		return valor * this.valorPadraoSoma;
	}

}
