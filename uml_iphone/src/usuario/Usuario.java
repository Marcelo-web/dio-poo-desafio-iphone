package usuario;

import aplicativos.IPodApp;
import aplicativos.PhoneApp;
import aplicativos.SafariApp;
import smartphone.IPhone;

public class Usuario {
	public static void main(String[] args) {

		// Um IPhone contém os aplicativos descritos.
		IPhone iphone = new IPhone(new IPodApp(), new PhoneApp(), new SafariApp());

		// Usando recursos de mídia.
		iphone.selecionarMusica();
		iphone.tocarMusica();
		iphone.pausarMusica();

		System.out.println();

		// Usando recursos de telefone.
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();

		System.out.println();

		// Usando recursos de internet.
		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();

	}
}
