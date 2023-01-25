package modelo;

public class Usuario {
    //los atributos los que van en la tabla de la BD
    //Definimos atributos de esta clase de tipo privado
    // private no puede ser accedido x otra clase a menos q herede de ella
    // int entero string texto
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    private String telefono;
    private int estado;

    //el constructor (mismo nombre de la clase), en poo el constructor da el estado inicial a los atributos)
    public Usuario() {
        this.idUsuario = 0; //entero
        this.nombre = ""; //texto
        this.apellido = "";
        this.usuario = "";
        this.password = "";
        this.telefono = "";
        this.estado = 0;
    }

    // el metodo set and get (metodos accesores, damos generate code get and set y seleccionamos todos los atributos)
    // metodo set and get modificaciones para atributos tipo privado
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    //creamos para interactuar con nuestra tabla tb_usuario en mysql en ctrl_usuario
    
}
