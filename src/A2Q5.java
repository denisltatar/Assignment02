
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot denis = new Robot(Kw, 0, 2, Direction.SOUTH);
        Robot fineas = new Robot(Kw, 0, 2, Direction.SOUTH);

        new Wall(Kw, 0, 0, Direction.WEST);
        new Wall(Kw, 1, 0, Direction.WEST);
        new Wall(Kw, 2, 0, Direction.WEST);
        new Wall(Kw, 3, 0, Direction.WEST);
        new Wall(Kw, 4, 0, Direction.WEST);
        new Wall(Kw, 5, 0, Direction.WEST);
        new Wall(Kw, 6, 0, Direction.WEST);
        new Wall(Kw, 7, 0, Direction.WEST);
        new Wall(Kw, 8, 0, Direction.WEST);
        new Wall(Kw, 9, 0, Direction.WEST);
        new Wall(Kw, 0, 1, Direction.EAST);
        new Wall(Kw, 1, 1, Direction.EAST);
        new Wall(Kw, 2, 1, Direction.EAST);
        new Wall(Kw, 3, 1, Direction.EAST);
        new Wall(Kw, 4, 1, Direction.EAST);
        new Wall(Kw, 5, 1, Direction.EAST);
        new Wall(Kw, 6, 1, Direction.EAST);
        new Wall(Kw, 7, 1, Direction.EAST);
        new Wall(Kw, 8, 1, Direction.EAST);
        new Wall(Kw, 9, 1, Direction.EAST);

        new Wall(Kw, 0, 2, Direction.EAST);
        new Wall(Kw, 1, 3, Direction.NORTH);
        new Wall(Kw, 1, 4, Direction.NORTH);
        new Wall(Kw, 1, 5, Direction.NORTH);
        new Wall(Kw, 1, 6, Direction.NORTH);
        new Wall(Kw, 1, 6, Direction.EAST);
        new Wall(Kw, 2, 6, Direction.EAST);
        new Wall(Kw, 2, 6, Direction.SOUTH);
        new Wall(Kw, 2, 5, Direction.SOUTH);
        new Wall(Kw, 2, 4, Direction.SOUTH);
        new Wall(Kw, 2, 3, Direction.SOUTH);
        new Wall(Kw, 5, 1, Direction.EAST);
        new Wall(Kw, 4, 3, Direction.NORTH);
        new Wall(Kw, 4, 3, Direction.SOUTH);
        new Wall(Kw, 4, 4, Direction.NORTH);
        new Wall(Kw, 4, 4, Direction.SOUTH);
        new Wall(Kw, 3, 2, Direction.EAST);
        new Wall(Kw, 4, 5, Direction.NORTH);
        new Wall(Kw, 4, 5, Direction.SOUTH);
        new Wall(Kw, 4, 5, Direction.EAST);
        new Wall(Kw, 5, 2, Direction.EAST);
        new Wall(Kw, 6, 2, Direction.EAST);
        new Wall(Kw, 7, 3, Direction.NORTH);
        new Wall(Kw, 7, 4, Direction.NORTH);
        new Wall(Kw, 7, 5, Direction.NORTH);
        new Wall(Kw, 7, 6, Direction.NORTH);
        new Wall(Kw, 7, 7, Direction.NORTH);
        new Wall(Kw, 7, 7, Direction.EAST);
        new Wall(Kw, 8, 7, Direction.EAST);
        new Wall(Kw, 8, 7, Direction.SOUTH);
        new Wall(Kw, 8, 6, Direction.SOUTH);
        new Wall(Kw, 8, 5, Direction.SOUTH);
        new Wall(Kw, 8, 4, Direction.SOUTH);
        new Wall(Kw, 8, 3, Direction.SOUTH);
        new Wall(Kw, 9, 2, Direction.EAST);
        new Wall(Kw, 9, 2, Direction.SOUTH);

        new Thing(Kw, 1, 2);
        new Thing(Kw, 1, 3);
        new Thing(Kw, 1, 4);
        new Thing(Kw, 1, 5);
        new Thing(Kw, 2, 2);
        new Thing(Kw, 2, 4);
        new Thing(Kw, 2, 6);
        new Thing(Kw, 4, 2);
        new Thing(Kw, 4, 3);
        new Thing(Kw, 4, 4);
        new Thing(Kw, 7, 2);
        new Thing(Kw, 7, 3);
        new Thing(Kw, 7, 7);
        new Thing(Kw, 8, 3);
        new Thing(Kw, 8, 4);
        new Thing(Kw, 8, 6);

        denis.setLabel("K");
        fineas.setLabel("T");

        denis.setColor(Color.red);
        fineas.setColor(Color.white);

        while (denis.frontIsClear()) {
            // move to next street
            denis.move();
            // turn left to check driveway
            denis.turnLeft();

            // if front is clear, move and pick thing if he can
            while (denis.frontIsClear()) {
                denis.move();
                if (denis.canPickThing()) {
                    denis.pickThing();
                }
            }
            // turn around
            if (!denis.frontIsClear()) {
                denis.turnLeft();
                denis.turnLeft();
            }

            // come back to sidewalk
            while (denis.frontIsClear()) {
                denis.move();
            }
            // turn south and put snow down
            denis.turnLeft();
            while (denis.countThingsInBackpack() > 0) {
                denis.putThing();
            }
        }

        // second robot move and if he can pick thing up, pick it up!
        while (fineas.frontIsClear()) {
            fineas.move();
            while (fineas.canPickThing()) {
                fineas.pickThing();
            }
        }
    }
}