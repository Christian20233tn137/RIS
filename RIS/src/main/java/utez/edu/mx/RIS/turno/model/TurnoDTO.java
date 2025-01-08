package utez.edu.mx.RIS.turno.model;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Date;

public class TurnoDTO {

    private Long id;

    @NotBlank(groups = {TurnoDTO.Register.class, TurnoDTO.Modify.class}, message = "El nombre es obligatorio")
    @Size(min = 3, max = 50, message = "El nombre debe tener entre 3 y 50 caracteres")
    private String nombre;

    @NotNull(groups = TurnoDTO.Register.class, message = "El doctor es obligatorio")
    private Long doctorId;

    private Long reporteId;

    @NotNull(groups = {TurnoDTO.Register.class, TurnoDTO.Modify.class}, message = "La fecha es obligatoria")
    private Date fecha;

    // Interfaz para validaciones en el registro
    public interface Register {}

    // Interfaz para validaciones en la modificación
    public interface Modify {}

    // Constructores
    public TurnoDTO() {}

    public TurnoDTO(String nombre, Long doctorId, Long reporteId, Date fecha) {
        this.nombre = nombre;
        this.doctorId = doctorId;
        this.reporteId = reporteId;
        this.fecha = fecha;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Long getReporteId() {
        return reporteId;
    }

    public void setReporteId(Long reporteId) {
        this.reporteId = reporteId;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
