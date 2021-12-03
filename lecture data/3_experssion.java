class experssion {
    public static void main(String[] args) {
        int friends = 10;
        double num;

        num = (double) friends / 3;
        /*
         * double를 쓰지 않으면 그냥 3.0이 나옴
         * 하지만 쓰면 3.3333333...이 나옴
         * 형변환은 이렇게 하는 것이고(변수에 대해선 안됨)
         * 나눠지는 값이 int형이면 몫도 int형으로 되나봄
         */

        System.out.println(num);
        /*
         * 이번 수업에선 수들의 계산에 대해 나오는데
         * 다 c/cpp에서 나오는 내용이라
         * 변수형 변환에 대해서만 이야기함
         */

    }

}
