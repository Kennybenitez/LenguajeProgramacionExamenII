package hn.unah.examen_practico_2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen_practico_2.modelos.Vehiculo;
import hn.unah.examen_practico_2.servicios.impl.VehiculoServiceImpl;

@RestController
@RequestMapping("/api/Vehiculo")
public class VehiculoController {

    @Autowired
    private VehiculoServiceImpl vehiculoServiceImpl;

    @PostMapping("/crearVehiculo")
    public Vehiculo crearVehiculo ( @RequestBody Vehiculo newVehiculo){
        return this.vehiculoServiceImpl.crearVehiculo(newVehiculo);
    }
    
}
