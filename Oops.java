class Dog{
    //DOES- Part
    void bark(){
        System.out.println("Dog is barking");
    }
    void sleep(){
        System.out.println("Dog is sleeping");
    }
    void eat(){
        System.out.println("Dog is eating");
    }
}
class Calculator{

    //DOES-Part
    int addTwoNumbers(int a, int b){
        int c = a+b;
        return c;
    }
}
public class Oops{
    public static void main(String[] args){
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.sleep();
        System.out.println("**********");
        Dog d2 = new Dog();
        d2.eat();
        d2.sleep();
        d1.bark();
        Calculator calc = new Calculator();
        
        int z = calc.addTwoNumbers(20,30);
        System.out.println(z);
    }
}
