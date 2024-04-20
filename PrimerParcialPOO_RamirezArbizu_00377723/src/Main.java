import Electronicos.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {
    static ArrayList<ArticulosElectronicos> listarticulos = new ArrayList<ArticulosElectronicos>();
    public static void main(String[] args)
    {
        menuPrincipal();
    }

    public static void menuPrincipal()
    {
        Scanner sc = new Scanner(System.in);
        int opc;

        while(true)
        {
            menu();
            try{
                opc = sc.nextInt();
                sc.nextLine();

                if(opc == 5) {
                    System.out.println("Saliendo...");
                    break;
                }

                switch (opc)
                {
                    case 1:
                        AgregarArticulo();
                        break;
                    case 2:
                        modificarnombre();
                        break;
                    case 3:
                        mostratunarticulo();
                        break;
                    case 4:
                        mostrartodo();
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida...");
                        break;
                }
            }catch (InputMismatchException e)
            {
                sc.nextLine();
                System.out.println("\nIngresar opcion valida...\n");
            }
        }

    }

    private static void modificarnombre()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del articulo: ");
        String nombre = sc.nextLine();

        for(int i = 0; i < listarticulos.size(); i++)
        {
            if(listarticulos.get(i).getNombre().equals(nombre))
            {
                System.out.print("\nIngrese el nuevo nombre: ");
                String newnombre = sc.nextLine();

                listarticulos.get(i).setNombre(newnombre);
                System.out.println("Se cambio el nombre exitosamente!");
            }

        }
    }

    private static void mostratunarticulo()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del articulo: ");
        String nombre = sc.nextLine();

        for(int i = 0; i < listarticulos.size(); i++)
        {
            if(listarticulos.get(i).getNombre().equals(nombre))
            {
                ArticulosElectronicos art = listarticulos.get(i);
                System.out.println(i+1 +".\tNombre: " + art.getNombre()+ "\tModelo: "+ art.getModelo()+"\tDescripcion: "+art.getDescripcion()+"\tPrecio: "+art.getPrecio());
            }

        }


    }

    private static void mostrartodo()
    {
        System.out.println("Articulos: ");

        for(int i = 0; i < listarticulos.size(); i++)
        {
            ArticulosElectronicos art = listarticulos.get(i);
            System.out.println(i+1 +".\tNombre: " + art.getNombre()+ "\tModelo: "+ art.getModelo()+"\tDescripcion: "+art.getDescripcion()+"\tPrecio: "+art.getPrecio());
        }
    }

    private static void AgregarArticulo()
    {
        int tipo = tipoArticulo();
        ArticulosElectronicos articulosElectronicos = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();
        System.out.print("\nIngrese el modelo del producto: ");
        String modelo = sc.nextLine();
        System.out.print("\nIngrese la descripcion del producto: ");
        String descripcion = sc.nextLine();
        System.out.print("\nIngrese el precio del producto: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        switch (tipo)
        {
            case 1:
                System.out.print("\nMarca: ");
                String marca = sc.nextLine();
                articulosElectronicos = new Telefono(nombre, modelo, descripcion, precio, marca);
                break;

            case 2:
                System.out.print("\nCantidad de puertos USB: ");
                int puertos = sc.nextInt();
                sc.nextLine();
                System.out.print("\nSistema operativo: ");
                String SO = sc.nextLine();

                articulosElectronicos = new Laptop(nombre, modelo, descripcion, precio, puertos, SO);
                break;
        }
        listarticulos.add(articulosElectronicos);

    }

    private static int tipoArticulo()
    {
        Scanner sc = new Scanner(System.in);
        int opcion;
        while(true)
        {
            try
            {
                System.out.println("Seleccione tipo de articulo: ");
                System.out.println("1.Telefono");
                System.out.println("2.Laptop");
                System.out.print("Opcion: ");
                opcion = sc.nextInt();
                if(opcion >= 1 && opcion <= 2) return opcion;
                System.out.println("Ingrese una opcion valida");
            }catch (Exception e)
            {
                System.out.println("Ingrese una opcion valida");
            }
            sc.nextLine();
        }
    }

    public static void menu()
    {
        System.out.println("Seleccione una opcion: ");
        System.out.println("\t1.Agregar Articulo");
        System.out.println("\t2.Modificar precio");
        System.out.println("\t3.Mostrar un articulo");
        System.out.println("\t4.Mostrar todos los articulos");
        System.out.println("\t5.Salir");
        System.out.print("\tOpcion: ");
    }

}