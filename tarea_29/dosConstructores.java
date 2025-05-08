/*
* Alumno: Federico B. Soria
*/

import java.util.ArrayList;
import java.util.Scanner;

public class dosConstructores {
    public static class CuentaCliente{
        private String cliente;
        private double cantidad;

        //Constructor que inicializa cliente y cantidad
        public CuentaCliente(String cliente, double cantidad) {
            this.cliente = cliente;
            this.cantidad = cantidad;
        }

        //Constructor que inicializa cliente y establece cantidad en 0
        public CuentaCliente(String cliente){
            this.cliente = cliente;
            this.cantidad = 0;
        }

        //Método para ingresar cantidad
        public void ingresar(double cantidad){
            if (cantidad > 0){
                this.cantidad += cantidad;
            }
        }

        //Método para retirar cantidad
        public void retirar (double cantidad){
            if (cantidad > 0 && this.cantidad >= cantidad){
                this.cantidad -= cantidad;
            }
        }

        //Metodos para obtener la info del cliente y cantidad
        public String getCliente(){
            return cliente;
        }

        public double getCantidad(){
            return cantidad;
        }
    }
    
    public static class Sucursal {
        private ArrayList<CuentaCliente> cuentas;
    
        //constructor que inicializa la sucursal con 3 clientes
        public Sucursal(CuentaCliente cliente1, CuentaCliente cliente2, CuentaCliente cliente3){
            cuentas = new ArrayList<>();
            cuentas.add(cliente1);
            cuentas.add(cliente2);
            cuentas.add(cliente3);
        }

        //metodo para operar con las cuentas
        public void operar(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce el nombre del cliente: ");
            String nombreCliente = scanner.nextLine();
            obtenerCliente(nombreCliente);
        }

        //Método para obtener un cliente y mostrar el menu si existe
        private void obtenerCliente(String nombreCliente){
            for (CuentaCliente cuenta : cuentas){
                if (cuenta.getCliente().equals(nombreCliente)) {
                    menu(cuenta);
                    return;
                }
            }
            System.out.println("Cliente no encontrado.");
        }
    
        //Metodo para mostrar el menu y realizar operaciones
        private void menu(CuentaCliente cuenta){
            Scanner scanner = new Scanner(System.in);
            int opcion;
            do {      
                System.out.println("1. Ingresar");
                System.out.println("2. Extraer");
                System.out.println("3. Mostrar Saldo");
                System.out.println("4. Salir");
                System.out.print("Elige una opción(solo numero): ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        ingresar(cuenta);
                        break;
                    case 2:
                        extraer(cuenta);
                        break;
                    case 3:
                        mostrarSaldo(cuenta);
                    case 4:
                        System.out.println("Saliendo");
                    default:
                        System.out.println("Opcion invalida");
                }
            } while (opcion != 4);
        }

        //Metodo para ingresar dinero en la cuenta
        private void ingresar(CuentaCliente cuenta){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la cantidad a ingresar: ");
            double cantidad = scanner.nextDouble();
            cuenta.ingresar(cantidad);
            System.out.println("Cantidad ingresada correctamente");
        }
    
    
        // Método para extraer dinero de la cuenta
        private void extraer(CuentaCliente cuenta) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce la cantidad a extraer: ");
            double cantidad = scanner.nextDouble();
            cuenta.retirar(cantidad);
            System.out.println("Cantidad extraída correctamente.");
        }
        
        // Método para mostrar el saldo de la cuenta
        private void mostrarSaldo(CuentaCliente cuenta) {
        System.out.println("Saldo actual: " + cuenta.getCantidad());
        }    
    }
    public static void main(String[] args) {
        // Crear tres cuentas de clientes
        CuentaCliente cliente1 = new CuentaCliente("Juan", 1000);
        CuentaCliente cliente2 = new CuentaCliente("Ana", 2000);
        CuentaCliente cliente3 = new CuentaCliente("Pedro");
        // Crear una sucursal con los tres clientes
        Sucursal sucursal = new Sucursal(cliente1, cliente2, cliente3);
        // Operar con la sucursal
        sucursal.operar();
    }
}