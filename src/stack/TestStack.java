package stack;

import java.util.Random;

public class TestStack {
    public static void main(String[] args) {
        StackIntf stackIntf=new Sqstacktp();

        Random random=new Random();
        for(int i=0;i<10;i++){
            int x=random.nextInt();
            stackIntf.push(x);
            System.out.println(x);
        }
        stackIntf.push(10);
        stackIntf.isEmpty();
        System.out.println(stackIntf.pop());
        System.out.println(stackIntf.top());

    }
}
