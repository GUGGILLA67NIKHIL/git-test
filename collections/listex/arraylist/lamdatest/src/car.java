public class car extends audi{
    public static void main(String[] args) {


        car c= new car() {
            public void drive() {
                System.out.println("i am drivimng tata");
            }
        };
        new car(){
            public void drive(){
                System.out.println("i am driving bmw");
            }
        };
          new car().drive();
          /// /////////
        cartype c1  = () -> System.out.println("i  am driving niro");
          c1.drive();
        c.drive();
        audi a = new audi();
        a.drive();

    }

}

class audi implements cartype{

    @Override
    public void drive() {
        System.out.println("i am drivimng audi");
    }

}
    @FunctionalInterface
    interface cartype{
    public void drive();

    }

