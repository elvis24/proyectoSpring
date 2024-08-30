package com.aplication.rest.Rest.service;

import com.aplication.rest.Rest.entities.Maker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface IMakerService{
    List<Maker> finAll();

    Optional<Maker> finById(Long id);

    void save(Maker maker);

    void deleteByid(Long id);
}
