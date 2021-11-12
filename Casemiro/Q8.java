import java.util.Scanner;
class Q8{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of minutes: ");
        int min = in.nextInt();
        int year = min / 525600;
        int day = ((min % 525600) / 1440);
    System.out.printf(min+" minutes is approximately to "+year+" and "+day);
    }
}