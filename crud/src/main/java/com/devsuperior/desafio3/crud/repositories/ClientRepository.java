package com.devsuperior.desafio3.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.desafio3.crud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
