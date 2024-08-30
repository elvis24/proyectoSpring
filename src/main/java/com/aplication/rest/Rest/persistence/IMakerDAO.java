package com.aplication.rest.Rest.persistence;

import com.aplication.rest.Rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<Maker> finAll();

    Optional<Maker> finById(Long id);

     void save(Maker maker);

     void deleteByid(Long id);
}
