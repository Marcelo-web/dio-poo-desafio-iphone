package aplicativos;

import interfaces.NavegadorNaInternet;

public class SafariApp implements NavegadorNaInternet {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página do navegador.");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba no navegador.");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando uma página do navegador.");
	}
}
