package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author Vivek (ST10258124)
 */
public class Animal {

    public void setIDtag(int IDtag) {
        this.IDtag = IDtag;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
    private  int IDtag;

    public int getIDtag() {
        return IDtag;
    }

    public String getSpecies() {
        return species;
    }
    private String species;
    
    public String Output(){
        return ("Animal: " +
                      "\nIDtag: " + IDtag +
                      "\nSpecies: " + species +
                      "\nAdditional info: ");
    }
    
    public void Input(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter IDtag: ");
        input.nextInt();
        System.out.println("Enter Species: ");
        input.next();
    }
    
}
