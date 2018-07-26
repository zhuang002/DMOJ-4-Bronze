/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bronze;

import static java.lang.Math.atan;
import static java.lang.Math.cos;
import static java.lang.Math.round;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.toDegrees;
import static java.lang.Math.toRadians;
import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Bronze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double x=0;
        double y=0;
        for (int i=0;i<n;i++) {
            double r=sc.nextDouble();
            double d=sc.nextDouble();
            
            x+=r*cos(toRadians(d));
            y+=r*sin(toRadians(d));
        }
        System.out.printf("%d %d",round(sqrt(x*x+y*y)),round(toDegrees(atan(y/x))));
    }
}
