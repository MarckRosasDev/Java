public class TiposDatos {
    public static void main(String[] args) {
        //Tipos de Datos en Java

        // Enteros (su valor o defult es 0
        byte tioByte = 127;
        // byte tipoByte = (byte)128;
        System.out.println("tioByte = " + tioByte);

        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);

        //Punto flotante (su valor por default es 0.0
        float tipoFloat = 3.14F; // F o f para indicar tipo float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 3.1315D; // D o d para indicar tipo double (opcional)
        System.out.println("tipoDouble = " + tipoDouble);
        
        //Caracter (su valor por default es '\u0000'
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; //Caracteres Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //Booleano
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        //Tipos Oject (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre= "Juan Perez";
        System.out.println("nombre = " + nombre);

    }
}
