package hn.unah.examen_practico_2.servicios;

import java.util.List;

import hn.unah.examen_practico_2.modelos.Vehiculo;

public interface VehiculoService {
     
    public Vehiculo crearVehiculo (Vehiculo newVehiculo);

    public List<Vehiculo> obtenerTodosVehiculo();

    public int buscarVehiculoPorId(int numeroVehiculo);
}
