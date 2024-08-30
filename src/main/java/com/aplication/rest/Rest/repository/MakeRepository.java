package com.aplication.rest.Rest.repository;

import com.aplication.rest.Rest.entities.Maker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakeRepository extends CrudRepository<Maker, Long> {
}
