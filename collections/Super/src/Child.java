import java.awt.font.GraphicAttribute;


interface ParentInterface{

}
class grandParent {

}
class Parent  extends grandParent {
   String  name = "Satya";
 int age = 47;
   public void ParentDetails(){
        System.out.println("printing from parent class");
        System.out.println(name+" "+age);
    }
}
    public  class Child  extends  Parent implements ParentInterface{
    //String name ="venkana";
        public static void main(String[] args) {
 Child cc= new Child();
 cc.dummy();

        }
        public void  dummy(){
            System.out.println("this is dummy  "+name);
        }
        @Override
        public void ParentDetails(){
            System.out.println("printing from child class");
            System.out.println(name+" "+age);
            System.out.println("details changed ");
        }

    }

