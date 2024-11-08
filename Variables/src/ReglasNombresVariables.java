public class ReglasNombresVariables {
    public static void main(String[] args) {
        String nombreCompleto = "Juan Carlos"; // Correcto, buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2"; // Correcto, no aplia buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Juan"; // Incorrecto
        String nombre_cliente = "Juan"; // Correcto, no aplica buenas prácticas
        String _apellido = "Perez"; // Correcto y aceptable
        String $apellido = "Juarez"; // Correcto y aceptable
        int totPzs = 10; // Corecto, no aplica buenas prácticas
        int totalPiezas = 10; // Correcto, aplica buenas prácticas
        boolean asado = true; // Correcto, aunque puede mejorar
        boolean esCasado = true; // Correcto, aplicabuenas prácticas
        boolean isCasado = true; // Correcto, aplica buenas prácticas *
        boolean tieneSaldo = true; // Correcto, aplica buenas prácticas
        boolean hasSaldo = true; // Correcto, aplica buenas prácticas *

    }
}
