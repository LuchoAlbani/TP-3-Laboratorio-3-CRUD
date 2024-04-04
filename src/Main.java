import com.albani.producto.controller.CategoriaController;
import com.albani.producto.controller.ProductoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crean instancias de las clases ProductoController y CategoriaController
        ProductoController productoController = new ProductoController();
        CategoriaController categoriaController = new CategoriaController();
        // Se crea una instancia de la clase Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Bucle infinito que muestra un menú al usuario hasta que decida salir
        while (true) {
            System.out.println("1. Gestionar productos");
            System.out.println("2. Gestionar categorías");
            System.out.println("0. Salir");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Gestionar productos
                    productoController.gestionarProductos();
                    break;
                case 2: // Gestionar categorías
                    categoriaController.gestionarCategorias();
                    break;
                case 0: // Salir
                    System.out.println("Saliendo del programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida, por favor selecciona una opción válida.");
            }
        }
    }
}
