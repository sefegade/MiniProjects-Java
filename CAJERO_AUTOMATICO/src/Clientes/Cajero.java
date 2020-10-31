package Clientes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Cajero {

    static Scanner sc = new Scanner(System.in);
    private static List<Clientes> clientes = new ArrayList<>();
    static Clientes cliente;

    public static void registrarCliente(){
        System.out.println("introdusca la cedula");
        int cedula = sc.nextInt();
        System.out.println("introdusca el nombre");
        String nombre = sc.next();
        System.out.println("Introduzca el saldo");
        Double saldo = sc.nextDouble();
        cliente = new Clientes();
        cliente.setCedula(cedula);
        cliente.setNombre(nombre);
        cliente.setSaldo(saldo);
        clientes.add(cliente);
    }

    public static void realizarConsignacion(){
        System.out.println("Ingrese la cedula");
        int cedula = sc.nextInt();
        for (Clientes cliente : clientes) {
            if(cliente.getCedula() == cedula){
                System.out.println("Ingrese la consignación");
                Double saldo = sc.nextDouble();
                cliente.setSaldo(cliente.getSaldo() + saldo); 
            }
            else System.out.println("No se encuentra la cedula");
        }
    }

    public static void tranferenciaSaldo(){
        System.out.println("Ingrese la cedula");
        int cedula1 = sc.nextInt();
        System.out.println("Ingrese la cedula a transferir");
        int cedula2 = sc.nextInt();
        Clientes cliente1= null,cliente2 = null;
        for (Clientes cliente : clientes) {
            if(cliente.getCedula() == cedula1){
                System.out.println("Saldo"+ cliente.getSaldo());
                cliente1 = cliente;
            }
            if(cliente.getCedula()==cedula2){
                System.out.println("Saldo"+ cliente.getSaldo());
                cliente2 = cliente;
            }
            if(cliente1 !=null && cliente2 !=null){
                System.out.print("Ingrese el monto a transferir:");
                Double transferencia = sc.nextDouble();
                cliente2.setSaldo(cliente2.getSaldo()+transferencia);
                cliente1.setSaldo(cliente1.getSaldo()-transferencia);
                break;
            }
        }
        
    }

    public static void mostrarSaldoCliente(){
        System.out.println("Ingrese la cedula");
        int cedula = sc.nextInt();
        for (Clientes cliente : clientes) {
            if(cliente.getCedula() == cedula) System.out.println("El saldo del cliente es: " + cliente.getSaldo());
            else System.out.println("No se encuentra la cedula");
        }
    }

    public static void eliminarCliente(){
        System.out.println("Ingrese la cedula");
        int cedula = sc.nextInt();
        Iterator<Clientes> clienteIterator = clientes.iterator();
        while(clienteIterator.hasNext()) {     
            Clientes cliente = clienteIterator.next();
            if (cliente.getCedula()==cedula) {
                clienteIterator.remove();
            } 
        }
    }

    public static void mostrarClientes(){
        for (Clientes cliente : clientes) System.out.println(cliente);
    }

}