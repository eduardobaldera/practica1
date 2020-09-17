package edu.pucmm.practica1.servicios;

import edu.pucmm.practica1.entidades.Estudiante;
import edu.pucmm.practica1.repositorio.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServices {
    //Inyectando el repositorio
    @Autowired
    private EstudianteRepository estudianteRepository;

    public long cantidadEstudiantes(){
        return estudianteRepository.count();
    }

    public Estudiante creacionEstudiante(Estudiante estudiante){
        estudianteRepository.save(estudiante);
        return estudiante;
    }

    public void borrarEstudiante(Estudiante e){
        estudianteRepository.delete(e);
    }

    public Estudiante estudiantePorMatricula(Long matricula) {
        return estudianteRepository.findByMatricula(matricula);
    }

    public List<Estudiante> listaEstudiante(){
        return estudianteRepository.findAll();
    }

}
