package com.example.demo.app.herramientas.restcontrollers;

import com.example.demo.app.herramientas.models.Herramienta;
import com.example.demo.app.herramientas.services.HerramientaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/herramientas")
public class HerramientaRestController {
    private final HerramientaService herramientaService;


    public HerramientaRestController(HerramientaService herramientaService) {
        this.herramientaService = herramientaService;
    }

    @GetMapping("/{id}")
    public Herramienta findById(@PathVariable("id") Integer id_herramienta) {
        try {
            return herramientaService.findById(id_herramienta);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Herramienta> findAll() {
        return herramientaService.findAll();
    }

    @PostMapping
    public Herramienta create(@RequestBody Herramienta herramienta) {
        return herramientaService.create(herramienta);
    }

    @PutMapping("/{id}")
    public Herramienta update(@PathVariable("id") Integer id, @RequestBody Herramienta herramienta){
        try {
            return herramientaService.update(id, herramienta);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id_herramienta){
        try {
            herramientaService.deleteById(id_herramienta);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
