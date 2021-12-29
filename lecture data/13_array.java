class array {
    public static void main(String[] args) {

        String[] cars={"Camaro","Corvette","Tesla"};

        cars[0]="Mustang";

        System.out.println(cars[0]);


        String[] vehicles=new String[3];//미리 vehicles에 string 타입의 공간을 확보
        vehicles[0]="Camaro";
        vehicles[1]="Corvette";
        vehicles[2]="Tesla";

        for(int i=0;i<vehicles.length;i++){
            System.out.println(vehicles[i]);
        }
        

    }
    
}
