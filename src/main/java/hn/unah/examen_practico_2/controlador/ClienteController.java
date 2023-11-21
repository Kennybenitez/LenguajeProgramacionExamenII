package hn.unah.examen_practico_2.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen_practico_2.modelos.Cliente;
import hn.unah.examen_practico_2.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping ("/api/Cliente")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crearCliente")
    public Cliente crearCliente (@RequestBody Cliente newCliente){

        return this.clienteServiceImpl.crearCliente(newCliente);
    }
    
}
