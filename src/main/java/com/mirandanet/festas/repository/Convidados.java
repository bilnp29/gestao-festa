package com.mirandanet.festas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.mirandanet.festas.model.Convidado;

@Repository
public class Convidados {

	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<>();

	static {
		LISTA_CONVIDADOS.add(new Convidado("Bruno Miranda", 3));
		LISTA_CONVIDADOS.add(new Convidado("Ana", 2));
		LISTA_CONVIDADOS.add(new Convidado("Maria", 4));
		LISTA_CONVIDADOS.add(new Convidado("João Carlos", 1));
	}

	public List<Convidado> todos() {
		return Convidados.LISTA_CONVIDADOS;
	}

	public void adicionar(Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}
}