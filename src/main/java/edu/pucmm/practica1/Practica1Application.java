package edu.pucmm.practica1;

import edu.pucmm.practica1.entidades.Estudiante;
import edu.pucmm.practica1.repositorio.EstudianteRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Date;

@SpringBootApplication
public class Practica1Application {

    public static void main(String[] args) {
        //Crear el template
        //SpringApplication.run(DemoSpringBootApplication.class, args);

        ApplicationContext applicationContext = SpringApplication.run(Practica1Application.class, args);

        //Sin Inyección de dependencia:
        EstudianteRepository estudianteRepository = (EstudianteRepository) applicationContext.getBean("estudianteRepository");
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("Carlos");
        estudiante.setApellido("Camacho");
        estudiante.setTelefono("809-7240883");
        estudianteRepository.save(estudiante);
    }

}
