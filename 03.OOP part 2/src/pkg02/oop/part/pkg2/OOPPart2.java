/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop.part.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class OOPPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int minTrain = 1000000, maxTrain = 1, maxTrainInd = 0, minTrainInd = 0;
        int numOfTrains = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of Trains: ", JOptionPane.QUESTION_MESSAGE));
        
        Train[] trains = new Train[numOfTrains];
        
        for (int i = 0; i < trains.length; i++) {
            int trainCarriages = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of carriagers for " + (i+1) + " train: ", JOptionPane.QUESTION_MESSAGE));
            trains[i] = new Train(trainCarriages);
            trains[i].ShowTrainInfo();
        }
        for (int i = 0; i < trains.length; i++) {
            if(trains[i].FindAmmountOfPassagers() < minTrain){
                minTrain = trains[i].FindAmmountOfPassagers();
                minTrainInd = trains[i].getTrainNumber();
            }
            if(trains[i].FindAmmountOfPassagers() >maxTrain)
            {
                maxTrain = trains[i].FindAmmountOfPassagers();
                maxTrainInd = trains[i].getTrainNumber();
            }
        }
        
        System.out.println(" Traint with the biggest ammount of passagers : " + maxTrainInd);
        System.out.println(" Traint with the smallest ammount of passagers : " + minTrainInd);
        
    }
    
}
