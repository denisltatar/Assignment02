
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 2, 1, Direction.NORTH);

        new Wall(Kitchener, 1, 1, Direction.NORTH);
        new Wall(Kitchener, 1, 1, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.SOUTH);
        new Wall(Kitchener, 1, 1, Direction.WEST);
        new Wall(Kitchener, 1, 4, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.EAST);
        new Wall(Kitchener, 1, 4, Direction.SOUTH);
        new Wall(Kitchener, 1, 4, Direction.WEST);
        new Wall(Kitchener, 4, 1, Direction.NORTH);
        new Wall(Kitchener, 4, 1, Direction.EAST);
        new Wall(Kitchener, 4, 1, Direction.SOUTH);
        new Wall(Kitchener, 4, 1, Direction.WEST);
        new Wall(Kitchener, 4, 4, Direction.NORTH);
        new Wall(Kitchener, 4, 4, Direction.EAST);
        new Wall(Kitchener, 4, 4, Direction.SOUTH);
        new Wall(Kitchener, 4, 4, Direction.WEST);
        new Wall(Kitchener, 2, 2, Direction.NORTH);
        new Wall(Kitchener, 2, 2, Direction.WEST);
        new Wall(Kitchener, 2, 3, Direction.NORTH);
        new Wall(Kitchener, 2, 3, Direction.EAST);
        new Wall(Kitchener, 3, 2, Direction.WEST);
        new Wall(Kitchener, 3, 2, Direction.SOUTH);
        new Wall(Kitchener, 3, 3, Direction.EAST);
        new Wall(Kitchener, 3, 3, Direction.SOUTH);

        denis.setLabel("D");

        while (true) {
            denis.turnLeft();
            denis.move();
            denis.turnLeft();
            denis.turnLeft();
            denis.turnLeft();
            denis.move();
            denis.move();
            denis.turnLeft();
            denis.turnLeft();
            denis.turnLeft();
            denis.move();
            denis.move();
            denis.turnLeft();
            denis.turnLeft();
            denis.turnLeft();
            denis.move();
            denis.turnLeft();
            denis.move();
        }
    }
}