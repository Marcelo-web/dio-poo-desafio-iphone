package aplicativos;

import interfaces.ReprodutorMusical;

public class IPodApp implements ReprodutorMusical {

	@Override
	public void tocarMusica() {
		System.out.println("Reproduzindo uma música.");
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando uma música.");
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando uma música.");
	}
}
