package smartlibrary;

import java.time.LocalDate;

public class PruebaBloque5 {

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("1085123456", "Ana Rosero",
                "ana.rosero@campusucc.edu.co", "EST-2026-001", "Ingeniería de Software");

        Libro libro = new Libro("978-9706861900", "Ingeniería de software orientada a objetos");
        Ejemplar ejemplar = new Ejemplar("EJ-001", libro);

        Prestamo prestamo = new Prestamo(estudiante, ejemplar,
                LocalDate.of(2026, 9, 30), LocalDate.of(2026, 10, 8));

        System.out.println("=== Prueba 1: renovación válida ===");
        prestamo.renovar(LocalDate.of(2026, 10, 15));
        estudiante.notificar("Su préstamo fue renovado.");
        System.out.println("Nueva fecha prevista: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones: " + prestamo.getCantidadRenovaciones());

        System.out.println("=== Prueba 2: renovación inválida ===");
        try {
            prestamo.renovar(LocalDate.of(2026, 10, 15));
        } catch (IllegalArgumentException e) {
            System.out.println("Renovación rechazada: " + e.getMessage());
        }
        System.out.println("Fecha prevista sin cambios: " + prestamo.getFechaPrevistaDevolucion());
        System.out.println("Cantidad de renovaciones sin cambios: " + prestamo.getCantidadRenovaciones());

        Usuario bibliotecario = new Bibliotecario("27123456", "Carlos Pantoja",
                "carlos.pantoja@campusucc.edu.co", "EMP-015", "Mañana");
        System.out.println("¿Bibliotecario es Notificable? " + (bibliotecario instanceof Notificable));
    }
}
