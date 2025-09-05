package br.com.edukacode.api;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoLead(
    @NotNull 
    Long id,
    String nome,
    String email,
    String telefone,
    String cpf
) {

}
