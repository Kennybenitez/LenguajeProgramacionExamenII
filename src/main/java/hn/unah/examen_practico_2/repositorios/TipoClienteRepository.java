package hn.unah.examen_practico_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen_practico_2.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository <TipoCliente , Integer> {
    
}
