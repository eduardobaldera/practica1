package edu.pucmm.practica1.controladores;


import edu.pucmm.practica1.entidades.Estudiante;
import edu.pucmm.practica1.servicios.EstudianteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.lang.reflect.Parameter;


@Controller()
@RequestMapping("/api")
public class RutasController {
    //Inyección de dependencia para la internacionalización
    @Autowired
    private EstudianteServices estudianteServices;


    @GetMapping("/crear")
    public String crearEstudiante(){
        return "crear";
    }

    @GetMapping("/listar")
    public String listarEstudiantes(Model model){
        model.addAttribute("estudiantes", estudianteServices.listaEstudiante());
        return "listar";
    }

    @PostMapping("/crear")
    public String creado(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteServices.creacionEstudiante(estudiante);
        return "redirect:/api/crear";
    }

    @GetMapping("/editar")
    public String editarEstudiante(Model model, @PathParam("matricula") Long matricula){
        model.addAttribute("estudiante", estudianteServices.estudiantePorMatricula(matricula));
        return "editar";
    }

    @PostMapping("/editar")
    public String editadoEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteServices.creacionEstudiante(estudiante);
        return "redirect:/api/listar";
    }

    @GetMapping("/eliminar")
    public String eliminandoEstudiante(@PathParam("matricula") Long matricula){
        estudianteServices.borrarEstudiante(estudianteServices.estudiantePorMatricula(matricula));
        return "redirect:/api/listar";
    }


}
