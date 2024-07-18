package cl.praxis.springdesafio1;

import cl.praxis.springdesafio1.controller.PersonaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDesafio1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringDesafio1Application.class, args);
        PersonaController personaController = new PersonaController();
        personaController.saludos();
        personaController.printPersona();
    }

}
