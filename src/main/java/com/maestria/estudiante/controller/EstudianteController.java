package com.maestria.estudiante.controller;
import com.maestria.estudiante.repository.EstudianteRepository;
import org.springframework.web.bind.annotation.*;
import com.maestria.estudiante.model.Estudiante;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
@CrossOrigin
public class EstudianteController {

    private final EstudianteRepository repository;

    public EstudianteController(EstudianteRepository repository) {
        this.repository = repository;
    }

    // GET - listar todos
    @GetMapping
    public List<Estudiante> listar() {
        return repository.findAll();
    }

    // GET - uno por id
    @GetMapping("/{id}")
    public Estudiante obtener(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    // POST - crear
    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return repository.save(estudiante);
    }

    // PUT - actualizar
    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudiante.setId(id);
        return repository.save(estudiante);
    }

    // DELETE - eliminar
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
