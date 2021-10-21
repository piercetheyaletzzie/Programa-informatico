package com.example.demo.app.herramientas.services;

import com.example.demo.app.herramientas.models.Herramienta;
import com.example.demo.app.herramientas.repos.HerramientaRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerramientaService {
    private final HerramientaRepository herramientaRepository;


    public HerramientaService(HerramientaRepository herramientaRepository) {
        this.herramientaRepository = herramientaRepository;

    }

    public Herramienta findById(Integer id) throws Exception {
        Herramienta foundHerramienta = herramientaRepository.findById(id).get();
        if (foundHerramienta != null){
            return foundHerramienta;
        } else{
            throw new Exception("Herramienta no encontrado");
        }
    }

    public List<Herramienta> findAll() {
        return herramientaRepository.findAll(Sort.by("nombre_herramienta"));
    }

    public Herramienta create(Herramienta herramienta) {
        return herramientaRepository.save(herramienta);
    }

    public Herramienta update(Integer id, Herramienta herramienta) throws Exception {
        Herramienta foundHerramienta = herramientaRepository.findById(id).get();
        if (foundHerramienta != null) {
            return herramientaRepository.save(herramienta);
        } else {
            throw new Exception("Herramienta no encontrado");
        }
    }

    public void deleteById(Integer id) throws Exception {
        Herramienta foundHerramienta = herramientaRepository.findById(id).get();
        if (foundHerramienta != null) {
            herramientaRepository.deleteById(id);
        } else {
            throw new Exception("Herramienta no enecontrado");
        }

    }
}
