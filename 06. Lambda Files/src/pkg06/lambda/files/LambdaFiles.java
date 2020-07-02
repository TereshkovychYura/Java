/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06.lambda.files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */

//interface Executable{
//    void execute();
//}
//    
//class Runner{
//    public void  run(Executable e){
//        e.execute();          
//    }
//}
public class LambdaFiles {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        Runner runner = new Runner();
//        runner.run(() -> System.out.println("Run"));
        //String str = "This is a test string";
        String path = "src\\pkg06\\lambda\\files\\PhoneDB.txt";
//        try(FileOutputStream file  = new FileOutputStream(path)) {
//            
//            byte[] tmp = str.getBytes();
//            file.write(tmp, 0, tmp.length);
//            file.close();
//            System.out.println("Success");
//             
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

//        try(FileInputStream file  = new FileInputStream(path)) {
//            System.out.println("Bytes size = " + file.available());
//            
//            int i = -1;
//            while((i = file.read()) !=-1){
//                System.out.print((char)i);
//            }
//            System.out.println();
//            file.close();   
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }

//------------------------------------------PhoneDB----------------------------------------------
        
//        try(FileOutputStream file  = new FileOutputStream(path)) {
//            
//            byte[] tmp = "IPhone X\nSamsung S8\nNokia 3310\nHuawei P9".getBytes();
//            file.write(tmp, 0, tmp.length);
//            file.close();
//             
//        } catch (IOException ex) {
//            System.out.println(ex.getMessage());
//        }
        
        
        
        int chose = 0;
        
        while (chose!=5) {            
            chose = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Show all phones. \n2)Add new phone. \n3)Delete phone. \n4)Edit phone \n5)Exit", JOptionPane.QUESTION_MESSAGE));
            switch(chose){
                case 1:{
                    String showO = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));) {

                        String line;
                        int i = 0;
                        while ((line = br.readLine()) != null) {
                            
                            showO += (i+1) + ")"+ line + "\n";
                            i++;
                        }
                        br.close();
                    }
                    JOptionPane.showConfirmDialog(null, showO, " Phones: ", JOptionPane.CLOSED_OPTION);
                    break;
                }
                case 2:{
                    String make = JOptionPane.showInputDialog(null, "Enter make: ", JOptionPane.QUESTION_MESSAGE);
                    String model = JOptionPane.showInputDialog(null, "Enter model: ", JOptionPane.QUESTION_MESSAGE);
                    try(FileOutputStream file  = new FileOutputStream(path, true)) {  
                        String phone = "\n" + make + " " + model;
                        byte[] tmp = phone.getBytes();
                        file.write(tmp, 0, tmp.length);
                        file.close();
                         
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    JOptionPane.showConfirmDialog(null, "Your phone successfully added", " Add phone ", JOptionPane.CLOSED_OPTION);
                    break;
                }
                case 3:{
                    String showO = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));) {

                        String line;
                        int i = 0;
                        while ((line = br.readLine()) != null) {
                            
                            showO += (i+1) + ")"+ line + "\n";
                            i++;
                        }
                        br.close();
                    }
                    int ln = Integer.parseInt(JOptionPane.showInputDialog(null, showO + "Which phone you wanna delete: ", JOptionPane.QUESTION_MESSAGE));
                    String changedShow = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));) {

                        String line;
                        int i = 0;
                        while ((line = br.readLine()) != null) {
                            if(i!=ln-1)
                            changedShow += line + "\n";
                            i++;
                        }
                        br.close();
                    }
                    try(FileOutputStream file  = new FileOutputStream(path)) {
                        
                        byte[] tmp = changedShow.getBytes();
                        file.write(tmp, 0, tmp.length);
                        file.close();
                         
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 4:{
                    String showO = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));) {

                        String line;
                        int i = 0;
                        while ((line = br.readLine()) != null) {
                            
                            showO += (i+1) + ")"+ line + "\n";
                            i++;
                        }
                        br.close();
                    }
                    int ln = Integer.parseInt(JOptionPane.showInputDialog(null, showO + "Which phone you wanna edit: ", JOptionPane.QUESTION_MESSAGE));
                    String make = JOptionPane.showInputDialog(null, "Enter make: ", JOptionPane.QUESTION_MESSAGE);
                    String model = JOptionPane.showInputDialog(null, "Enter model: ", JOptionPane.QUESTION_MESSAGE);
                    String changedShow = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(
                        new FileInputStream(path), StandardCharsets.UTF_8));) {

                        String line;
                        int i = 0;
                        while ((line = br.readLine()) != null) {
                            if(i == ln-1)
                            {
                                changedShow += make + " " + model + "\n";
                            }else{
                                changedShow += line + "\n";
                            }
                            i++;
                        }
                        br.close();
                    }
                    try(FileOutputStream file  = new FileOutputStream(path)) {
                        
                        byte[] tmp = changedShow.getBytes();
                        file.write(tmp, 0, tmp.length);
                        file.close();
                         
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
            }
        }
    }
    
}
