import java.util.Scanner;
class Q3{
    public static void main(String []args){
        int revenue, Q;
        int P = 2500;
        // P for price per pasenger and Q for number of pasenger
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of number of pacenger: ");
            Q = in.nextInt();
            revenue = P * Q;
        System.out.println("The company will generate $"+revenue+" for the tour.");


    }
}