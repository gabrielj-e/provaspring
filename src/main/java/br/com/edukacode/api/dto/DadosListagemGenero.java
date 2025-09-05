package br.com.edukacode.api.dto;

import br.com.edukacode.api.entity.Genero;

public record DadosListagemGenero(String nome) {
    public DadosListagemGenero(Genero genero){
        this(genero.getNome());
    }
}