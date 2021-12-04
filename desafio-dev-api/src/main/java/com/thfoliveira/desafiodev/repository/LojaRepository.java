package com.thfoliveira.desafiodev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thfoliveira.desafiodev.domain.Loja;

@Repository
public interface LojaRepository extends JpaRepository<Loja, Long> {

}
