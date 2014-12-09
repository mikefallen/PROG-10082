/**NAME: MICHAEL ZARGLIS
 * ASSIGNMENT 4
 *
 * Created by mike on 12/8/2014.
 * Custom Robot class with custom methods
 */
import becker.robots.*;

public class RobotMike extends RobotSE
{
    public RobotMike (City city, int street, int avenue, Direction direction)
    {
        super (city, street, avenue, direction);

    }
    public RobotMike (City city, int street, int avenue, Direction direction, int numThing)
    {
        super (city, street, avenue, direction, numThing);
    }

    public void goToIntersection (Intersection inter) {
        goToAvenue(inter.getAvenue());
        goToStreet(inter.getStreet());
    }

    public void goToIntersection (int street, int avenue) {
        goToAvenue(avenue);
        goToStreet(street);
    }

    public void goToAvenue( int ave) {
        if (this.getAvenue() < ave) {
            faceDirection(Direction.EAST);
        } else if (this.getAvenue() > ave) {
            faceDirection(Direction.WEST);
        }
        while (this.getAvenue() != ave) {
            this.move();
        }
    }

    public void goToStreet( int street) {
        if (this.getStreet() < street) {
            faceDirection( Direction.SOUTH);
        } else if (this.getStreet() > street) {
            faceDirection( Direction.NORTH);
        }
        while (this.getStreet() != street) {
            this.move();
        }
    }

    public void faceDirection(Direction dir) {
        while (this.getDirection() != dir) {
            this.turnLeft();
        }
    }
    //picks up all available things in intersection
    public int pickAll(){
        int counter = 0; //counter for number of things total picked up
        while (canPickThing()){ //while there are things to pick up, PICK THEM UP!!!
            pickThing();
            counter++;
        }
        return counter; //return number of things picked up as integer


    }
    //puts all available things from backpack into the intersection
    public int putAll(){
        int counter =0;//counter for number of things total put down
        while (countThingsInBackpack()>0){
            putThing();
            counter++;
        }
        return counter;



    }

    public int pickAllAtIntersection(Intersection inter){
        goToIntersection(inter); //moves to passed intersection
        int numThings = pickAll(); //picks all things
        return numThings;// returns num things picked up
    }

    public int PutAllAtIntersection(Intersection inter){
        goToIntersection(inter);
        int numThings = putAll();
        return numThings;

    }


}