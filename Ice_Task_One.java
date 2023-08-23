package ice_task_one;

import java.util.Scanner;

/**
 *
 * @author Vivek (ST10258124)
 */
public class Ice_Task_One {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;
        int birdColour;
        
        do{
            System.out.print("Enter 'Bird', 'Reptile' or 'exit': ");
            choice = input.next();
            
            switch (choice.toLowerCase()){
                case "bird":
                    
                    do{
                        System.out.println("1 = grey, 2 = white, 3 = black\nPlease use the numbers as shown, other values will not be accepted");
                        System.out.print("Enter colour of Bird: ");
                        birdColour = input.nextInt();
                    } while (birdColour < 1 || birdColour > 3);
                    
                    Bird brd = new Bird(birdColour);
                    
                    brd.Input();
                    System.out.println(brd.Output());
                    break;
                    
                case "reptile":
                    System.out.print("Enter the reptile's blood temperature: ");
                    Reptile rept = new Reptile(input.nextDouble());
                    
                    rept.Input();
                    System.out.println(rept.Output());
                    break;
                    
                case "exit":
                    break;
            }
            
        }while (!"exit".equals(choice.toLowerCase()));
    }
    
}