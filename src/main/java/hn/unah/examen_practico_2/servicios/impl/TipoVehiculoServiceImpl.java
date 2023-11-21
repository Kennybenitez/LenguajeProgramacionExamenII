package hn.unah.examen_practico_2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen_practico_2.modelos.TipoVehiculo;
import hn.unah.examen_practico_2.repositorios.TipoVehiculoRepository;
import hn.unah.examen_practico_2.servicios.TipoVehiculoService;

public class TipoVehiculoServiceImpl implements TipoVehiculoService {

    @Autowired
    private TipoVehiculoRepository tipoVehiculoRepository;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo newTipoVehiculo) {
        return this.tipoVehiculoRepository.save(newTipoVehiculo);
    
    }
    
}
