package modelo;

public class Producto {

    //cree la clase producto  y ahora los atributos (mismos tabla producto)
    private int idProducto;
    private String nombre;
    private int cantidad;
    private double precio; //num q tienen parte entera y decimal
    private String descripcion;
    private int porcentaje;
    private int idCategoria;
    private int estado;

    //constructor siempre el nombre de la clase
    public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0.0;
        this.descripcion = "";
        this.porcentaje = 0;
        this.idCategoria = 0;
        this.estado = 0;

    }
    //genero code constructor sobrecargado

    public Producto(int idProducto, String nombre, int cantidad, double precio, String descripcion, int porcentaje, int idCategoria, int estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descripcion = descripcion;
        this.porcentaje = porcentaje;
        this.idCategoria = idCategoria;
        this.estado = estado;
    }

    //genero metodo set and get, metodos mostrar o modificar siempre es de tipo public
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
// me voy a source de boton guardar producto
}
