public class Jarra {//variables de instancia
    private int cantidad;
    private int capacidad;

    public Jarra(int capacidadInicial) {

        if (capacidadInicial <= 0) {
            throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor o igual que cero.");
        }
        this.capacidad = capacidadInicial;
    }
    //He eliminado desde el navegador la locura que he provocado JAJAJA
}

