public class MethodOverloading {
    static void main() {
        AddNumbers Addition = new AddNumbers();
        System.out.println(Addition.addNumbers(45,65));
        System.out.println(Addition.addNumbers(32,12,1));
    }
}
class AddNumbers{

    int addNumbers(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    int addNumbers(int num1, int num2, int num3){
        int sum = num1 + num2 + num3;
        return  sum;
    }

}

