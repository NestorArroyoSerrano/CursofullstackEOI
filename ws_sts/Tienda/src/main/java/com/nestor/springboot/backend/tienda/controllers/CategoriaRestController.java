package com.nestor.springboot.backend.tienda.controllers;

import com.nestor.springboot.backend.tienda.models.entity.Categoria;
import com.nestor.springboot.backend.tienda.models.services.IcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/categorias")
public class CategoriaRestController {

    @Autowired
    private IcategoriaService categoriaService;

    @GetMapping("")
    public List<Categoria> index() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public Categoria show(@PathVariable int id) {
        return categoriaService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        categoriaService.delete(id);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria create(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Categoria update(@RequestBody Categoria categoria, @PathVariable int id) {
        Categoria objetoActualizar = categoriaService.findById(id);
        objetoActualizar.setNombreCategoria(categoria.getNombreCategoria());
        // Realiza las operaciones de actualización necesarias
        return categoriaService.save(objetoActualizar);
    }
}
