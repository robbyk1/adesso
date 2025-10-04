package com.example.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Sagt Spring: Das ist ein REST-Controller
public class Controller {

    @GetMapping("/hello")  // Diese Methode wird bei Aufruf von localhost:8080/hello ausgeführt
    public String hello() {
        return "Hallo, mein Name ist Robert Kehnen.";
    }

    @GetMapping("/info")  // Diese Methode wird bei Aufruf von localhost:8080/info ausgeführt
    public String info() {
        return "Diese Applikation dient meiner Bewerbung bei Sebastian Herbermann von adesso SE.";
    }

    @GetMapping("/about")  // Diese Methode wird bei Aufruf von localhost:8080/about ausgeführt
    public String about() {
        return """
                Mein Name ist Robert Kehnen, ich studiere Informatik an der TU Dortmund.<br>
                Ich habe bereits ein wenig Erfahrung durch meine 2 Jahre als Software Tester bei der ICA Traffic<br>
                und möchte durch dieses Projekt mich konkreter auf den Techstack von adesso vorbereiten.""";
    }
}