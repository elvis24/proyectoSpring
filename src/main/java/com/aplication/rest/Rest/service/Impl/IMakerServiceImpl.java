package com.aplication.rest.Rest.service.Impl;

import com.aplication.rest.Rest.entities.Maker;
import com.aplication.rest.Rest.persistence.IMakerDAO;
import com.aplication.rest.Rest.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class IMakerServiceImpl implements IMakerService {

    @Autowired
    private IMakerDAO makerDAO;

    @Override
    public List<Maker> finAll() {
        return makerDAO.finAll();
    }

    @Override
    public Optional<Maker> finById(Long id) {
        return makerDAO.finById(id);
    }

    @Override
    public void save(Maker maker) {
        makerDAO.save(maker);
    }

    @Override
    public void deleteByid(Long id) {
        makerDAO.deleteByid(id);
    }
}
