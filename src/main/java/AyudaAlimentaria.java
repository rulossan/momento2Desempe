public class AyudaAlimentaria extends AyudaEconomica {
    private int personasBeneficiadas;

    // Constructor
    public AyudaAlimentaria(double recursosTotales, double recursosPorPersona) {
        super(0, 0, recursosTotales, recursosPorPersona);
        this.personasBeneficiadas = (int) (recursosTotales / recursosPorPersona);  // Calcular en el constructor
    }

    public int getPersonasBeneficiadas() {
        return personasBeneficiadas;
    }

    @Override
    public double calcularAyuda(double recursosTotales, double recursosPorPersona) {
        // Recalcular personasBeneficiadas y actualizar el valor
        this.personasBeneficiadas = (int) (recursosTotales / recursosPorPersona);
        return this.personasBeneficiadas;
    }

    public void imprimirDetalles() {
        System.out.println("Personas que pueden recibir alimentos: " + personasBeneficiadas);
    }
}

