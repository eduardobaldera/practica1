package edu.pucmm.practica1.repositorio;

import edu.pucmm.practica1.entidades.Estudiante;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    Estudiante findByMatricula(Long matricula);
    List<Estudiante> findAll();

}
