
package uv.poo.generictupla;

import uv.poo.generictupla.GenericTupla.Utilities;

/**
 *
 * @author Maria Paula Betancourt Mota
 */
public class GenericTuplaMain {

    public static void main(String[] args) {
        GenericTupla<Integer, String> point1 = new GenericTupla<>(1,"Carlos");
        GenericTupla<Integer, String> point2 = new GenericTupla<>(2,"Fernando");
        
        boolean isEqual = Utilities.compare(point2, point2);
        
        System.out.println(point1);
        System.out.println(point2);
        System.out.println("Veremos si funciona: "+ isEqual);
        
        
    }
    
}
