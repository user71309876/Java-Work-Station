import java.util.Scanner;

class nested_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int colums;
        String symbol="";

        System.out.print("Enter # of rows: ");
        rows=scanner.nextInt();
        System.out.print("Enter # of colums: ");
        colums=scanner.nextInt();
        System.out.print("Enter symbol to use: ");
        symbol=scanner.next();

        for(int i=1;i<=rows;i++){
            System.out.println();
            for(int j=1;j<=colums;j++){
                System.out.print(symbol);
            }

        }

    }
    
}
