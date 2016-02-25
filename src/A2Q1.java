
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 1, 1, Direction.EAST);
        
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 1, 3);
        new Thing(Kitchener, 1, 4);
        new Thing(Kitchener, 1, 5);
        new Thing(Kitchener, 1, 6);
        new Thing(Kitchener, 1, 7);
        new Thing(Kitchener, 1, 8);
        new Thing(Kitchener, 1, 9);
        new Thing(Kitchener, 1, 10);
        new Thing(Kitchener, 1, 11);
    
        while(denis.frontIsClear()){
            denis.move();
            denis.pickThing();
            if(denis.countThingsInBackpack()==7){
            break;
    }        
        }
        denis.move();
        denis.move();
        denis.move();
        denis.move();
    }
}

