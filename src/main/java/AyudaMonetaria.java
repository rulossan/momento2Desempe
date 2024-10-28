public class AyudaMonetaria extends AyudaEconomica {
    private double totalAyuda;

    // Constructor
    public AyudaMonetaria(int numeroPersonas, double montoPorPersona) {
        super(numeroPersonas, montoPorPersona, 0, 0);
        this.totalAyuda = calcularAyuda(numeroPersonas, montoPorPersona);
    }

    public double getTotalAyuda() {
        return totalAyuda;
    }

    public void setTotalAyuda(double totalAyuda) {
        this.totalAyuda = totalAyuda;
    }

    @Override
    public double calcularAyuda(int numeroPersonas, double montoPorPersona) {
        return numeroPersonas * montoPorPersona;
    }

    public void imprimirDetalles() {
        System.out.println("Total Ayuda Monetaria: " + totalAyuda);
    }
}
