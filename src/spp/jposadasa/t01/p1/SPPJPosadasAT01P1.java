/* Jaime Alejandro Posadas Adame - A00821432 - IFI
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.jposadasa.t01.p1;
import java.util.Scanner;
/**
 *
 * @author Jaime Jr
 */
public class SPPJPosadasAT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mat, opEntrada;
        double cal1, cal2, cal3, cal4, cal5, pro;
        String res;
        Scanner kb = new Scanner (System.in);
        
        System.out.println("Bienvenido a la calculadora de Promedios");
        System.out.println("Porfavor introduzca su Matricula");
        mat=kb.nextInt();
        System.out.println("Porfavor introduzca sus calificaciones");
        System.out.println("Calificacion 1");
        cal1=kb.nextDouble();
        System.out.println("Calificacion 2");
        cal2=kb.nextDouble();
        System.out.println("Calificacion 3");
        cal3=kb.nextDouble();
        System.out.println("Calificacion 4");
        cal4=kb.nextDouble();
        System.out.println("Calificacion 5");
        cal5=kb.nextDouble();
        pro=(cal1+cal2+cal3+cal4+cal5)/5;
        System.out.print("Matricula:");
        System.out.println(mat);
        System.out.print("Promedio:");
        System.out.println(pro);
        if (pro>7){
            res="APROBADO";
        }
        else {
            res="REPROBADO";
        }
        System.out.println(res);
    }
}

