public class FirstClassCreating {
    public static void main(String[] args){
        Student s1 = new Student("Zeeshan", 23, "cs");
        s1.printData();
    }

}
class Student{
    String name;
    int age;
    String course;
    Student(String name, int age, String course){
        this.name = name;
        this.age =age;
        this.course = course;
    }
    void printData(){
        System.out.println(name + " "+ age +" "+course);
    }


}