package hn.unah.examen_practico_2.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hn.unah.examen_practico_2.modelos.Cliente;
import hn.unah.examen_practico_2.repositorios.ClienteRepository;
import hn.unah.examen_practico_2.servicios.ClienteService;

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente newCliente) {
       return this.clienteRepository.save(newCliente);
    }

    @Override
    public List<Cliente> obtenerTodosCliente() {
        return this.clienteRepository.findAll();
    }

    @Override
    public String buscarClientePorId(String numeroCliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarClientePorId'");
    }
    
}
