package com.example.demo.app.clientes.services;

import com.example.demo.app.clientes.models.Cliente;
import com.example.demo.app.clientes.repos.ClienteRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente findById(Integer id) throws Exception {
        Cliente foundCliente = clienteRepository.findById(id).get();
        if (foundCliente != null){
            return foundCliente;
        } else{
            throw new Exception("Cliente no encontrado");
        }
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll(Sort.by("clienteNombre"));
    }

    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente update(Integer id, Cliente cliente) throws Exception {
        Cliente foundCliente = clienteRepository.findById(id).get();
        if (foundCliente != null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception("Cliente no encontrado");
        }
    }

    public void deleteById(Integer id) throws Exception {
        Cliente foundCliente = clienteRepository.findById(id).get();
        if (foundCliente != null) {
            clienteRepository.deleteById(id);
        } else {
            throw new Exception("Cliente no enecontrado");
        }

    }
}
