package smartlibrary;

import java.time.LocalDate;

public class Renovacion {

    private LocalDate fechaRenovacion;
    private LocalDate fechaAnterior;
    private LocalDate nuevaFecha;

    // Visibilidad de paquete: solo Prestamo puede crear renovaciones (composición).
    Renovacion(LocalDate fechaRenovacion, LocalDate fechaAnterior, LocalDate nuevaFecha) {
        this.fechaRenovacion = fechaRenovacion;
        this.fechaAnterior = fechaAnterior;
        this.nuevaFecha = nuevaFecha;
    }

    public LocalDate getFechaRenovacion() {
        return fechaRenovacion;
    }

    public LocalDate getFechaAnterior() {
        return fechaAnterior;
    }

    public LocalDate getNuevaFecha() {
        return nuevaFecha;
    }
}
