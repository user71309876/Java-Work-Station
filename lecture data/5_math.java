class math {
    public static void main(String[] args) {
        double x=3.14;
        double y=-10;

        double num1=Math.max(x, y);
        // 두 변수 중 큰 것을 고른다
        double num2=Math.min(x,y);
        // 두 변수 중 작은 것을 고른다
        double num3=Math.abs(y);
        // absolute value(절대값), 변수의 절대값을 구한다
        double num4=Math.sqrt(x);
        // square root(제곱근), 변수의 제곱근을 구한다
        double num5=Math.round(x);
        // 변수의 반올림을 구한다
        double num6=Math.ceil(x);
        // 변수의 올림을 구한다
        double num7=Math.floor(x);
        // 변수의 내림을 구한다

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        System.out.println(num7);

        
    }
    
}
