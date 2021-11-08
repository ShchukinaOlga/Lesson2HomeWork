/**
 * Java 1. HomeWork 2
 *
 @ autor Shchukina Olga
 @ version 07.11.2021
*/
class Lesson2HomeWork {

    public static void main(String[] args) {
        doThree(7, 67);
        doThree(32, 0);
        PositiveNegative(10);

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        doThree(1, 20);
        doFour(4);
    }
    static boolean doThree(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) return true;
        else return false;
    }
    
    static void doFour(int a) {
        if (a >= 0) System.out.println("Positiv");
        else System.out.println("Negativ");
    }
}