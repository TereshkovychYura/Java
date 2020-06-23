/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class OOP {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
//        Developer tom = new Developer("Tom Jones", "Rivne", "Senior Java Developer", 35, 3000);
//        tom.GetDeveloperInfo();
//        tom.setCity("Lviv");
//        System.out.println(tom.getCity());
        
//       Developer[] devTeam = new Developer[3];
//        for (int i = 0; i < devTeam.length; i++) {
//            devTeam[i] = new Developer();
//        }
//        
//        
//        System.out.println("-----------------------------");
//        for (int i = 0; i < devTeam.length; i++) {
//            devTeam[i].GetDeveloperInfo();
//            System.out.println("-----------------------------");
//        }
      //Developer tom = new Developer("Tom Jones", "Rivne", "Senior Java Developer", 35, 3000);
      //Developer bob = new Developer("Bob Stark", "Kiev", "Senior C# Developer", 29, 2500);
      //Developer john = new Developer("John Show", "Lviv", "Senior Python Developer", 18, 1500);
      
      //tom.CompareSalary(bob, john);
      //String[] skills = {"SQL","Entity Framework", "Windows Forms", "React", "Redux"};
      
      //tom.setSkills(skills);
      //tom.GetDeveloperInfo();
      
      
      Account myAcc = new Account("322",2000, "$");
      Account friendAcc = new Account("228",1500, "$");
        
    }
    
    
}
