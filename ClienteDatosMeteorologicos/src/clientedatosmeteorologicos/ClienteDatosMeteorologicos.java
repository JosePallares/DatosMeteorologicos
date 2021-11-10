/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientedatosmeteorologicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author josepallaresescobar
 */
public class ClienteDatosMeteorologicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     final int puertoServidor = 3030;
        final String servidor = "localhost";
        try {
            Socket socket = new Socket(servidor, puertoServidor);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter    pw = new PrintWriter(socket.getOutputStream());
            
            Scanner teclado = new Scanner(System.in);
            double temp_max;
            do {                
                System.out.print("Introduzca el nombre que quiere busacar: ");
                temp_max = teclado.nextLine();

                // Envio el nombre que estoy buscando.
                pw.println(temp_max);
                pw.flush();

                // Espero a que me envíen el teléfono.
                String teléfono = br.readLine();
                System.out.println(teléfono);
            } while (!temp_max.equals("fin"));
            
        } catch (IOException ex) {
            System.out.println("No se ha podido conectar con el servidor...");
        }
    }
    
}

