package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author Vivek (ST10258124)
 */
public class Bird extends Animal{
    private int colour;
    private String[] colours = {"grey", "white", "black"};

    public int getColour() {
        return colour; 
    }
    
    public Bird(int col){
        colour = col;
    }
    
    @Override
    public String Output(){
        return ("Animal: Bird" +
                      "\nIDtag: " + super.getIDtag() +
                      "\nSpecies: " + super.getSpecies() +
                      "\nColour of feathers: " + colours[colour - 1]);
    }
    
    @Override
   public void Input(){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the species of Bird: ");
       super.setSpecies(input.nextLine());
       System.out.print("Enter the IDtag of bird: ");
       super.setIDtag(input.nextInt());
   }
    
}
