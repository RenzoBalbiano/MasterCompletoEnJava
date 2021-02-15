public enum Color {

    ROJO("Rojo"), AMARILLO("Amarillo"), AZUL("Azul"), BLANCO("Blanco"), GRIS("Gris"), NARANJO("Naranja");

    private final String color; // atributo. Vamos a guardar el color o su nombre, pero más personalizado. Para
                                // eso necesitamos pasarlo como constructor / argumento.

    // pasar el color por argumento y lo asigna al atributo, que es final, no se
    // puede modificar. Es constante pero es propio de la referencia de enum.
    // por cada constante o opción podemos darle un valor personalizado. Al final es
    // un atributo, podríamos pasarle más de un parámetro.Podemos tener varios
    // argumentos y por cada uno una constante final.

    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString(){
        return this.color;
    }

}
