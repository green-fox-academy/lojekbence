public class Cuboid {
    public static void main(String[] args) {
        double a = 2.3;
        double b = 4.78;
        double c = 3.43;
        double surfArea = 2*((a*b)+(a*c)+(b*c));
        double volume = a*b*c;
        System.out.println("Surface area: " + surfArea);
        System.out.println("Volume: " + volume);
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000
    }
}
