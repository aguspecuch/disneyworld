package ar.com.alkemy.disneyworld.models;

import java.util.ArrayList;
import java.util.List;

public class PersonajeModel {
   
    public String nombre;
    public String imagen;
    public Integer edad;
    public Double peso;
    public String historia;
    public List<ContenidoModel> peliculas = new ArrayList<>();
    public List<ContenidoModel> series = new ArrayList<>();
}
