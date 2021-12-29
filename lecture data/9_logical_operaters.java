import java.util.Scanner;

class logical_operaters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int temp = 25;

        if (temp > 30) {
            System.out.println("It is hot outside");
        } else if (temp >= 20 && temp <= 30) {
            System.out.println("It is wram outside");
        } else {
            System.out.println("It is cold outside");
        }

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if (response.equals("q") || response.equals("Q")) {
            System.out.println("You quit the game");
        } else {
            System.out.println("You are still playing the game *pew pew*");
        }
    }

}
