package com.nestor.springboot.backend.mvc.dao;

import org.springframework.data.repository.CrudRepository;

import com.nestor.springboot.backend.mvc.models.entity.Cliente;

public interface IclienteDao extends CrudRepository<Cliente,Long> {

}
