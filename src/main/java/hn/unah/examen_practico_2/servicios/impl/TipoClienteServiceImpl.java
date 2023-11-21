package hn.unah.examen_practico_2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen_practico_2.modelos.TipoCliente;
import hn.unah.examen_practico_2.repositorios.TipoClienteRepository;
import hn.unah.examen_practico_2.servicios.TipoClienteService;


@Service
public class TipoClienteServiceImpl implements TipoClienteService {

    @Autowired
    private TipoClienteRepository tipoClienteRepository;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente newTipoCliente) {
        return this.tipoClienteRepository.save(newTipoCliente);
      
    }

  

   
    
}
