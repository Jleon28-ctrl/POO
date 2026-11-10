import ESFOT.Estudiante;
import ESFOT.Pasante;
import ESFOT.Persona;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona1 = new Persona("Ana");
        Persona persona2 = new Persona("Andrés",25,1.70f);
        Persona persona3 = new Persona("Juan",24,1.80f);
        Persona persona4 = new Persona("Maria",23,1.70f);
        Persona persona5 = new Persona("Nemo",22,2.10f);

        System.out.printf("List");

        List<Persona> lista = new ArrayList<>();
        lista.add(persona);
        lista.add(persona1);
        lista.add(persona2);
        lista.add(persona3);
        lista.add(persona4);
        lista.add(persona5);
        lista.add(new Persona("Jorge",46,1.60f));
        lista.add(new Persona("Cinthia",38,1.70f));
        lista.add(new Persona("Mateo",20,1.70f));
        lista.add(new Persona("Brat",16,1.65f));
        lista.add(new Persona("Sofia",20,1.55f));


        persona.setNombre("Tatiana");

        System.out.println("Listado de personas");
        for (Persona p:lista){
            System.out.println(p.descripcion());
        }

        lista.get(0).setEdad(18);
        lista.get(0).imprimirDatos();

        lista.get(1).setEdad(18);
        lista.get(1).imprimirDatos();

        lista.get(2).setEdad(18);
        lista.get(2).imprimirDatos();

        lista.get(3).setEdad(18);
        lista.get(3).imprimirDatos();

        lista.get(4).setEdad(18);
        lista.get(4).imprimirDatos();

        System.out.printf("set - conjuntos");
        Set<String> nombres = new HashSet<>();
        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Michael"); // Duplicado: será ignorado
        nombres.add("Irene");   // Duplicado: será ignorado
        nombres.add("Javier");  // Duplicado: será ignorado
        nombres.add("Mateo");   // Duplicado: será ignorado

        System.out.println("Nombres únicos (sin orden garantizado):");
        System.out.println(nombres);

        Set<Persona> nombres2 = new HashSet<>();
        nombres2.add(new Persona("Ana", 25, 1.65f));
        nombres2.add(new Persona("Pepe", 46, 1.60f));
        nombres2.add(new Persona("Vero", 38, 1.70f));

        for (Persona p:nombres2){
            System.out.println(p.descripcion());
        }

        System.out.printf("MashMap");

        Map<String, Persona> codigounico = new HashMap<>();
        codigounico.put("e01", persona);
        codigounico.put("e02", persona1);
        codigounico.put("e03", persona2);
        codigounico.put("e04", lista.get(4));

        System.out.println("Código Único e03" + codigounico.get("e03").descripcion());

        System.out.println("-------------------------------");
        System.out.println("CREACIÓN DE UN ESTUDIANTE");
        Estudiante estudiante=new Estudiante();
        estudiante.setNombre("Jorge");
        estudiante.setEdad(18);
        estudiante.setEstatura(1.65f);
        estudiante.imprimirDatos();
        System.out.println(estudiante.getPromedio());
        System.out.println("------");
        estudiante.imprimirDatos();

        System.out.println("-------------------------------");
        System.out.println("CREACIÓN DE UN PASANTE");
        Pasante pasante = new Pasante();
        pasante.setNombre("Juan");
        pasante.setEdad(18);
        pasante.setEstatura(1.57f);
        pasante.imprimirDatos();
        pasante.setPromedio(18);
        pasante.setPorcentajeBeca(8.8);
        pasante.imprimirPorcentajeBeca();
        System.out.println("------");
        estudiante.imprimirDatos();

    }
}