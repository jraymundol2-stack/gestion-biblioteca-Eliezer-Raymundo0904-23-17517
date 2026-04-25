package com.juaneliezer.p0904_23_17517.gestionbiblioteca.servicio;

import com.juaneliezer.p0904_23_17517.gestionbiblioteca.modelo.Libro;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Atributo privado solicitado: una lista de libros
    private List<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    // Método para agregar un libro
    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    // Método que devuelve una copia de la lista (para seguridad de los datos)
    public List<Libro> obtenerLibros() {
        return new ArrayList<>(this.libros);
    }

    // Método para buscar un libro por su título (ignorando mayúsculas/minúsculas)
    public Libro buscarPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null; // Retorna null si no lo encuentra
    }
}