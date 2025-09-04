package br.com.edukacode.api;
public record DadosCadastroGenero(String nome) {
    public DadosCadastroGenero(Genero genero) {
     this(genero.getNome());
        
    }
}
