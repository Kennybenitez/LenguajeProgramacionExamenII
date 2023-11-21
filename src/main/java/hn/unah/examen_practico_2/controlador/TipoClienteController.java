package hn.unah.examen_practico_2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen_practico_2.modelos.TipoCliente;
import hn.unah.examen_practico_2.servicios.impl.TipoClienteServiceImpl;

@RestController
@RequestMapping("/api/TipoCliente")
public class TipoClienteController {

    @Autowired
    private TipoClienteServiceImpl tipoClienteServiceImpl;

    @PostMapping("/crearTipoCliente")
    public TipoCliente crearTipoCliente (@RequestBody TipoCliente newTipoCliente){

       return this.tipoClienteServiceImpl.crearTipoCliente(newTipoCliente);
    }
    
}
