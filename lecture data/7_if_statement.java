class if_statement {
    public static void main(String[] args) {
        int age=18;
        
        if(age>=18){
            System.out.println("You are an adult!");
        }
        else if(age>=75){
            System.out.println("Ok Boomer");
        }
        else{
            System.out.println("You are not an adult!");
        }
        /*
        if문 혹은 else if문의 조건을 실행해보다가
        하나만 맞으면 그 if,else if, else문 다 탈출
        
        if문 혹은 else if문이 다 안맞았을 때
        else문이 있다면 else문 실행
        else문이 없다면 그냥 탈출
        */
        
    }
    
}
