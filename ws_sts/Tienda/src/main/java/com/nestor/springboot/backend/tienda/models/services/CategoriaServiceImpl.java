package com.nestor.springboot.backend.tienda.models.services;

import com.nestor.springboot.backend.tienda.models.dao.IcategoriaDao;
import com.nestor.springboot.backend.tienda.models.entity.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoriaServiceImpl implements IcategoriaService {

    @Autowired
    private IcategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> findAll() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria findById(int id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void delete(int id) {
        categoriaDao.deleteById(id);
    }

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }
}