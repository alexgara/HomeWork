package HW9.competitors;

public class Robot implements Competitor {
    String type;
    String name;

    int maxRunDistance;
    int maxSwimDistance;
    int maxJumpHeight;

    boolean onDistance;

    public Robot(String type, String name, int maxRunDistance, int maxSwimDistance, int maxJumpHeight) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.onDistance = true;
    }

    public Robot(String name) {
        this("Робот", name,100000,5000,3);
    }

    @Override
    public void run(int dist) {
        if (dist <= maxRunDistance) {
            System.out.printf("%s %s успешно пробежал %d  метров\n",type,  name, dist);
        } else {
            System.out.printf("%s %s не смог пробежать %d  метров\n",type, name, dist);
            onDistance = false;
        }
    }

    @Override
    public void swim(int dist) {
        if(maxSwimDistance == 0){
            System.out.printf("%s %s не умеет плавать вообще\n",type, name);
            onDistance = false;
            return;
        }
        if (dist <= maxSwimDistance) {
            System.out.printf("%s %s успешно проплыла %d  метров\n",type, name, dist);
        } else {
            System.out.printf("%s %s не может плыть %d  метров\n",type, name, dist);
            onDistance = false;
        }
    }

    @Override
    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.printf("%s %s успешно прыгнул %d  метров\n",type, name, height);
        } else {
            System.out.printf("%s %s не смог прыгнуть %d  метров\n",type, name, height);
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void info() {
        System.out.printf("%s %s %b\n",type, name, onDistance);
    }
}
