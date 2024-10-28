public class Main {
    public static void main(String[] args) {

        AyudaMonetaria ayudaMonetaria = new AyudaMonetaria(10, 100);
        ayudaMonetaria.imprimirDetalles();

        AyudaAlimentaria ayudaAlimentaria = new AyudaAlimentaria(1000, 50);
        ayudaAlimentaria.imprimirDetalles();
    }
}
