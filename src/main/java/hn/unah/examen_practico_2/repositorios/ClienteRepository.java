package hn.unah.examen_practico_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen_practico_2.modelos.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente , Integer> {
    
}
