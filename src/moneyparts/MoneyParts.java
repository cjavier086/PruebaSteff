/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moneyparts;

import java.util.Scanner;

/**
 *
 * @author CarlosPC
 */
public class MoneyParts {

    /**
     * @param args the command line arguments
     */
    
    public void build(int[] cantidad, double[] monedas, double num){
        for(int i = 0; i<monedas.length;i++){
            //cantidad[0]=num;
            cantidad[i]=(int)Math.round(num/monedas[i]);
            while(cantidad[i]>0 && cantidad[i]!=num-1){
                int res=(int)Math.round(num-(monedas[i]*cantidad[i]));
                for(int j = 0;j<monedas.length;j++){
                    if(j>i){
                        cantidad[j]=(int)Math.round(res/monedas[j]);
                        res-=monedas[j]*cantidad[j];
                    }
                    //System.out.println(cantidad[j]+" monedas de "+monedas[j]);
                }
               // System.out.println("----------------------");
                
                double suma = 0;
                for(int k = 0;k<cantidad.length;k++){
                    suma+= cantidad[k]*monedas[k];
                }
                if(Double.compare(suma, num)==0){
                    for(int a = 0;a<cantidad.length;a++){
                        if(cantidad[a]>0){
                            System.out.print("[");
                            for(int b=0;b<cantidad[a];b++){
                                System.out.print(monedas[a]+",");
                            }
                            System.out.println("]");
                        }
                    }
                }
                cantidad[i]--;
                
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        MoneyParts myMoney = new MoneyParts();
        double [] denom = {0.05, 0.1, 0.2, 0.5, 1, 2, 5, 10,20, 50, 100, 200};
        int [] cantidad = {0,0,0,0,0,0,0,0,0,0,0,0};
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un Numero:");
        double num=sc.nextDouble();
        myMoney.build(cantidad, denom, num);
    }
}
