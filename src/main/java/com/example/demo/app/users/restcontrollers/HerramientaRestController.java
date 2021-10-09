package com.example.demo.app.users.restcontrollers;

import com.example.demo.app.users.models.Herramienta;
import com.example.demo.app.users.services.HerramientaService;
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
    public Herramienta findById(@PathVariable("id") Integer id) {
        try {
            return herramientaService.findById(id);
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
    public void deleteById(@PathVariable("id") Integer id){
        try {
            herramientaService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
