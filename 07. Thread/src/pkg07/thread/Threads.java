/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07.thread;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CustomThread cT1 = new CustomThread();
//        CustomThread cT2 = new CustomThread();
//        cT1.start();
//        cT2.start();
        
//        System.out.println("Main thread");

        int chairs = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of chairs: ", JOptionPane.QUESTION_MESSAGE));
        int room = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of rooms: ", JOptionPane.QUESTION_MESSAGE));
        
        boolean[] reception = new boolean[chairs];
        boolean[] rooms = new boolean[room];
        for (int i = 0; i < reception.length; i++) {
            reception[i] = false;
        }
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = false;
        }




    }
    
}


class Patients extends Thread{
    
    @Override
    public void run(){
        while (true) {            
            try {
                Thread.sleep(3000);
                System.out.println("1");
                
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
        
        
    }
}

//class MyThread extends Thread{
//    private boolean running = true;
//    private int counter;
//    @Override
//    public void run(){
//        while (running) {            
//            System.out.println("My Thread => " + counter++);
//        }
//    }
//}
//
//
//
//class CustomThread extends Thread{
//    @Override
//    public void run(){
//        for (int i = 0; i < 10000; i++) {
//            try {
//                Thread.sleep(100);
//                System.out.println("Custom thread => " + i);
//            } catch (InterruptedException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//}


