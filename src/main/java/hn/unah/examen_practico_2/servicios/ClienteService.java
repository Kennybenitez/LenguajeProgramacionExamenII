package hn.unah.examen_practico_2.servicios;

import java.util.List;

import hn.unah.examen_practico_2.modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente (Cliente newCliente);

    public List<Cliente> obtenerTodosCliente();

    public String buscarClientePorId(String numeroCliente);
    
}
