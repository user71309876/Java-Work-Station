import java.util.Scanner;

class math_problem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double x;
        double y;
        double z;//this variable will whthin result

        System.out.print("Enter side x : ");
        x=scanner.nextDouble();
        System.out.print("Enter side y : ");
        y=scanner.nextDouble();

        z=Math.sqrt(x*x+y*y);
        System.out.println("The hypotenuse is : "+z);

        scanner.close();
    }
}
