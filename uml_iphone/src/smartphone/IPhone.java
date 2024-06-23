package smartphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorNaInternet;
import interfaces.ReprodutorMusical;

public class IPhone {

	private final ReprodutorMusical reprodutorMusical;
	private final AparelhoTelefonico aparelhoTelefonico;
	private final NavegadorNaInternet navegadorNaInternet;

	public IPhone(ReprodutorMusical midia, AparelhoTelefonico telefone, NavegadorNaInternet navegador) {
		reprodutorMusical = midia;
		aparelhoTelefonico = telefone;
		navegadorNaInternet = navegador;
	}

	public void tocarMusica() {
		reprodutorMusical.tocarMusica();
	}

	public void pausarMusica() {
		reprodutorMusical.pausarMusica();
	}

	public void selecionarMusica() {
		reprodutorMusical.selecionarMusica();
	}

	public void ligar() {
		aparelhoTelefonico.ligar();
	}

	public void atender() {
		aparelhoTelefonico.atender();
	}

	public void iniciarCorreioVoz() {
		aparelhoTelefonico.iniciarCorreioVoz();
	}

	public void exibirPagina() {
		navegadorNaInternet.exibirPagina();
	}

	public void adicionarNovaAba() {
		navegadorNaInternet.adicionarNovaAba();
	}

	public void atualizarPagina() {
		navegadorNaInternet.atualizarPagina();
	}
}
