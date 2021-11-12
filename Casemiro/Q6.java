import java.util.Scanner;
class Q6{
    public static void main(String []args){
        double perfomance, salary;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter performance level: ");
        perfomance = in.nextDouble();
        System.out.printf("Enter base Salary: ");
        salary = in.nextDouble();

        if (perfomance >= 90)
        {
            salary = (salary * (3/100));
        }
        else
        {
            System.out.printf("Salary is "+salary);
        }
        
        
    }
}
