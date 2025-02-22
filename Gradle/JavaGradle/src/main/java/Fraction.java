import java.io.*;
/**
 * Purpose: demonstrate simple Java Fraction class with command line,
 * jdb debugging, and Ant build file.
 *
 * Ser321 Foundations of Distributed Applications
 * see http://pooh.poly.asu.edu/Ser321
 * @author Tim Lindquist Tim.Lindquist@asu.edu
 *         Software Engineering, CIDSE, IAFSE, ASU Poly
 * @author Grant Beschta
 *         Modified 05/23/2021
 * @version January 2020
 */
public class Fraction {

   private int numerator, denominator;

   public Fraction(){
      numerator = denominator = 0;
   }

   public void print() {
    System.out.print(numerator + "/" + denominator );
   }

   public void setNumerator (int n ){
      numerator = n;
   }

   public void setDenominator (int d) {
      denominator = d;
   }

   public int getDenominator() {
      return denominator;
   }

   public int getNumerator() {
      return numerator;
   }

   public static void main (String args[]) {
      try {
         // create a new instance
         // Fraction *frac = [[Fraction alloc] init];
         Fraction frac = new Fraction();
         if (args.length == 2) {
            int num = 0;
            int denom = 0;
            try {
               frac.setNumerator(Integer.parseInt(args[0]));
               frac.setDenominator(Integer.parseInt(args[1]));
            } catch (Exception e) {
               System.out.println("Arguments: " + args[0] + ", " + args[1] + " must be integers.");
               System.exit(1);
            }
            // print it
            System.out.print("The fraction is: ");
            frac.print();
            System.out.println("");
         } else {
            System.out.println("Exactly 2 arguments should be provided.\n gradle runFrac -Pnum=1 -Pdenom=2");
         }
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}

