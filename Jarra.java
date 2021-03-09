public class Jarra {//variables de instancia
    private int cantidad;
    private int capacidad;

    public Jarra(int capacidadInicial) {

        if (capacidadInicial <= 0) {
            throw new RuntimeException("ERROR: no se pueden crear jarras con capacidad menor o igual que cero.");
        }
        this.capacidad = capacidadInicial;
    }
<<<<<<< HEAD

    public void llenaDesde(Jarra j) {
        while ((this.cantidad < this.capacidad) && (j.cantidad > 0)) {
            this.cantidad++;
            j.cantidad--;
        }
    }


        public String toString(){
            return ("("+this.capacidad+","+this.cantidad+")");
        }

    public void llenaDesde(Jarra j){
        while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
            this.cantidad++;
            j.cantidad--;
        }
    }
    public String toString(){
        return ("("+this.capacidad+","+this.cantidad+")");
    }
=======
    //He eliminado desde el navegador la locura que he provocado JAJAJA
}
>>>>>>> a864676f7b64eaba9bb486e445bbde364f4346b5

}
