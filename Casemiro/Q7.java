import java.util.Scanner;
class Q7{
    public static void main(String[]args){
        int a, b, c, d, e, HCF, LCM;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter first number: ");
            c = in.nextInt();
        System.out.printf("Enter second number: ");
            d = in.nextInt();
            
            a = c;
            b = d;
        while (b != 0)
        {
            e = b;
            b = a % b;
            a = e;
        }
        HCF = a;
        LCM = (c * d)/HCF;
        System.out.println("The HCF of enterd number is "+HCF);
        System.out.printf("The LCM of enterd number is "+LCM);
    }
}