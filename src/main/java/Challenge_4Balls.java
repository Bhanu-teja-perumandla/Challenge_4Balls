import processing.core.PApplet;

public class Challenge_4Balls extends PApplet {

    public static final int WIDTH = 720;
    public static final int HEIGHT = 720;
    public static final int DIAMETER = 20;
    int cursor[]={0,0,0,0};

    public static void main(String[] args) {
        PApplet.main("Challenge_4Balls",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
    }

    @Override
    public void draw() {
        background(mouseX%255,mouseY%255,(mouseX+mouseY)%255);
        drawBall(1,1);
        drawBall(2,2);
        drawBall(3,3);
        drawBall(4,4);
    }

    private void drawBall(int ballNumber,int speed) {
        movingBall(ballNumber,speed);
        movingCursor(speed);
    }

    private void movingBall(int ballNumber, int speed) {
        ellipse(cursor[speed-1], getHeight(ballNumber), DIAMETER, DIAMETER);
    }

    private void movingCursor(int speed) {
        cursor[speed -1]+= speed;
        if(cursor[speed-1]>WIDTH) cursor[speed-1]=0;
    }

    private int getHeight(int ballNumber) {
        return ballNumber * HEIGHT / 5;
    }
}
