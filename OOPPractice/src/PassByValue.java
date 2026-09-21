public class PassByValue {
    public static void main(String[] args){
        Employee s1 = new Employee("Zeeshan", 23, "cs");
        Employee s2 = new Employee(s1); //pass by value but it pass the address of Object.
        s1.printData();
    }

}
class Employee{
    String name;
    int age;
    String course;
    Employee(Employee s2){
        this.name = name;
        s2.age =age;
        s2.course = course;
    }
    Employee(String name, int age, String course){
        this.name = name;
        this.age =age;
        this.course = course;
    }
    void printData(){
        System.out.println(name + " "+ age +" "+course);
    }
}
