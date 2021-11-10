/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datosmeteorologicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



public class DatosMeteorologicos {

    //La base de datos
    public static ArrayList <Datos> ArrayDatos = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
   final int puerto = 3030;
        rellenarBBDD();
        
        try {
            ServerSocket socket = new ServerSocket(puerto);
            System.out.println("Servidor listo...");
            
            while (true) {                
                Socket socketCliente = socket.accept();
                atender(socketCliente);
                socketCliente.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(DatosMeteorologicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static void atender(Socket socketCliente) {
        try {
            // obtener los flujos de entrada y salida sobre caracteres.
            BufferedReader br = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
            PrintWriter    pw = new PrintWriter(socketCliente.getOutputStream());
            
            String nombre;
            do {                
                nombre = br.readLine();

                // busco temperatura maxima en la base de datos....
                Datos buscados = null;
                for (Datos d : ArrayDatos) {
                    if(d.temp_max.
                    if (p.temp_max.equals(temp_max)) {
                        buscada = p;
                    }
                }

                // Devuelvo la información
                if (buscados != null) {
                    pw.println(buscados.temp_max);
                } else {
                    pw.println("No se encuentra en la BBDD");
                }
                pw.flush();

            } while (!temp_max.equals("fin"));
            
        } catch (IOException ex) {
            Logger.getLogger(DatosMeteorologicos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    private static void rellenarBBDD() {
      /*  listin.add(new Persona("Pedro",   "1321321"));
        listin.add(new Persona("Ana",     "2321321"));
        listin.add(new Persona("Juan",    "3321321"));
        listin.add(new Persona("Luis",    "4321321"));
        listin.add(new Persona("Antonio", "5321321"));
        listin.add(new Persona("Luisa",   "6321321"));*/
    }

    
}

