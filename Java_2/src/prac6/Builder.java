package prac6;

public interface Builder {
    void setX(int x);
    void setY(int y);
    void setSpeed(int speed);
    Point build();
}
