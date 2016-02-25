
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 2, 0, Direction.EAST);

        new Wall(Kitchener, 2, 0, Direction.SOUTH);
        new Wall(Kitchener, 2, 0, Direction.EAST);
        new Wall(Kitchener, 2, 1, Direction.SOUTH);
        new Wall(Kitchener, 2, 1, Direction.EAST);
        new Wall(Kitchener, 2, 2, Direction.SOUTH);
        new Wall(Kitchener, 2, 3, Direction.SOUTH);
        new Wall(Kitchener, 2, 4, Direction.SOUTH);
        new Wall(Kitchener, 2, 4, Direction.EAST);
        new Wall(Kitchener, 2, 5, Direction.SOUTH);
        new Wall(Kitchener, 2, 6, Direction.SOUTH);
        new Wall(Kitchener, 2, 7, Direction.SOUTH);
        new Wall(Kitchener, 2, 7, Direction.EAST);
        new Wall(Kitchener, 2, 8, Direction.SOUTH);
        new Wall(Kitchener, 2, 9, Direction.SOUTH);

        new Thing(Kitchener, 2, 9);
        
        denis.setLabel("D");

        while (!denis.canPickThing()) {

            if (!denis.frontIsClear()) {
                denis.turnLeft();
                denis.move();
                denis.turnLeft();
                denis.turnLeft();
                denis.turnLeft();
                denis.move();
                denis.turnLeft();
                denis.turnLeft();
                denis.turnLeft();
                denis.move();
                denis.turnLeft();
            }
            if (denis.frontIsClear()) {
                denis.move();
            }
        }
    }
}
