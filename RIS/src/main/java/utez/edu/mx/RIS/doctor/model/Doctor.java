package utez.edu.mx.RIS.doctor.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import utez.edu.mx.RIS.turno.model.Turno;

import java.util.List;

@Entity
@Table(name="doctores")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nameComplete", columnDefinition = "VARCHAR(50)")
    private String nameComplete;

    @Column(name = "age", columnDefinition = "INT")
    private int age;

    @Column(name = "especiality", columnDefinition = "VARCHAR(50)")
    private String especiality;

    @Column(name="status",columnDefinition = "BOOL DEFAULT TRUE")
    private boolean status;

    @OneToMany(mappedBy = "doctores")
    @JsonIgnore
    private List<Turno> turnos;

    public Doctor() {
    }

    public Doctor(Long id, String nameComplete, int age, String especiality, List<Turno> turnos, boolean status) {
        this.id = id;
        this.nameComplete = nameComplete;
        this.age = age;
        this.especiality = especiality;
        this.turnos = turnos;
        this.status = status;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameComplete() {
        return nameComplete;
    }

    public void setNameComplete(String nameComplete) {
        this.nameComplete = nameComplete;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEspeciality() {
        return especiality;
    }

    public void setEspeciality(String especiality) {
        this.especiality = especiality;
    }

    public List<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<Turno> turnos) {
        this.turnos = turnos;
    }

    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
}
