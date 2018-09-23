import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {
    
    public static void thorMove(Scanner in, int lightX,int lightY,int initialTX,int initialTY){
          // game loop
        while (!(lightX == initialTX && lightY == initialTY)) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            if(initialTX > lightX && initialTY > lightY){
                System.out.println("NW");initialTX--;initialTY--;
            }
            else if(initialTX < lightX && initialTY < lightY){
                System.out.println("SE");initialTX++;initialTY++;
            }
            else if(initialTX > lightX && initialTY < lightY){
                System.out.println("SW");initialTX--;initialTY++;
            }
            else if(initialTX < lightX && initialTY > lightY){
                System.out.println("NE");initialTX++;initialTY--;
            }
            else if(initialTX < lightX && initialTY == lightY){
                System.out.println("E");initialTX++;
            }
            else if(initialTX > lightX && initialTY == lightY){
                System.out.println("W");initialTX--;
            }
            else if(initialTX == lightX && initialTY < lightY){
                System.out.println("S");initialTY++;
            }
            else if(initialTX == lightX && initialTY > lightY){
                System.out.println("N");initialTY--;
            }
            // Leave the loop if Thor as no more turns.
            if(remainingTurns==0) break;
        }
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position
        
        thorMove(in,lightX,lightY,initialTX,initialTY);
      
    }
}
