package BaithiJava;

public class HinhTron {
    private double radius;
    public HinhTron() {
        this.radius = 1.0;
    }
    public HinhTron(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius; 
    }
}
