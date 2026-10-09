package BaithiJava;

public class Bai1_Main {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron(5.5);
        double area = ht.getArea();
        double perimeter = ht.getPerimeter();
        System.out.println("Ban kinh hinh tron: " + ht.getRadius());
        System.out.println("Chu vi hinh tron: " + area);
        System.out.println("Dien tich hinh tron: " + perimeter);
    }
}
