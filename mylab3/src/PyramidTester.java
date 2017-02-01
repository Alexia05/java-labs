/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author aalva456
 */
public class PyramidTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pyramid myPyramid = new Pyramid(35,45);
        
           int lenght = myPyramid.getLenght();
           int height = myPyramid.getHeight();
           
                      
                System.out.println("The lenght side of my Pyramid is " 
                + lenght + " and the height is " + height);
                
                
          myPyramid.resize(15,25);
          
          lenght = myPyramid.getLenght();
          height = myPyramid.getHeight();
           
                  System.out.println("\nThe lenght side of my Pyramid is " 
                + lenght + " and the height is " + height); 
                  
                  
                  System.out.println("\nThe volume is " + myPyramid.getVolume());
    }
    
}
