package lab4;

public class lab4task1 extends Thread { 
    public void run() { 
        System.out.println("task one"); 
    } 

    public static void main(String args[]) { 
        lab4task1 t1 = new lab4task1(); 
        lab4task1 t2 = new lab4task1(); 
        lab4task1 t3 = new lab4task1(); 
        t1.start(); 
        t2.start(); 
        t3.start(); 
    } 
}