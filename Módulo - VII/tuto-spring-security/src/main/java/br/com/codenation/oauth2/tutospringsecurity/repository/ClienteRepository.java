package br.com.codenation.oauth2.tutospringsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.codenation.oauth2.tutospringsecurity.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}