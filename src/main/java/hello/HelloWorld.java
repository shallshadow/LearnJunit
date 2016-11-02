package hello;

import org.joda.time.LocalTime;

public class HelloWorld{
    public static void main(String[] args){
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is :" + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

    public void sayHello(){
        System.out.println("Hello man!");
        System.out.println("Hello World");
        
    }

    public String getStr(){
        return "Hello World!";
    }
}
