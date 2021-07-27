public class Circle {
    float xPosition, yPosition, diameter, speed;

    public Circle(int xPosition, int yPosition, int diameter, int speed) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void move(){
        xPosition += speed;
    }
}
