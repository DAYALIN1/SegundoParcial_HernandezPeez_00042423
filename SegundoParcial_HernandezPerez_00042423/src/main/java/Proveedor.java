public class Proveedor {

    private String cliente;
    private String empresa;

    public Proveedor(String cliente, String empresa) {
        this.cliente = cliente;
        this.empresa = empresa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
