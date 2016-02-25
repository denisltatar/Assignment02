
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 5, 5, Direction.EAST);
        
        while(denis.getDirection()!= Direction.WEST){
            denis.turnLeft();
        }
        while(denis.getAvenue()!=0){
            denis.move();
        }
        while(denis.getDirection()!= Direction.NORTH){
            denis.turnLeft();
            denis.turnLeft();
            denis.turnLeft();
        }
        while(denis.getStreet()!=0){
            denis.move();
        }
    }
}
