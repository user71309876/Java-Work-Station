import java.util.Scanner;

class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("what is your name?");
        String name=scanner.nextLine();
        // nextLine() : 문자열 값만 입력받을 수 있음

        System.out.println("how old are you? ");
        int age=scanner.nextInt();
        // nextInt() : 정수형 값만 입력받을 수 있음

        scanner.nextLine();//scanner값 초기화
        
        System.out.println("what is your favorite food? ");
        String food=scanner.nextLine();
        
        System.out.println("hello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("you like "+food);
        scanner.close();//앤 동영상엔 없는데 프로그램이 하래서 한거임
        /*
        만약 13번 줄이 없으면 어떻게 되냐
        user가 값을 입력하면 값을 입력하고 neter를 입력한다
        그러면 scanner 값의 마지막에 /n이 들어간다
        nextLine()는 이 값을 읽을 수 있다
        하지만 nextInt()는 이 값을 읽을 수 없다
        그러면 age에 값을 입력받게 되면
        그대로 scanner에 \n이 잔류하게 된다
        그리고 15번째의 food에는 scanner에 \n이 있으므로
        nextLine()이 값을 받았다 착각하고 그대로 다음 문자으로 넘어가게 된다
        그래서 13번째에 scanner.nextLine()로 \n을 날린 후
        15번째에서 nextInt로 값을 받는 것이다
        */
    }
    
}
