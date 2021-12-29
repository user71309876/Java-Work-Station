class for_loop {
    public static void main(String[] args) {
        
        for(int i=0;i <=10;i++){
            System.out.println(i);

        }

        System.out.println("===============================");
        
        //이렇게도 쓸 수 있다
        for(int i=0;i <=10;){
            System.out.println(i);
            i+=2;
        }
            
    }
}
