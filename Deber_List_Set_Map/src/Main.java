import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List <Persona> lista = new ArrayList<>();

        ingresarPersonas(lista, sc);
        System.out.println("--- LISTADO DE PERSONAS ---");
        for (Persona p:lista){
            p.imprimirDatos();
        }

        sc.close();
    }

    //Crear función ingresarPersonas
    public static void ingresarPersonas(List<Persona> lista, Scanner sc){
        int opcion;

        do {
            System.out.println("--- MENÚ ---");
            System.out.println("1. Registrar Persona");
            System.out.println("0. Salir");
            System.out.println("Escoja una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1){
                System.out.println("Ingrese el nombre: ");
                String nombre = sc.nextLine();

                System.out.println("Ingrese la edad: ");
                int edad = sc.nextInt();

                System.out.println("Ingrese la estatura: ");
                float estatura = sc.nextFloat();

                //Crear el objeto (Persona)
                Persona persona = new Persona(nombre,edad,estatura);

                //Agregar los datos a la lista
                lista.add(persona);

                System.out.println("Persona registrada correctamente");
            } else if (opcion == 0) {
                System.out.println("Saliendo del sistema....");
            } else {
                System.out.println("Opcion inválida");
            }
        } while (opcion !=0);
    }
}