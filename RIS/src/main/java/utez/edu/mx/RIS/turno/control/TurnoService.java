package utez.edu.mx.RIS.turno.control;

import utez.edu.mx.RIS.turno.model.TurnoRespository;

public class TurnoService {

    private final TurnoRespository turnoRepository;
    private final DoctorRepository doctorRepository;

    public TurnoService(TurnoRespository turnoRepository, DoctorRepository doctorRepository) {
        this.turnoRepository = turnoRepository;
        this.doctorRepository = doctorRepository;
    }


}
