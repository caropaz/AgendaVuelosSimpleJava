import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int destino=0, turno=0, cantidad=0, ingresar=1, salir=0, opcion;
        Vuelo vuelos = new Vuelo();
        Registro registros = new Registro();
        Scanner teclado = new Scanner(System.in);

        // SALUDO INICIAL
        System.out.println("Bienvenido/a al Registro de Vuelos, por favor ingrese 1 para registrar o ingrese 0 para salir");
        opcion= teclado.nextInt();
        while (opcion!=ingresar && opcion != salir){
            System.out.println(" la opcion ingresada es incorrecta, por favor ingrese 1 para iniciar el proceso de registro o ingrese 0 para salir");
            opcion = teclado.nextInt();
        }

        // EJECUCION DE PROGRAMA
        do {
            registros.solicitarDestino();
            destino = teclado.nextInt();

            // VALIDACION DE DESTINO
            while(destino>6 || destino <1) {
                registros.ingresarDestino(destino);
                System.out.println("El numero ingresado es incorrecto, por favor ingrese un numero del 1 al 6");
                destino = teclado.nextInt();
            }


            registros.solicitarTurno();
            turno = teclado.nextInt();

            // VALIDACION DEL TURNO
            while(turno>3 || turno <1) {
            registros.ingresarTurno(turno);
                System.out.println("El numero ingresado es incorrecto, por favor ingrese un numero del 1 al 3");
                turno = teclado.nextInt();
            }


            registros.solicitarCantidad();
            cantidad = teclado.nextInt();

            // VALIDACION DE CANTIDAD DE ASIENTOS
            while(cantidad>30 || cantidad <1) {
            registros.ingresarCantidad(cantidad);
            System.out.println("El numero ingresado es incorrecto, el TOPE MAXIMO es de 30 asientos, por favor ingrese nuevamente"
                    );
                cantidad = teclado.nextInt();
            }

            // RESERVA DE ASIENTOS
            vuelos.solicitarAsientos(destino, turno, cantidad);

            //CONSULTA SI CONTINUA O SALE
            System.out.println("Por favor, ingrese 1 para continuar registrando o ingrese 0 para salir.");
            opcion= teclado.nextInt();
            while (opcion!=ingresar && opcion != salir){
                System.out.println(" la opcion ingresada es incorrecta, por favor ingrese 1 para iniciar el proceso de registro o ingrese 0 para salir");
                opcion = teclado.nextInt();
            }
            // SALUDO DE DESPEDIDA
            if (opcion== salir){
                System.out.println("¡Hasta pronto!");
            }
        } while(opcion==ingresar);

    }
}