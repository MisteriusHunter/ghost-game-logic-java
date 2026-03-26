package com.mycompany.practicapoo1;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PracticaPOO1 {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Fantasma fantasmaRojo = new Fantasma("Blink", "Rojo", 0, 3);
        fantasmaRojo.MostrarInformacion();
        fantasmaRojo.Acelerar(2);
        fantasmaRojo.Morir();
        fantasmaRojo.Morir();
        fantasmaRojo.Morir();
        fantasmaRojo.Morir();  // debería llegar a GAME OVER        

        Fantasma fantasmaAmarillo = new Fantasma("Pokey", "Amarillo", 10, 1);
        fantasmaAmarillo.MostrarInformacion();
        fantasmaAmarillo.Morir();  // debería llegar a GAME OVER 

        Fantasma fantasmaGris = new Fantasma();
        fantasmaGris.MostrarInformacion();
        fantasmaGris.Acelerar(8);

        Fantasma fantasmaAzul = new Fantasma("Azul", 4);
        fantasmaAzul.MostrarInformacion();                
    }
}

