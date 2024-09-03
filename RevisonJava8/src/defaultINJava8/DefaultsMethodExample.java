package defaultINJava8;

import org.omg.Messaging.SyncScopeHelper;

public class DefaultsMethodExample implements Vehicle{


    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void applyBreak() {
        System.out.println("Apply break from class");

    }

    @Override
    public void method1() {
        Vehicle.super.method1();//if we want to call Interface default method
        System.out.println("Inside Class");
    }


    public static void main(String[] args) {
        DefaultsMethodExample df1=new DefaultsMethodExample();
        df1.applyBreak();
        System.out.println(df1.getSpeed());
        df1.method1();
    }
}
