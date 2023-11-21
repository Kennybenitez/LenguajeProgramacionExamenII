package hn.unah.examen_practico_2.modelos;

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
@Table(name = "vehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Vehiculo {

    @Id
    @Column(name = " idVehiculo")
    @GeneratedValue(strategy =  GenerationType.IDENTITY) 
    private int idVehiculo;
    
    private String marca;

    private int anio;

    private boolean disponible;

    private int idTipoVehiculo;

    @JsonIgnore
    @ManyToOne
    @JoinColumn (name = "idTipoVehiculo", referencedColumnName = "idTipoVehiculo")
    private TipoVehiculo tipoVehiculo;
    
}
