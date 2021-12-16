package com.albertopereira.financas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.albertopereira.financas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

}
