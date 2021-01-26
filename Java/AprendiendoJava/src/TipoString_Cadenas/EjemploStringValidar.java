package TipoString_Cadenas;

public class EjemploStringValidar {
  public static void main(String[] args) {

    String curso = null;

    boolean esNulo = curso == null;

    System.out.println(esNulo);

    /*
     * if(esNulo == false) { System.out.println(curso.toUpperCase()); }
     */
    if (esNulo) {
      curso = "Programación java ";
      // curso = " ";
    }

    boolean esVacio = curso.length() == 0;
    System.out.println(esVacio);

    boolean esVacio2 = curso.isEmpty();

    System.out.println(esVacio2);

    boolean esBlanco = curso.isBlank();

    System.out.println(esBlanco);

    if (!esVacio) {
      System.out.println(curso.toUpperCase());

      System.out.println(curso.concat(" desde cero!")); // Da error si curso es null.
      System.out.println("Bienvenido al curso ".concat(curso)); // Da error si curso es null.
    }
    if (!esVacio2) {
      System.out.println(curso.toUpperCase());

      System.out.println(curso.concat(" desde cero!")); // Da error si curso es null.
      System.out.println("Bienvenido al curso ".concat(curso)); // Da error si curso es null.
    }
    // System.out.println("Bienvenido al curso " + curso); Bienvenido al curso null

    if (!esBlanco) {
      System.out.println(curso.toUpperCase());

      System.out.println("Hola");

      System.out.println(curso.concat(" desde cero!")); // Da error si curso es null.
      System.out.println("Bienvenido al curso ".concat(curso)); // Da error si curso es null.
    }

  }
}