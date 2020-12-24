/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasteff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CarlosPC
 */
public class ChangeString {

    /**
     * @param cadena
     * @param args the command line arguments
     * @return 
     */
    public String build (String cadena){
        String rpta="";
        Integer tam = cadena.length();
         for (int i = 0; i<tam;i++){
             char c = cadena.charAt(i);
             if(c>='a' && c<='z' || c>='A' && c<='Z'){
                 c++;
             }
             rpta=rpta+c;
         }
    return rpta;
    }
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
        String entrada = reader.readLine();
        ChangeString myChange = new ChangeString();
        String respuesta = "";
        respuesta = myChange.build(entrada);
        System.out.println("salida: " + respuesta);
    }
    
}
