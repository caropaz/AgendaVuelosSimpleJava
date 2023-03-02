public class Registro {

    private int destino;
    private int turno;
    private int cantidad;

    public int getDestino() {
        return destino;
    }

    public int getTurno() {
        return turno;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void solicitarDestino(){
        System.out.println("Por favor, ingrese el numero de destino: ");
        System.out.println("Destino nro 1: Iguazu");
        System.out.println("Destino nro 2: Ushuaia");
        System.out.println("Destino nro 3: Roma");
        System.out.println("Destino nro 4: Rio de Janeiro");
        System.out.println("Destino nro 5: New York");
        System.out.println("Destino nro 6: Islas Maldivas");

    }
    public void ingresarDestino(int destino){
                this.destino = destino;
    }



    public void solicitarTurno(){
        System.out.println("Por favor, ingrese el numero de turno");
        System.out.println("Turno nro 1: Mañana");
        System.out.println("Turno nro 2: Tarde");
        System.out.println("Turno nro 3: Noche");

    }
    public void ingresarTurno(int turno){
                    this.turno = turno;
    }

    public void solicitarCantidad(){
        System.out.println("Por favor, ingrese la cantidad de asientos que desea reservar: ");

    }

    public void ingresarCantidad(int cantidad){
        this.cantidad = cantidad;
    }
}
