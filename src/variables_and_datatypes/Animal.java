package variables_and_datatypes;

public abstract class Animal {
    public  void sound(){
        System.out.println("animals sounding");
    }


}
 class Dog extends Animal{
     @Override
     public void sound(){
         System.out.println("Dog  barks");
     }
 }
 class main{
     public static void main(String[] args) {
         Dog d=new Dog();
         d.sound();
     }

}