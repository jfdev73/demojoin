package com.example.join.demojoin.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.example.join.demojoin.models.Ciudad;
import com.example.join.demojoin.repositorys.CiudadRepository;

@Repository
public class CiudadService implements CiudadRepository {
  @PersistenceContext
  EntityManager entityManager;

  @Override
  public List<Ciudad> getCiudades() {
    Query query = null;
    List<Ciudad> ciudades = new ArrayList<>();
    query = entityManager.createNativeQuery(
        "SELECT c.id, c.nombre from ciudades c", Ciudad.class);
    ciudades = query.getResultList();
    System.out.println("despues de consulta");
    return ciudades;
  }

  @Override
  public Ciudad getById() {
    // TODO Auto-generated method stub
    return null;
  }

}
