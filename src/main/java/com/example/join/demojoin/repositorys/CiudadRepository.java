package com.example.join.demojoin.repositorys;

import java.util.List;

import com.example.join.demojoin.models.Ciudad;

public interface CiudadRepository {

  public List<Ciudad> getCiudades();

  public Ciudad getById();

}
