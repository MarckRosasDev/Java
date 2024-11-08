public class TipoVar {
    public static void main(String[] args) {
        // Sin el uso de var
        String nombre1= "Juan";
        System.out.println("nombre1 = " + nombre1);
        // Con el uso de var
        var noombre2 = "Carlos";
        System.out.println("noombre2 = " + noombre2);
        // Definir otras variables usando
        var edad = 30; // Se infiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // Se infiere tipo float
        var esCasado = false; // Se infiere tipo boolean
        esCasado = true;
        //esCasado = "No"; No podemos asignar un tipo distinto

        // Se debe definir su valor
        // var precio; es lanza un error, tenemos que asignar un valor
        // precio = 10;

        // Se debe poder inferir el tipo de dato
        // var aoellido = null; marca error

    }
}
