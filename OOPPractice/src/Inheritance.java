//Inheritance with method overriding.
public class Inheritance {

    public static void main(String[] args) {
        Vehicles ob = new Vehicles("frari", "red", 450000.0);
        ob.getValues();
    }
}
class Vehicles{
    String name;
    String color;
    double price;
    Vehicles(String n, String c, double p){
        this.name = n;
        color = c;
        price = p;
    }
    void getValues(){
        System.out.println("this is parent Class");
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }


}
class Car extends Vehicles{
    Car(String n, String c, double p){
        super(n,c,p);
    }
    void getValues(){
        System.out.println("this is Car Class");
        System.out.println(name);
        System.out.println(color);
        System.out.println(price);
    }
}
