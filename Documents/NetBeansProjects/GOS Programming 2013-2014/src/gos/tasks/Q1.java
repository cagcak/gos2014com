/*
 * "Constructors and Methods Overloading.
 Task: Write an application in JAVA with constructors and methods overloading."
 */

package gos.tasks;

/**
 *
 * @author Çağrı Çakır
 */
public class Q1 {
    
    public void findVolume ( int s) {
      System.out.println ( "Volume of cube is "+ ( s * s * s ) );
   }

   public void findVolume ( int r, int h ) {
    System.out.println ( "Volume of cylinder is "+ ( 3.14 * r * r * h) );
   }

   public void findVolume ( int l, int b, int h) {
      System.out.println ("Volume of cuboid is " + ( l * b * h ) );
   }
    
}
