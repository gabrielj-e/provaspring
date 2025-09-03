package br.com.edukacode.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<DadosListagemLead> listarLeads() {
        return repository.findAll().stream().map(DadosListagemLead::new).toList();// Implementação do método para listar todos os leads
    }
    @PutMapping
    public void atualizarLead() {
        // Implementação do método para atualizar um lead existente
    }
    @DeleteMapping
    public void excluirLead() {
        // Implementação do método para excluir um lead
    }

}
