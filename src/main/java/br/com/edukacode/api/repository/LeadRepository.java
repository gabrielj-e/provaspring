package br.com.edukacode.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edukacode.api.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long>{

    // JpaRepositoty estão presentes na interface.
}
