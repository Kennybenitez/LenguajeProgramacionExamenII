package hn.unah.examen_practico_2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen_practico_2.modelos.TipoVehiculo;
import hn.unah.examen_practico_2.servicios.impl.TipoVehiculoServiceImpl;

@RestController
@RequestMapping ("/api/TipoVehiculos")
public class TipoVehiculoController {

    @Autowired
    private TipoVehiculoServiceImpl tipoVehiculoServiceImpl;

    @PostMapping ("/crearTipoVehiculo")
    public TipoVehiculo crearTipoVehiculo (@RequestBody TipoVehiculo newTipoVehiculo){

        return this.tipoVehiculoServiceImpl.crearTipoVehiculo(newTipoVehiculo);
    }
    
}
