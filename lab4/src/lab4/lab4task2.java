package lab4;
//2022f-bse-142
class RollNoThread extends Thread {
    public void run() {
        String[] rollNos = {"2022F-BSE-142", "2022F-BSE-333", "2022F-BSE-444"};
        for (String rollNo : rollNos) {
            System.out.println("Roll Number: " + rollNo);
        }
     
    }
}
class BirthDateThread extends Thread {
    @Override
    public void run() {
        String[] bods = { "23-December", "1-June", "14-April"};
        for (String bod : bods) {
            System.out.println("Date of Birth: " + bod);
        
        }
    }
}
public class lab4task2 {
    public static void main(String[] args) {
        RollNoThread rollNoThread = new RollNoThread();
        BirthDateThread birthThread = new BirthDateThread();
        rollNoThread.start();
        birthThread.start();
        System.out.println("Both threads have finished execution.");
    }
}



