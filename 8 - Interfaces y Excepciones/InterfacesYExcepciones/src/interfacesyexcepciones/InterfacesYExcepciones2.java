/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfacesyexcepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gonza
 */
public class InterfacesYExcepciones2 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Division Segura:");
        double num, num2;

        System.out.println("\nIngrese dos numeros para dividirlos:\nPrimer numero: ");
        num = scan.nextDouble();

        System.out.println("Segundo numero: ");
        num2 = scan.nextDouble();       
        
        try {
            if (num2 == 0) {
                throw new ArithmeticException("Error. No es posible dividir por 0.");
            }
            double resultado = num / num2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
        
        System.out.println("\nConversion de cadena a numero:");
        System.out.println("\nPorfavor ingrese un texto para convertirlo a Entero(int): ");
        String texto = scan.nextLine();
        
        try {
            int textoAInt = Integer.parseInt(texto);
            System.out.println("Texto convertido a Entero: " + textoAInt);
        } catch (NumberFormatException nfe) {
            System.out.println("Error. El texto que ingreso no es un Entero.");
        }
        
        System.out.println("\nLectura de archivo:");
        System.out.println("\nPorfavor ingrese el nombre del archivo .txt: ");
        String nombre = scan.nextLine();
        
        try {
            File archivo = new File(nombre);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            System.out.println(br.readLine());
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error. Archivo no encontrado.");
        } catch (IOException ioe) {
            System.out.println("Error de E/S");
            System.out.println(ioe.getMessage());
        }
        
        System.out.println("\nExcepcion personalizada:");
        System.out.println("\nIngrese su edad: ");
        int edad = Integer.parseInt(scan.nextLine());
        
        if (edad < 0 || edad > 100) {
            throw new EdadInvalidaException("Error. Edad invalida.");
        } else {
            System.out.println("Edad valida y guardada.");
        }
        
        System.out.println("\nUso de try-with-resources:");
        
        File archivo2 = new File("C:\\Users\\Gonza\\Desktop\\Lectura.txt");
        
        try (BufferedReader br2 = new BufferedReader(new FileReader(archivo2))) {
            System.out.println("\n" +br2.readLine());
        } catch (IOException ioe) {
            System.out.println("Error de E/S: " + ioe.getMessage());
        }
    }
}
