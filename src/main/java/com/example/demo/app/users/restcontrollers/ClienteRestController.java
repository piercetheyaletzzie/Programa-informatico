package com.example.demo.app.users.restcontrollers;

import com.example.demo.app.users.models.Cliente;
import com.example.demo.app.users.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable("id") Integer id) {
        try {
            return clienteService.findById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @GetMapping
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @PostMapping
    public Cliente create(@RequestBody Cliente cliente) {
        return clienteService.create(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable("id") Integer id, @RequestBody Cliente cliente){
        try {
            return clienteService.update(id, cliente);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        try {
            clienteService.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
