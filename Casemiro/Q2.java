import java.util.Scanner;
class Q2{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = in.nextLine();
        System.out.println("Enter your City: ");
        String city = in.nextLine();
        System.out.println("Enter your Age: ");
        int age = in.nextInt();
        System.out.println("Enter your Profession: ");
        String profession = in.nextLine();
        System.out.println("Enter your type of Animal: ");
        String animaltype = in.nextLine();
        System.out.println("Enter your Petname: ");
        String petname = in.nextLine();
        System.out.println("Enter your collage name: ");
        String collage = in.nextLine();
        System.out.println("There are once was a person named "+name+" who lived at "+city+" At the age of "+age+","+name+" went to collage at "+collage+". "+name+" gradueted and went to work as a "+profession+" Then, "+name+" adopted an "+animaltype+" named "+petname+" They both lived happily ever after!");

    }
}