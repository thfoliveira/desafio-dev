package com.thfoliveira.desafiodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thfoliveira.desafiodev.domain.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {

}
