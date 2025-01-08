package utez.edu.mx.RIS.turno.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Turno {

    @Id
    private long id;
    private String name;
    private String doctor;



}
