package HW9.obstacles;

import HW9.competitors.Competitor;

public class Water extends Obstacle {
    private int dist;

    public Water(int dist) {
        this.dist = dist;
    }

    @Override
    public void doIt(Competitor c) {
        c.swim(dist);
    }
}
