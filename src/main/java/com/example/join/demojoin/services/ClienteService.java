package com.example.join.demojoin.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.join.demojoin.models.Cliente;
import com.example.join.demojoin.repositorys.ClienteRepository;

@Repository
public class ClienteService implements ClienteRepository {
  @PersistenceContext
  EntityManager entityManager;

  @Override
  public List<Cliente> getClientes() {
    Query query = null;
    List<Cliente> clientes = new ArrayList<>();
    query = entityManager.createNativeQuery(
        "SELECT cl.id, cl.nombre, cl.apellido, cl.ciudad, c.nombre"
            + " FROM clientes cl INNER JOIN ciudades c ON cl.ciudad=c.id",
        Cliente.class);
    clientes = query.getResultList();
    System.out.println("despues de consulta");
    return clientes;
  }

}
