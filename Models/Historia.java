package Models;

import java.util.Date;

public class Historia {
    private int historia_id;
    private String titulo_historia;
    private String contenido_historia;
    private Date fecha_publicacion_historia;
    private String categoria;
    private String estado;

    // Constructor
    public Historia(int historia_id, String titulo_historia, String contenido_historia, Date fecha_publicacion_historia, String categoria) {
        this.historia_id = historia_id;
        this.titulo_historia = titulo_historia;
        this.contenido_historia = contenido_historia;
        this.fecha_publicacion_historia = fecha_publicacion_historia;
        this.categoria = categoria;
        this.estado = "Pendiente"; // Estado por defecto
    }

    // Getters y Setters
    public int getHistoria_id() {
        return historia_id;
    }

    public void setHistoria_id(int historia_id) {
        this.historia_id = historia_id;
    }

    public String getTitulo_historia() {
        return titulo_historia;
    }

    public void setTitulo_historia(String titulo_historia) {
        this.titulo_historia = titulo_historia;
    }

    public String getContenido_historia() {
        return contenido_historia;
    }

    public void setContenido_historia(String contenido_historia) {
        this.contenido_historia = contenido_historia;
    }

    public Date getFecha_publicacion_historia() {
        return fecha_publicacion_historia;
    }

    public void setFecha_publicacion_historia(Date fecha_publicacion_historia) {
        this.fecha_publicacion_historia = fecha_publicacion_historia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}