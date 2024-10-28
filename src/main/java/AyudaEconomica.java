public class AyudaEconomica {

    private int numeroPersonas;
    private double montoPorPersona;
    private double recursosTotales;
    private double recursosPorPersona;

    // Constructor
    public AyudaEconomica(int numeroPersonas, double montoPorPersona, double recursosTotales, double recursosPorPersona) {
        this.numeroPersonas = numeroPersonas;
        this.montoPorPersona = montoPorPersona;
        this.recursosTotales = recursosTotales;
        this.recursosPorPersona = recursosPorPersona;
    }

    // Getters
    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public double getMontoPorPersona() {
        return montoPorPersona;
    }

    public double getRecursosTotales() {
        return recursosTotales;
    }

    public double getRecursosPorPersona() {
        return recursosPorPersona;
    }

    // Setters
    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public void setMontoPorPersona(double montoPorPersona) {
        this.montoPorPersona = montoPorPersona;
    }

    public void setRecursosTotales(double recursosTotales) {
        this.recursosTotales = recursosTotales;
    }

    public void setRecursosPorPersona(double recursosPorPersona) {
        this.recursosPorPersona = recursosPorPersona;
    }

    // Métodos de cálculo
    public double calcularAyuda(int numeroPersonas, double montoPorPersona) {
        return numeroPersonas * montoPorPersona;
    }

    public double calcularAyuda(double recursosTotales, double recursosPorPersona) {
        return recursosTotales / recursosPorPersona;
    }
}
