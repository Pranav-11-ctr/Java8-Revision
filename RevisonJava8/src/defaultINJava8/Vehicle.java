package defaultINJava8;

public interface Vehicle {

    public int getSpeed();

    public void applyBreak();

    default  void method1()
    {
        System.out.println("This is sample method inside Interface");
    }
}
