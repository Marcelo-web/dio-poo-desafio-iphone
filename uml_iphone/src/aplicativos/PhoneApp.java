package aplicativos;

import interfaces.AparelhoTelefonico;

public class PhoneApp implements AparelhoTelefonico {

	@Override
	public void ligar() {
		System.out.println("Efetuando uma ligação telefônica.");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo uma ligação telefônica.");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando uma operação de correio de voz.");
	}
}
