public class Cliente implements InfoCliente{
    private String nombre;
    private String contraseña;

    public Cliente(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String tenerNombre() {
    return (nombre);
    }

    @Override
    public String tenerContraseña() {
    return (contraseña);
    }
}
