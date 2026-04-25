package com.juaneliezer.p0904_23_17517.gestionbiblioteca.servicio;

import com.juaneliezer.p0904_23_17517.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }


    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

   
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(this.libros);
    }

   
    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; 
    }
}