
public class Vuelo {


    private final int DESTINOS = 6;
    private final int TURNOS = 3;
    private final int ASIENTOS_TOTALES=30;
    private Turno turno;
    private Destino destino;

    private int vuelos[][];


    public Vuelo(){
        vuelos = new int [DESTINOS][TURNOS];
        cargarAsientosDisponibles();
    }

    private void cargarAsientosDisponibles(){
        for (int f=0; f<DESTINOS; f++){
            for(int c=0; c<TURNOS; c++){
                vuelos[f][c] = ASIENTOS_TOTALES;
            }
        }
    }

    public void solicitarAsientos(int destino, int turno, int cantidad) {
        if (verificarAsientosDisponibles(destino, turno, cantidad)) {
            ocuparAsiento(destino, turno, cantidad);
            obtenerDestino(destino);
            obtenerTurno(turno);
            System.out.println("Proceso EXITOSO de: La cantidad de asientos: " + cantidad + " hacia el destino " + this.destino.name() + " del turno " + this.turno.name()
            );
        } else {
            destino-=1;
            turno-=1;
            System.out.println("Lo siento, la cantidad ingresada es mayor a la cantidad de asientos disponible, solo tenemos la cantidad de: " + vuelos[destino][turno] );
        }

    }

    private Turno obtenerTurno(int turno){
        switch (turno){
            case 1:
                this.turno = Turno.Mañana;
                break;
            case 2:
                this.turno = Turno.Tarde;
                break;
            case 3:
                this.turno = Turno.Noche;
        }
        return this.turno;
    }
    private Destino obtenerDestino(int destino){

        switch (destino){
            case 1:
                this.destino = Destino.Iguazu;
                break;
            case 2:
                this.destino = Destino.Ushuaia;
                break;
            case 3:
                this.destino = Destino.Roma;
                break;
            case 4:
                this.destino = Destino.Rio_de_Janeiro;
                break;
            case 5:
                this.destino = Destino.New_York;
                break;
            case 6:
                this.destino = Destino.Islas_Maldivas;
                break;
        }
        return this.destino;
    }
    private void ocuparAsiento(int destino, int turno, int cantidad){
        destino -= 1;
        turno -=1;
        vuelos[destino][turno] -= cantidad;
    }

    private boolean verificarAsientosDisponibles(int destino, int turno, int cantidad){
        destino -= 1;
        turno -=1;
        return vuelos[destino][turno]>cantidad;
    }


        public int[][] getVuelos(){
        return this.vuelos;

        }


}
