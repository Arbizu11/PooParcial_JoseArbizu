package Electronicos;

public class Laptop extends ArticulosElectronicos implements Precio_Descripcion
{
    //Atributos
    private int cantPuertosUSB;
    private String sistemaOperativo;

    //Constructores
    public Laptop(){}
    public Laptop(String nombre, String modelo, String descripcion, double precio, int cantPuertosUSB, String sistemaOperativo)
    {
        super(nombre, modelo, descripcion, precio);
        this.cantPuertosUSB = cantPuertosUSB;
        this.sistemaOperativo = sistemaOperativo;
    }

    //get y set

    public int getCantPuertosUSB() {
        return cantPuertosUSB;
    }

    public void setCantPuertosUSB(int cantPuertosUSB) {
        this.cantPuertosUSB = cantPuertosUSB;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public double ObtenerPrecio(double precio)
    {
        return precio;
    }
    public String ObtenerDescripcion(String descripcion)
    {
        return descripcion;
    }
}
