/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.util.HashMap;
import java.util.Map;
import spark.ModelAndView;
import static spark.Spark.*;
import spark.template.freemarker.FreeMarkerEngine;
import java.awt.image.BufferedImage;
import java.util.Date;
import java.util.Random;
/**
 *
 * @author frank
 */
public class Main {

    public static void main(String[] args) {
        

        get("/hello", (req, res) -> "Hello World");
        
        get("/random", (request, response) -> {
        Random generadorAleatorios = new Random();
        int numeroAleatorio = 1+generadorAleatorios.nextInt(10);
            return   numeroAleatorio;
          
        });
        
        get("/fecha", (request, response) -> {
        java.util.Date fecha = new Date();
            return   fecha;
          
        });
        
        get("/Fecha", (request, response) -> {
        java.util.Date fecha = new Date();
            return   fecha;
          
        });


        get("/Mayuscula/:parametro1/:parametro2", (request, response) -> {
            String nombre=request.params("parametro1");
            String nombre2=request.params("parametro2");
            return "Hola: " + nombre.toUpperCase()+nombre2.toUpperCase();
        });
        path("/tep", () -> {

            path("/estudiantes", () -> {
                get("/ver", (request, response) -> {
                    return "Ver estudiantes" ;
                });
                get("/listar", (request, response) -> {
                    return "Listar Esetudiantes" ;
                });

            });

        });
    }
}
