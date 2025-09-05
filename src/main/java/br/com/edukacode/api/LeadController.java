package br.com.edukacode.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/lead")

public class LeadController {
@Autowired
private LeadRepository repository;
    
    @PostMapping
    @Transactional
    public String criarLead(@RequestBody @Valid DadosCadastroLead dados) {
        // Implementação do método para criar um lead
        System.out.println("Lead criado com os dados: " + dados);
        repository.save(new Lead(dados));
        //repository.save(new Lead(null, dados.nome(),dados.email(),dados.telefone()));
        return "Lead criado com sucesso!";
        
    }
    @GetMapping
    public Page<DadosListagemLead> listarLeads(@PageableDefault(size = 15, sort = {"nome"})Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemLead::new);// Implementação do método para listar todos os leads
    }
    @PutMapping
    @Transactional
    public void atualizarLead(@RequestBody @Valid DadosAtualizacaoLead dados) {
       var lead = repository.getReferenceById(dados.id());
       lead.atualizarInformacoes(dados); // Implementação do método para atualizar um lead existente
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluirLead(@PathVariable Long id) {
       repository.deleteById(id); // Implementação do método para excluir um lead
    }

}
