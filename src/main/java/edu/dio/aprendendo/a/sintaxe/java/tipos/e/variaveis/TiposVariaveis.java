package edu.dio.aprendendo.a.sintaxe.java.tipos.e.variaveis;

public class TiposVariaveis {
    // Constantes (final)
    public static final int CONST_INT = 100;
    public static final double CONST_DOUBLE = 3.14;
    public static final String CONST_STRING = "Constante";

    // Variáveis estáticas
    public static int contador = 0;

    public static void main(String[] args) {
        // Tipos Primitivos
        byte umByte = 100; // -128 a 127
        short umShort = 1000; // -32.768 a 32.767
        int umInt = 10000; // -2^31 a 2^31-1
        long umLong = 100000L; // -2^63 a 2^63-1

        float umFloat = 3.14F; // precisão de 7 dígitos
        double umDouble = 3.14159; // precisão de 15 dígitos

        char umChar = 'A'; // Um único caractere Unicode
        boolean umBoolean = true; // true ou false

        // Impressão dos tipos primitivos
        System.out.println("Tipos Primitivos:");
        System.out.println("byte: " + umByte);
        System.out.println("short: " + umShort);
        System.out.println("int: " + umInt);
        System.out.println("long: " + umLong);
        System.out.println("float: " + umFloat);
        System.out.println("double: " + umDouble);
        System.out.println("char: " + umChar);
        System.out.println("boolean: " + umBoolean);

        // Classes comuns
        String umaString = "Hello, World!";
        Integer umInteger = 123; // Classe wrapper para int
        Double umDoubleWrapper = 456.78; // Classe wrapper para double

        // Array (vetor) - também uma classe comum em Java
        int[] umArray = {1, 2, 3, 4, 5};

        // Lista - coleção mais avançada
        java.util.List<String> umaLista = new java.util.ArrayList<>();
        umaLista.add("Item 1");
        umaLista.add("Item 2");

        // Impressão das classes comuns
        System.out.println("\nClasses Comuns:");
        System.out.println("String: " + umaString);
        System.out.println("Integer: " + umInteger);
        System.out.println("Double: " + umDoubleWrapper);
        System.out.println("Array: " + java.util.Arrays.toString(umArray));
        System.out.println("Lista: " + umaLista);

        // Impressão das constantes
        System.out.println("\nConstantes:");
        System.out.println("CONST_INT: " + CONST_INT);
        System.out.println("CONST_DOUBLE: " + CONST_DOUBLE);
        System.out.println("CONST_STRING: " + CONST_STRING);

        // Utilizando a variável estática
        System.out.println("\nVariável Estática (contador): " + contador);
        incrementarContador();
        System.out.println("Variável Estática (contador) após incremento: " + contador);
    }

    public static void incrementarContador() {
        contador++;
    }
}
