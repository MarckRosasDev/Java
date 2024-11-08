public class ReservaHoteles {
    public static void main(String[] args) {
        // Definimos las variables
        var nombreCliene = "Miguel Flores";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistaAlMar = true;

        // Mostrar el detalle de la reserva
        System.out.println("nombreCliene = " + nombreCliene);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);

        // Modificamos algunos valores
        diasEstancia = 5;
        tarifaDiaria = 900.00;
        tieneVistaAlMar = false;

        // Mostrar el detalle de la reserva
        System.out.println("nombreCliene = " + nombreCliene);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaAlMar = " + tieneVistaAlMar);


    }
}
