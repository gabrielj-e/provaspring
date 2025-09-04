package br.com.edukacode.api;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/genero")
public class GeneroController {
 @Autowired
 private GeneroRepository repository;
    
    @PostMapping
    @Transactional
     public String criarGenero(@RequestBody @Valid DadosCadastroGenero dados) {
        // Implementação do método para criar um lead
        System.out.println("Genero criado com os dados: " + dados);
        repository.save(new Genero(dados));
        //repository.save(new Lead(null, dados.nome(),dados.email(),dados.telefone()));
        return "Genero criado com sucesso!";
     }

    @GetMapping
    public Page<DadosListagemGenero> listarGeneros(@PageableDefault(size = 15, sort = {"nome"})Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemGenero::new);// Implementação do método para listar todos os leads
    }
    
}



