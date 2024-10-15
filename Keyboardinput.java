import java.util.Scanner; 
public class Keyboardinput {  
    public static void main(String[] args){
    Scanner input = new Scanner(System.in); 
    int currentnumber = 0; 
    while (currentnumber != -1) { 
        System.out.print("Enter positive number or type -1 to cancel: "); 
        currentnumber = input.nextInt(); 

        int sum = 0;
        int total = 0; 
        if (currentnumber != -1) { 
            total = total + 1; 
            sum = sum + currentnumber;  

            int greater = 0; 

            if (currentnumber >= 100){ 
                greater = greater + 1;  

                if (total >0){ 
                    double average = (double) sum / total; 
                    System.out.println("Total numbers entered " + total); 
                    System.out.println("Number greater or equal to 100: " +greater); 
                    System.out.println("The sum is: " + sum); 
                    System.out.println("The average is: "+ average); 
                }
                    else {
                        System.out.println("You didn't enter a number"); 
                    } 
                    input.close();
                }

            }

            }
        }
    }

