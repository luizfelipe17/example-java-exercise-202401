/*Você foi contratado(a) pela empresa Paiva Ltda para apoiar no desenvolvimento
de uma solução em Java.
Para isso você medirá a temperatura da água de determinada região geográfica.
Você deve criar um algoritmo que faça a leitura de 12 temperaturas em um dia.
Cada temperatura deve ser maior ou igual a 4º C (graus Celsius)
e menor ou igual a 10º C.
O algoritmo deve calcular e imprimir a média das temperaturas aferidas naquele dia.
Valide as entradas das temperaturas - se uma temperatura lida não estiver no intervalo
entre 4 e 10, então deverá solicitar a entrada novamente.
A idéia é garantir que somente temperaturas válidas façam parte do cálculo da média.*/

package com.mycompany.psc.listaexemplo;
import java.util.Scanner;
        
public class Questao01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        
        double somaTemperaturas = 0, temperaturas, mediaTemperatura; 
        int contador = 1;
        
        System.out.print("Temperatura Água!\n\n");
        
        while (contador <= 12){
            
        System.out.print("Infome a temperatura "+contador+" (entre 4º e 10ºC): ");
            temperaturas = ler.nextDouble();
            
           if (temperaturas >= 4 && temperaturas <= 10){
               
               somaTemperaturas += temperaturas;
               contador ++;
               
           }else{
               
               System.out.print("Temperatura inválida. Por favor, digite um valor válido\n");
               
           }
        }
        
           mediaTemperatura = somaTemperaturas / 12;
           
           System.out.printf("\nA média de hoje das temperaturas é: %.1f",mediaTemperatura);
           System.out.print("ºC"); 
 
    }
}
