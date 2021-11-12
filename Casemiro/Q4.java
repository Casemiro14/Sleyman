import java.util.Scanner;
class Q4{
    public static void main(String[]args){
        int G, M, P;
        int TotalTravel, Cost;
    // G for number of Gallon, M for number of miles and P for price of gas per galon    
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of gallon: ");
        G = in.nextInt();
        System.out.printf("Enter the number of miles per gallon: ");
        M = in.nextInt();
        System.out.printf("Enter the Price of Gallons: ");
        P = in.nextInt();
        TotalTravel = M * G;
        Cost = ((250/M) * P);
        System.out.println("The Car can Travel with gas "+M+"milles");
        System.out.printf("The cost of travelling 250 miles with the car is:"+Cost);
    }
}