package hn.unah.examen_practico_2.modelos;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table (name="cliente")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    
    @Id
    @Column (name="idCliente")
    @GeneratedValue(strategy =  GenerationType.IDENTITY) 
    private int IdCliente;

    private String nombre;

    private String apellido;

    private Date fechaIngreso;
  
    private int idTipoCliente;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "idTipoCliente", referencedColumnName = "idTipoCliente")
    private TipoCliente tipoCliente;
    
}

