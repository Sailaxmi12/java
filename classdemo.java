class Cars{
    String model;
    String color;
    String make;
    void displayOnRoadPrice(){
        System.out.println("On road prize")
    }
}

public class classdemo {
    public static void main(String args[])
    Cars swift =new Cars();
    swift.model="desire";
    swift.color="red";
    swift.make="Maruti Suzuki";
     
     System.out.println("Model: "+ swift.model +" color: "+swift.color+"make:"+swift.make);
    
}
