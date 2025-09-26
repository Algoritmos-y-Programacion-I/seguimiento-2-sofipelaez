package ui;

import java.util.Scanner;
import model.BancoIcesiController;
import model.Cliente;
import model.Cuenta;
import model.TipoCuenta;


public class BancoIcesiUI {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para conectar esta clase con el modelo.
     */
    private BancoIcesiController controller;
    private Scanner input;

    public static void main(String[] args) {

        BancoIcesiUI ui = new BancoIcesiUI();
        ui.menu();

    }

    // Constructor
    public BancoIcesiUI() {
        input = new Scanner(System.in);
        controller = null; //inicializa al pedir la cantidad de personas.
    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void menu() {

        System.out.println("Bienvenido a BancoIcesi");
        System.out.println("Ingrese la cantidad de personas que se manejarán en el sistema: ");
        int cantida = input.nextInt();
        input. nextLine();

        controller = new BancoIcesiController(cantidad);

        int option = 0;
        do {
            System.out.println("\nMenu Principal");
            System.out.println("-".repeat(50));
            System.out.println("Digite alguna de las siguientes opciones");
            System.out.println("1) Registrar cliente");
            System.out.println("2) Asignar cuenta bancaria a cliente");
            System.out.println("3) Depositar dinero en cuenta bancaria de un cliente");
            System.out.println("4) Retirar dinero de una cuenta bancaria de un cliente");
            System.out.println("5) Consultar cliente por numero de cedula");
            System.out.println("6) Consultar el saldo total de todas las cuentas");
            System.out.println("0) Salir del sistema");
            System.out.print("Seleccione una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    asignarCuentaBancariaCliente();
                    break;
                case 3:
                    depositarDineroCuenta();
                    break;
                case 4:
                    retirarDineroCuenta();
                    break;
                case 5:
                    consultarCliente();
                    break;
                case 6:
                    consultarSaldoTotal();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void registrarCliente() {
        System.out.print("Nombre Completo: ");
        String nombre = input.nextLine();
        System.out.print("Edad: ");
        int edad = input.nextInt();
        input. nextLine();
        System.out.print("Cédula: ");
        String cedula = input.nextLine();

        boolean ok = controller.registrarCliente(nombre, edad, cedula);
        if (ok) System.out.println("Cliente registrado con éxito. ");
        else System.out.println("No se pudo registrar el cliente. ");

    }

    public void asignarCuentaBancariaCliente() {
        System.out.print("Cédula del cliente: ");
        String cedula = input.nextLine();
        System.out.print("Nombre del banco: ");
        String banco = input.nextLine();
        System.out.print("Tipo de cuenta (Ahorros/Corriente): ");
        String tipoStr = input.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();
        input.nextLine();


        package ui;

import java.util.Scanner;
import model.BancoIcesiController;
import model.Cliente;
import model.Cuenta;
import model.TipoCuenta;

/**
 * Clase que maneja la interfaz de usuario del sistema BancoIcesi.
 * Se encarga de la interacción con el usuario.
 */
public class BancoIcesiUI {

    // Atributos
    private BancoIcesiController controller;
    private Scanner input;

    public static void main(String[] args) {
        BancoIcesiUI ui = new BancoIcesiUI();
        ui.menu();
    }

    public BancoIcesiUI() {
        input = new Scanner(System.in);
        controller = null;
    }

    public void menu() {
        System.out.println("Bienvenido a BancoIcesi");
        System.out.print("Ingrese la cantidad de personas que se manejarán en el sistema: ");
        int cantidad = input.nextInt();
        input.nextLine();

        controller = new BancoIcesiController(cantidad);

        int option;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("-".repeat(50));
            System.out.println("1. Registrar cliente");
            System.out.println("2. Asignar cuenta a cliente");
            System.out.println("3. Depositar dinero en cuenta");
            System.out.println("4. Retirar dinero de cuenta");
            System.out.println("5. Consultar cliente por cédula");
            System.out.println("6. Consultar saldo total de todas las cuentas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            option = input.nextInt();
            input.nextLine();

            switch(option) {
                case 1: registrarCliente(); break;
                case 2: asignarCuentaBancariaCliente(); break;
                case 3: depositarDineroCuenta(); break;
                case 4: retirarDineroCuenta(); break;
                case 5: consultarCliente(); break;
                case 6: consultarSaldoTotal(); break;
                case 0: System.out.println("Saliendo del sistema..."); break;
                default: System.out.println("Opción inválida"); break;
            }

        } while(option != 0);
    }

    // ========== Métodos ==========

    public void registrarCliente() {
        System.out.print("Nombre Completo: ");
        String nombre = input.nextLine();
        System.out.print("Edad: ");
        int edad = input.nextInt();
        input.nextLine();
        System.out.print("Cédula: ");
        String cedula = input.nextLine();

        boolean ok = controller.registrarCliente(nombre, edad, cedula);
        if (ok) System.out.println("Cliente registrado con éxito.");
        else System.out.println("No se pudo registrar el cliente.");
    }

    public void asignarCuentaBancariaCliente() {
        System.out.print("Cédula del cliente: ");
        String cedula = input.nextLine();
        System.out.print("Nombre del banco: ");
        String banco = input.nextLine();
        System.out.print("Tipo de cuenta (AHORROS/CORRIENTE): ");
        String tipoStr = input.nextLine();
        System.out.print("Saldo inicial: ");
        double saldo = input.nextDouble();
        input.nextLine();

        TipoCuenta tipo = TipoCuenta.valueOf(tipoStr);

        boolean ok = controller.agregarCuentaCliente(cedula, banco, tipo, saldo);
        if (ok) System.out.println("Cliente registrado con éxito. ");
        else System.out.println("No se pudo registrar el cliente. ");

    }

    public void depositarDineroCuenta() {
        System.out.print("Cédula del cliente: ");
        String cedula = input.nextLine();
        System.out.print("Banco de la cuenta: ");
        String banco = input.nextLine();
        System.out.print("Monto a depositar: ");
        double monto = input.nextDouble();
        input.nextLine();

        boolean ok = controller.depositarDineroCuenta(cedula, banco, monto);

        if (ok) System.out.println("Depósito realizado.");
        else System.out.println("No se pudo realizar el depósito.");
    }

    }

    public void retirarDineroCuenta() {
        System.out.print("Cédula del cliente: ");
        String cedula = input.nextLine();
        System.out.print("Banco de la cuenta: ");
        String banco = input.nextLine();
        System.out.print("Monto a retirar: ");
        double monto = input.nextDouble();
        input.nextLine();
        
        boolean ok = controller.retirarDineroCuenta(cedula, banco, monto);
        if (ok) System.out.println("Retiro realizado.");
        else System.out.println("No se pudo realizar el retiro.");

    }

    public void consultarCliente() {

    }

    public void consultarSaldoTotal() {

    }

}
