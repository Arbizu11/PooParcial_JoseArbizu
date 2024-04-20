package Electronicos;

public class Telefono extends ArticulosElectronicos implements Precio_Descripcion
{
    //Atributos
    private String marca;

    //Constructores
    public Telefono(){}
    public Telefono(String marca, String modelo, String descripcion, double precio, String SIM)
    {
        super(marca, modelo, descripcion, precio);
        this.marca = marca;
    }

    //Get y set
    public String isSIM() {
        return marca;
    }

    public void setSIM(String SIM) {
        this.marca = marca;
    }

    //Métodos
    public double ObtenerPrecio(double precio)
    {
        return precio;
    }
    public String ObtenerDescripcion(String descripcion)
    {
        return descripcion;
    }
}
