package com.example.demo.app.clientes.restcontrollers;

import com.example.demo.app.clientes.models.Cliente;
import com.example.demo.app.clientes.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController (ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public Cliente findById(@PathVariable("id") Integer id_cliente) {
        try {
            return clienteService.findById(id_cliente);
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
    public void deleteById(@PathVariable("id") Integer id_cliente){
        try {
            clienteService.deleteById(id_cliente);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



