/* Jaime Alejandro Posadas Adame - A00821432 - IFI
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jposadasa.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Jaime Jr
 */
public class SPPJPosadasAT01P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner kb = new Scanner (System.in);
        double x1, x2, y1, y2, d;
        
        System.out.println("Bienvenido a la calculadora de distancias");
        System.out.println("Porfavor introduzca las coordenadas del Punto 1");
        x1=kb.nextDouble();
        y1=kb.nextDouble();
        System.out.println("Porfavor introduzca las coordenadas del Punto 2");
        x2=kb.nextDouble();
        y2=kb.nextDouble();
        d = Math.sqrt((Math.pow (x1-x2,2))+(Math.pow(y1-y2,2)));
        System.out.println("Distancia entre puntos: "+ d);
    }
}
