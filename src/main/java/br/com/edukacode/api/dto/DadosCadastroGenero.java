package br.com.edukacode.api.dto;

import br.com.edukacode.api.entity.Genero;

public record DadosCadastroGenero(String nome) {
    public DadosCadastroGenero(Genero genero) {
     this(genero.getNome());
        
    }
}
