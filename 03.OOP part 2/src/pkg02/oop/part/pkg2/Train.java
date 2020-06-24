/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02.oop.part.pkg2;

/**
 *
 * @author George
 */
public class Train {
    private int trainNumber;
    private String trainName;
    private int amountCarriages;
    private int[] carriages;
    
    public Train(){
        this.trainName = "Rivne > Lviv";
        this.trainNumber = 865;
        this.amountCarriages = 10;
        this.carriages = new int[this.amountCarriages];
        for (int i = 0; i < this.carriages.length; i++) {
            this.carriages[i] = (int)(Math.random() * 54 +1);
        }
    }
    
    public Train(int amountCarriages){
        this.amountCarriages = amountCarriages;
        this.trainName = "Rivne > Lviv";
        this.trainNumber = (int)(Math.random() * 900 + 200);
        this.carriages = new int[this.amountCarriages];
        for (int i = 0; i < this.carriages.length; i++) {
            this.carriages[i] = (int)(Math.random() * 54 +1);
        }
    }
    
    public void ShowTrainInfo(){
        System.out.println("//-------------------------Train "+this.trainNumber+ "-------------------//");
        System.out.println("Amount of pasagers: " + this.FindAmmountOfPassagers());
        System.out.println("Amount of carriages: " + this.carriages.length);
        System.out.println("Carriage with the smallest amount of pasagers: " + this.FindSmallestCarriage());
        System.out.println("Carriage with the biggest amount of pasagers: " + this.FindbiggestCarriage());
        System.out.println("//----------------------------------------------------------------------//");
    }
    
    public int FindSmallestCarriage(){
        int min = 54, minInd = 0;
        for (int i = 0; i < this.carriages.length; i++) {
            if(carriages[i]<min){
                min = carriages[i];
                minInd = i;
            }
        }
        return (minInd+1);
    }
    
    public int FindbiggestCarriage(){
        int max = 1, maxInd = 0;
        for (int i = 0; i < this.carriages.length; i++) {
            if(carriages[i]>max)
            {
                max = carriages[i];
                maxInd = i;
            }
        }
        return (maxInd +1);
    }
    
    public int FindAmmountOfPassagers(){
        int amountOfpassenger = 0;
        for (int i = 0; i < this.carriages.length; i++) {
            amountOfpassenger += this.carriages[i];
        }
        return amountOfpassenger;
    }
    
    public int getTrainNumber(){
        return this.trainNumber;
    }
    

}
