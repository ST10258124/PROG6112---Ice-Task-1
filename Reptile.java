package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author Vivek (ST10258124)
 */
public class Reptile extends Animal{
    private double bloodTemp;

    public double getBloodTemp() {
        return bloodTemp;
    }
    
    public Reptile(double blood_temp){
        bloodTemp = blood_temp;
    }
    
    @Override
    public String Output(){
        return ("Animal: Reptile" +
                      "\nIDtag: " + super.getIDtag() +
                      "\nSpecies: " + super.getSpecies() +
                      "\nTemperature of blood: " + bloodTemp);
    }
    
    @Override
    public void Input(){
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter the species of reptile: ");
       super.setSpecies(input.nextLine());
       System.out.print("Enter the IDtag of reptile: ");
       super.setIDtag(input.nextInt());
   }
}
