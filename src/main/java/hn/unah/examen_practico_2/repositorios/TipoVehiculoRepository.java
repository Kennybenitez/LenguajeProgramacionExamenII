package hn.unah.examen_practico_2.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen_practico_2.modelos.TipoVehiculo;

public interface TipoVehiculoRepository extends JpaRepository <TipoVehiculo, Integer> {
    
}
