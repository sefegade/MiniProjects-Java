import java.util.Scanner;

import Clientes.Cajero;

public class App {
    public static void main(String[] args) throws Exception {
        int num;
        Scanner sc =new Scanner(System.in);
        do{
            System.out.println("Ingrese la opcion que desea realizar:\n1.Registrar cliente\n2.Realizar Consignación\n3.Transferencia de saldo\n4. Mostrar saldo de un cliente\n5. Mostrar clientes\n6. Eliminar Cliente\n0.salir");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    Cajero.registrarCliente();
                    break;
                case 2:
                    Cajero.realizarConsignacion();
                    break;
                case 3:
                    Cajero.tranferenciaSaldo();
                    break;
                case 4:
                    Cajero.mostrarSaldoCliente();
                    break;
                case 5:
                    Cajero.mostrarClientes();
                    break;
                case 6:
                    Cajero.eliminarCliente();
                    break;
                case 0:
                    System.out.println("Gracias...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }while(num!=0);
        sc.close();
    }
}
