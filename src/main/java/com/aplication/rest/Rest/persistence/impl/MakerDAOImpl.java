package com.aplication.rest.Rest.persistence.impl;

import com.aplication.rest.Rest.entities.Maker;
import com.aplication.rest.Rest.persistence.IMakerDAO;
import com.aplication.rest.Rest.repository.MakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


@Component
public class MakerDAOImpl implements IMakerDAO {

    @Autowired
    private MakeRepository makeRepository;

    @Override
    public List<Maker> finAll() {
        return (List<Maker>) makeRepository.findAll();
    }

    @Override
    public Optional<Maker> finById(Long id) {
        return makeRepository.findById(id);
    }

    @Override
    public void save(Maker maker) {
        makeRepository.save(maker);
    }

    @Override
    public void deleteByid(Long id) {
        makeRepository.deleteById(id);
    }
}
