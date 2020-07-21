package com.algaworks.contato.repository;

import com.algaworks.contato.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

//Camada de persistencia utilizando SPRING DATA JPA,
//Isso é um repositorio
//nao é necessario implementar essa intarface pois o spring data jpa fara isso em tempo de execucao
//ou seja a camada de persistencia está pronta
//é possível definir inclusive o tipo de ordenacao que sera utilizada
//é possível criar pesquisas a partir de assinaturas de métodos
public interface Contatos extends JpaRepository<Contato, Long> {

}
