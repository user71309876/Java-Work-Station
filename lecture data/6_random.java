import java.util.Random;

class random {
    public static void main(String[] args) {
        Random random=new Random();
        
        int num1=random.nextInt();
        //int형이 가질 수 있는 값만큼 중에서 랜덤값을 받음
        System.out.println(num1);
        
        int num2=random.nextInt(6);
        //0부터 5까지의 수 중에 랜덤한 값을 뽑음
        System.out.println(num2);

        double num3=random.nextDouble();
        //0부터 1까지의 실수 중에 랜덤하게 값을 넣음
        System.out.println(num3);

        boolean num4=random.nextBoolean();
        //true or false를 반환함
        System.out.println(num4);
    }
}
