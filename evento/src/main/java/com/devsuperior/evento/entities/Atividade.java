package com.devsuperior.evento.entities;

import java.util.Set;

public class Atividade {

	private Integer id;
	private String nome;
	private String descricao;
	private Double preco;
	private Categoria categoria;
	private Set<Participante> participantes;
	
}
