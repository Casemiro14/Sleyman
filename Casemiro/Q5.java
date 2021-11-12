import java.util.Scanner;
class Q5{
    public static void main(String []args){
        int Eggs, Gross, Dozen, Remain;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter the number of Eggs: ");
        Eggs = in.nextInt();

        Gross = Eggs / 144;
        Remain = Eggs - (Gross * 144);
        Dozen = Remain / 12;
        System.out.printf("Your number of "+Eggs+" Gross"+Gross+" and "+Dozen);
    }
}