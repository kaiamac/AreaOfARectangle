/*
 * Kaia Mac
 * This program shows the area of a rectangle 
 * September 18th, 2018
 */

package area.of.a.rectangle;

/**
 *
 * @author kamac8665
 */
public class AreaOfARectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 4.8;
        double length = 5.7;
        double area = 0.0;
        area = length*width;
        System.out.println("Width = " + width);
        System.out.println("Length = " + length);
        System.out.println("The area of the rectangle is..." + area + "cm squared");
    }
    
}
