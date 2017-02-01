

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aalva456
 */

public class Pyramid {
    //instance variables
    private int lenght;
    private int height;
    private double volume;
    
    //construstor
    public Pyramid(int lenghtP, int heightP)
    {
        lenght = lenghtP;
        height = heightP;
    }

    //get the side lenght 
    public int getLenght()
    {
        return lenght;
    }
    
    //get the height 
    public int getHeight()
    {
        return height;
    }
    
    //resize the Pyramid dimensions 
    public void resize(int lenghtR, int heightR)
    {
        lenght = lenghtR;
        height = heightR;
    }  
          
    //get the volume 
    public double getVolume()
    {
        volume = (1/3.0)*(lenght*lenght)*height;
                return volume;
        
    }
}
