package modelo;

public class Categoria {

    //creo los atributos los de la tb_categoria
    private int idCategoria;
    private String descripcion;
    private int estado;

    //creo el contructor
   // constructor vacio no tiene parametros
    public Categoria() {
        this.idCategoria = 0;
        this.descripcion = "";
        this.estado = 0;
    }

    //constructor sobrecargado, es constructor con parametros /le doy generate code
    public Categoria(int idCategoria, String descripcion, int estado) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    //creo el set and getter (generate code)
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    //me voy al controlador a crear ctr_categoria
}
