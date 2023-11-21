package hn.unah.examen_practico_2.servicios.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen_practico_2.modelos.Vehiculo;
import hn.unah.examen_practico_2.repositorios.VehiculoRepository;
import hn.unah.examen_practico_2.servicios.VehiculoService;

public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo newVehiculo) {
        return this.vehiculoRepository.save(newVehiculo);
    }

    @Override
    public List<Vehiculo> obtenerTodosVehiculo() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public int buscarVehiculoPorId(int numeroVehiculo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarVehiculoPorId'");
    }

   
    }
    

