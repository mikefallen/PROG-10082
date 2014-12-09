/**
 * Created by mike on 12/9/2014.
 */
import becker.robots.*;
public class A4 {
    public static void main(String[] args) {
        City city = new City("assign4_01.cty");
        RobotMike bob = new RobotMike(city,0 , 0,Direction.SOUTH);
        Intersection goodWill = new Intersection(city, 12, 13);
        Intersection pileOfThings1 = new Intersection(city, 2, 5);
        Intersection pileOfThings2 = new Intersection(city, 5, 1);
        Intersection pileOfThings3 = new Intersection(city, 8, 8);
        bob.pickAllAtIntersection(pileOfThings1);
        bob.pickAllAtIntersection(pileOfThings2);
        bob.pickAllAtIntersection(pileOfThings3);
        bob.goToIntersection(goodWill);

    }
}
