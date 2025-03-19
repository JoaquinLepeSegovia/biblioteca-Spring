package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Libro {

    private int id;
    private String isbn;
    private String Titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}


