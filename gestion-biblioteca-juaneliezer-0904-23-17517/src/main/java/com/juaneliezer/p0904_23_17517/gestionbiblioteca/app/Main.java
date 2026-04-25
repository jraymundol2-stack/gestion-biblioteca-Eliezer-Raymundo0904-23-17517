package com.juaneliezer.p0904_23_17517.gestionbiblioteca.app;

import com.juaneliezer.p0904_23_17517.gestionbiblioteca.modelo.Libro;
import com.juaneliezer.p0904_23_17517.gestionbiblioteca.servicio.Biblioteca;

public class Main {
    public static void main(String[] args) {
        
        Biblioteca miBiblioteca = new Biblioteca();

        System.out.println("--- GESTIÓN DE BIBLIOTECA - JUAN ELIEZER ---");

        
        miBiblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        miBiblioteca.agregarLibro(new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954));
        miBiblioteca.agregarLibro(new Libro("Clean Code", "Robert C. Martin", 2008));

       
        System.out.println("Intentando agregar un libro inválido...");
        try {
            
            Libro libroInvalido = new Libro("Libro Fallido", "Autor X", 0);
            miBiblioteca.agregarLibro(libroInvalido);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR CAPTURADO: " + e.getMessage());
        }

        System.out.println("-- LISTADO DE LIBROS EN LA BIBLIOTECA ---");
        for (Libro l : miBiblioteca.obtenerLibros()) {
            System.out.println(l.toString() + " | ¿Es antiguo?: " + (l.esAntiguo() ? "SÍ" : "NO"));
        }

        String tituloABuscar = "Clean Code";
        System.out.println("\nBuscando el libro: '" + tituloABuscar + "'...");
        Libro encontrado = miBiblioteca.buscarPorTitulo(tituloABuscar);


        if (encontrado != null) {
            System.out.println("RESULTADO: Libro encontrado con éxito.");
            System.out.println("Datos del libro: " + encontrado);
        } else {
            System.out.println("RESULTADO: El libro no se encuentra en la biblioteca.");
        }
    }
}