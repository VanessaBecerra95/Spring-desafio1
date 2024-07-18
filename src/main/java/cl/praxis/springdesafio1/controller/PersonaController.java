package cl.praxis.springdesafio1.controller;

import cl.praxis.springdesafio1.model.dto.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class PersonaController {

    @GetMapping("/")
    public String index() {
        return "Bienvenido a la página de estudiantes";
    }

    @GetMapping("/estudiante/{nombre}/{apellido}/{edad}")
    public Persona getPersona(@PathVariable String nombre,
                              @PathVariable String apellido,
                              @PathVariable int edad) {
        Persona persona = new Persona(nombre, apellido, edad);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        return persona;
    }

    @GetMapping("/saludos")
    public void saludos() {
        System.out.println("Saludos desde la consola usando Spring Boot y Java 😁");
    }

    public void printPersona() {
        Persona persona = new Persona("Vanessa", "Becerra", 29);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
    }
}
