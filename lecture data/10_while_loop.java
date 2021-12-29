import java.util.Scanner;

class while_loop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String name="";
        
        //While loop is excape curly bracket when the condiction remains false in round bracket
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name=scanner.nextLine();
        }
        System.out.println("Hello "+name+"one time");

        //Do-While loop is perform our block of code at least once
        do{
            System.out.println("Enter your name: ");
            name=scanner.nextLine();
        }while(name.isBlank());

    }
    
}
