class variables {
    public static void main(String[] args) {
        int x;//선언(declaration)
        x=123;//할당(assignment)
        int y=123;//초기화(initialization)
        System.out.println("my number is : "+x);
        
        long num=10000000000000L;
        System.out.println("my number is : "+num);
        //long형 변수는 마지막에 L(소문자도 상관 없음)을 넣어야 한다

        float num1=3.14f;
        System.out.println("my number is  : "+num1);
        //flaot형 변수는 마지막에 F(소문자도 상관 없음)을 넣어야 한다

        double num2=3.14;
        System.out.println("my number is  : "+num2);
        //double은 안넣어도 된다
    }
}