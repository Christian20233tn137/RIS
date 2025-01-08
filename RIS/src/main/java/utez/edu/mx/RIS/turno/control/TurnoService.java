package utez.edu.mx.RIS.turno.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utez.edu.mx.RIS.doctor.model.DoctorRepository;
import utez.edu.mx.RIS.turno.model.TurnoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class TurnoService {

    private static final Logger logger = LoggerFactory.getLogger(TurnoRespository.class);

    private final TurnoRespository turnoRepository;
    private final DoctorRepository doctorRepository;

    public TurnoService(TurnoRespository turnoRepository, DoctorRepository doctorRepository) {
        this.turnoRepository = turnoRepository;
        this.doctorRepository = doctorRepository;
    }

    @Transactional(readOnly = true)
    public ResponseEntity<Object> obtenerTurnos(){
        logger.info("Obteniendo todas las turnos");
        List<TurnoRespository> turnos = turnoRepository.findAll();
        logger.info("Obteniendo todas las turnos");

    }

}
