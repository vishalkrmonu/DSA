class Pen{
    String colour;
    int price;
    String type;

public void write(){
    System.out.println("pen is writting  ");
}
public void draw(){
    System.out.println("pen is drawing  ");
}

}
class OOP1{
    public static void main(String[] args) {
        Pen parkar=new Pen();
        parkar.colour="blue";
        parkar.price=500;
        parkar.type="ballpen";
        parkar.write();
        parkar.draw();
        System.out.println(parkar.colour);

        Pen trimax=new Pen();
        trimax.colour="black";
                System.out.println(trimax.colour);

    }
}

//constractor
class Pen1{
    String colour;
    int price;
    String type;
    // Pen(){ Default constructor
        
    // }
   
    Pen1(String c , int p , String t){ //parameterized constructor
        colour = c;
        price = p;
        type = t;
    }


    Pen1(){ //non-parameterized constructor
        colour = "Blue";
        price = 50;
        type = "Gel";
    }


    public void write(){
        System.out.println("Pen is writing...");
    }
    public void draw(){
        System.out.println("Pen is drawing...");
    }
}
class OOP3 {
    public static void main(String[] args) {
        Pen1 parker = new Pen1("Blue" , 500 , "Ballpoint");
        parker.write();
        parker.draw();
        System.out.println(parker.colour);
        System.out.println(parker.price);
        System.out.println(parker.type);
       
        Pen trimax = new Pen();
        trimax.write();
        trimax.draw();
        System.out.println(trimax.colour);
        System.out.println(trimax.price);
        System.out.println(trimax.type);
    }
}

