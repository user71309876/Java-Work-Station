public class basic {
    public static void main(String[] args) {
        System.out.print("hello world");
        // 이렇게 하면 hello world는 출력되지만, 줄바꿈은 되지 않는다
        System.out.println("i love earth");
        // 이렇게 하면 i love earth가 출력되고 줄바꿈이 된다
        System.out.print("\ti love earth");
        // \t는 tab을 쓴 것과 같은 효과를 낸다
        // \n, \t, \r, \\, \', \"와 같은 문자를 escape sequence라 한다
    }
}