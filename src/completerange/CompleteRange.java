/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package completerange;

/**
 *
 * @author CarlosPC
 */
public class CompleteRange {

    /**
     * @param args the command line arguments
     * 
     */
    public int[] build(int[] entrada){
        int max = 0;
        int tam = entrada.length;
        for(int i = 0; i<tam; i++){
            int num = entrada[i];
            if(num>max){
                max = num;
            }
        }
        int[] rpta = new int[max];
        //System.out.print("[");
        for(int j = 0;j<max;j++){
            rpta[j] = j+1;
           // System.out.print(rpta[j]+",");
        }
       // System.out.print("]");
        return rpta;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        CompleteRange myComplete = new CompleteRange();
        int [] rangoEntrada = new int[]{58, 60, 55};
        int [] rangoRpta;
        rangoRpta = myComplete.build(rangoEntrada);
        System.out.print("[");
        for(int j = 0;j<rangoRpta.length;j++){
            rangoRpta[j] = j+1;
            System.out.print(rangoRpta[j]+",");
        }
        System.out.print("]");
    }
}
