public class Automovil implements Comparable<Automovil> {

    // Ejemplo de atributo estático para que cada vez que creemos una instancia
    // tenga un id propio autoincremental:

    private int id;

    // No lleva main porque es una clase entidad. Podría ir sin public.
    // clases pueden ser public o default.
    // atributos: private, public, default, protected
    // otros modificadores final o static.
    // static hace que atributo sea de la clase. Ej. class math o system
    // final hace que el atributo sea una constante que no se puede modificar.
    // final como método evita que se modifique en la herencia ese método.
    // public, private protected, modificadores de acceso.
    // static y final modificadores de comportamiento y de estructura. Final va
    // siempre acompañado de static porque no tiene sentido una constante de un
    // objeto o instancia.
    // final en la clase indica que no se puede modificar y por ende no puede tener
    // herencia o sub-final, para evitar sobre escribir métodos y que se puedan
    // modificar.

    private String fabricante; // así serían default o públicos.
    private String modelo;
    // private String color = Automovil.COLOR_GRIS; // por defecto
    private Color color = Color.GRIS; // por defecto
    private Motor motor;
    private Estanque estanque; // con 40 litros de gas o bencina se llena el Estanque.
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private TipoAutomovil tipo;

    // método de la instancia, se accede solo creando un objeto.
    // this se puede omitir, porque por defecto se asume, pero no siempre.

    // atributo de la clase: Por ahora en default:
    // private static String colorPatente = "Naranja"; // cualquier obj automovil va
    // a tener un color naranja.
    private static Color colorPatente = Color.NARANJO;

    private static int capacidadEstanqueEstatico = 30;

    // Ejemplo de atributo estático para que cada vez que creemos una instancia
    // tenga un id propio autoincremental:
    private static int ultimoId;

    // atributo final: son constantes, es decir no pueden ser modificados. Usaremos
    // private si queremos que la constante sea utilizada solamente dentro de la
    // clase y no queremos que sea visible dentro de la clase. Pero tipicamente es
    // pública, la idea es que podamos utilizarla tanto dentro como fuera.
    // Constantes son para configuraciones parámetros que no se van a modificar
    // luego. Es la misma idea de una variable ambiente de un sistema operativo:

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120; // tenemos una constante que no puede modificarse una vez
                                                               // definida en estas líneas.
    public static final int VELOCIDAD_MAX_CIUDAD = 50;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris oscuro";

    // podemos tener también un constructor vacío, para cuando necesitemos que se
    // rellenen luego los datos de forma dinámica:
    // sobrecarga de constructores:
    // podemos tener distintas versiones de constructores. Lo que se conoce como
    // sobrecarga de constructor.
    public Automovil() {
        // Ejemplo de atributo estático para que cada vez que creemos una instancia
        // tenga un id propio autoincremental:
        this.id = ++ultimoId; // cada que se llama a este constructor incrementa la variable.

        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this(); // para llamar al constructor de arriba.
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo); // de esta manera optimizamos o ahorramos código. //para llamar al constructor
                                  // de arriba.
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);// para llamar al constructor de arriba.
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);// para llamar al constructor de arriba.
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque, Persona conductor,
            Rueda[] ruedas) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // get y set de atrib. estático debe ser static también.

    public static Color getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if (estanque == null) {

            this.estanque = new Estanque();
        }
        return estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda) {

        if (indiceRuedas < this.ruedas.length) {

            this.ruedas[indiceRuedas++] = rueda;

        }
        return this;
    }

    public void detalle() {

        // buena práctica métodos no deberían imprimir datos. No hacer esto. Debería
        // manejar datos, devolver con return. Acá de esta forma hacemos alto
        // acomplamiento.

        String modelo = "otro"; // variable del método no de la clase. Son distintas variables. Si quiero hacer
                                // diferencia entre modelo atributo de la clase y modelo atributo del método,
                                // uso this para referirme al primero.
        System.out.println("auto : " + this.getFabricante());
        System.out.println("auto : " + this.modelo); // de la clase
        System.out.println("auto : " + modelo); // del método.
        System.out.println("auto : " + this.color);
        System.out.println("auto : " + this.motor.getCilindrada());

    }

    public String detalleDos() {

        /*
         * StringBuilder sb = new StringBuilder(); // en realidad acá no tiene sentido,
         * esta clase es para concatenar grandes cantidades de cadenas.
         * 
         * sb.append("\nfabricante : " + this.fabricante); sb.append("\nmodelo : " +
         * modelo); // del método. sb.append("\ncolor : " + this.color);
         * sb.append("\ncilindrada : " + this.cilidranda);
         */

        // forma dos:

        /*
         * String sb = "\nfabricante : " + this.fabricante + "\nmodelo : " + modelo +
         * "\ncolor : " + this.color + "\ncilindrada : " + this.cilidranda;
         * 
         * return sb;
         */

        // forma tres:

        String detalle = "\nauto.id : " + this.id +

                "\nfabricante : " + this.fabricante + "\nmodelo : " +

                modelo;

        if (this.getTipo() != null) {

            detalle += "\nauto.tipo = " + this.getTipo().getDescripcion();

        }

        detalle += "\ncolor : " + this.color + "\nauto.patenteColor = " + Automovil.colorPatente;

        if (this.getMotor() != null) {

            detalle += "\ncilindrada : " + this.motor.getCilindrada();

        }

        if (this.getConductor() != null) {

            detalle += "\nConductor: " + this.getConductor();

        }

        if (getRuedas() != null) {
            detalle += "\nRuedas del automóvil:";
            for (Rueda r : this.getRuedas()) {
                detalle += "\n" + r.getFabricante() + ", aro: " + r.getAro() + ", ancho: " + r.getAncho();
            }
        }

        return detalle;
    }

    public String acelerar(int rpm) {
        return "El auto " + this.fabricante + " acelerando a " + rpm;

    }

    public String frenar() {
        return "El auto " + this.fabricante + " frenando.";

    }

    public String acelerarFrenar(int rpm) {

        String acelerar = this.acelerar(rpm);// variables locales del método no de la clase.
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;

    }

    // calcular rendimiento, kilometros recorridos por litros.
    // Porcentaje de gas gastado. Va en decimal
    public float calcularConsumo(int km, float porcentajeBencina) {

        return km / (this.getEstanque().getCapacidad() * porcentajeBencina);

    }

    // esto se conoce como sobrecarga de métodos. Distinto tipo o cantidad de
    // parámetros.
    // método visible.
    public float calcularConsumo(int km, int porcentajeBencina) {

        return km / (this.getEstanque().getCapacidad() * (porcentajeBencina / 100f));

    }

    // si queremos hacerlo estático tenemos que crear atributos que vamos a
    // necesitar, no podemos usar los de las instancias. Este cálculo sería idéntico
    // para cualquier automóvil de los objetos creados.
    public static float calcularConsumoEstatico(int km, int porcentajeBencina) {

        return km / (Automovil.capacidadEstanqueEstatico * (porcentajeBencina / 100f));

    }

    // sobreescritura de método.
    // principio de polimorfismo.

    @Override
    public boolean equals(Object obj) {

        // comparamos por referencia:
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Automovil)) { // si objeto a comparar no es instancia de automóvil. No es de su tipo:
            return false;

        }

        Automovil a = (Automovil) obj; // casteamos
        return (this.fabricante != null && this.modelo != null && this.fabricante.equalsIgnoreCase(a.getFabricante())
                && this.modelo.equalsIgnoreCase(a.getModelo()));
    }

    @Override
    public String toString() {
        return "Automovil [capacidadEstanque=" + estanque.getCapacidad() + ", cilidranda=" + motor.getCilindrada()
                + ", color=" + color + ", fabricante=" + fabricante + ", id=" + id + ", modelo=" + modelo + "]";
    }

    @Override
    public int compareTo(Automovil a) {

        /* Automovil a = (Automovil) o; Esto era para hacer el cast sin el generic */

        /* return this.modelo.compareTo(a.modelo); */
        return this.conductor.toString().compareTo(a.conductor.toString());
    }

}
