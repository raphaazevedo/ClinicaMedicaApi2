package br.com.rapha.infrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rapha.domain.entities.Atendimento;

public interface AtendimentoRepository extends JpaRepository<Atendimento, UUID>{

}
