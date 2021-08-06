import processing.core.PApplet;

import java.util.ArrayList;

public class Processing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 10;
    int num = 4;
    ArrayList<Circle> circlesList;

    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        circlesList = new ArrayList<>();
        for (int rank = 1; rank <= num; rank++) {
            circlesList.add(new Circle(0, getyPosition(rank), DIAMETER, rank));
        }
    }

    private int getyPosition(int rank) {
        return (rank * HEIGHT) / (num + 1);
    }

    @Override
    public void draw() {
        for (Circle circle : circlesList) {
            circle.draw(this);
            circle.move();
        }
    }
}
