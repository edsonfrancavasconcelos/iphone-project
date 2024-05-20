package com.example.iphone;

public interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
	void ligar(String numero);
	void iniciarCorreioVoz();
	void atender();
}
