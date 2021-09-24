package kata1_ade;

import java.util.Date;

public class Kata1_ADE {

    public static void main(String[] args) {
        Person person = new Person("Antonio", new Date(80,0,1));       
        System.out.println(person.getName() + " tiene " + person.getAge() + "." );
        
        
    }
    
}
