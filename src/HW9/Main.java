package HW9;

import HW9.competitors.Cat;
import HW9.competitors.Competitor;
import HW9.competitors.Human;
import HW9.competitors.Robot;
import HW9.obstacles.Cross;
import HW9.obstacles.Obstacle;
import HW9.obstacles.Wall;
import HW9.obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Competitor [] competitors = {
                new Cat("Луша"),
                new Human("Усейн Болт"),
                new Robot("Электроник"),
        };

        Obstacle [] obstacles = {
                new Cross(1000),
                new Wall(3),
                new Water(4),
        };

        for (Competitor c:competitors){
            for (Obstacle o:obstacles){
                o.doIt(c);
                if (!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor competitor:competitors){
            competitor.info();
        }
    }
}
