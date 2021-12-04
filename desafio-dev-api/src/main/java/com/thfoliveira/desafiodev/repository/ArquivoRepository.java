package com.thfoliveira.desafiodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thfoliveira.desafiodev.domain.Arquivo;

@Repository
public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {

}
