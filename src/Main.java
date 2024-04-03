import com.albani.producto.controller.CategoriaController;
import com.albani.producto.controller.ProductoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductoController productoController = new ProductoController();
        CategoriaController categoriaController = new CategoriaController();
        Scanner scanner = new Scanner(System.in);

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