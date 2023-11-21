package hn.unah.examen_practico_2.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name= "tipoVehiculo")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TipoVehiculo {

    @Id
    @Column(name="idTipoVehiculo")
    @GeneratedValue (strategy =  GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;

    private double precioXHora;

    @OneToMany (mappedBy = "tipoVehiculo", cascade = CascadeType.ALL)
    private List<Vehiculo> vehiculos = new ArrayList<>();
    
}
