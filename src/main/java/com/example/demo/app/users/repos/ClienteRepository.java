package com.example.demo.app.users.repos;

import com.example.demo.app.users.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
