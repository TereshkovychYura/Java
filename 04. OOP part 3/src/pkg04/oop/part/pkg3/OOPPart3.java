/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.oop.part.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class OOPPart3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Developer d = new Developer("Jack", "Rivne", "QA", 20, 400, "Java Dev Team");
//        Junior jack = new Junior("Jack", "Rivne", "QA", 20, 400, "Java Dev Team", "Starter", "Writing code with stackowerflow");
//        Midle bob = new Midle("Bob", "Rivne", "QA", 20, 400, "Java Dev Team", "Starter", "Writing code with stackowerflow", 5);
//        
//        jack.Drink("Tea");
//        
//        jack.WriteCode();
//        bob.WriteCode();

//          Print p = new Print(5, "Second");
//          
//          p.UserPrint();
//          
//          p.setX(true);
//          
//          p.setY(3.14);
//          
//          p.UserPrint();


//       SaleCard card = new SaleCard();
//       card.ShowSale();
//       card.BuyProducts(2300);
//       card.ShowSale();
//       card.MissingForNewSale();
//       card.BuyProducts(1753);
//       card.ShowSale();
//       card.MissingForNewSale();

        Car[] cars = new Car[5];
        String[] colors = {"Black", "Red", "Blue", "White", "Gray"};
        String[] makes = {"BMV", "Mersedes", "Audi", "Mazda", "Toyota"};
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(i, makes[i], "unknown", (2008+i), colors[i], (20000 + i * 1000), (int)(Math.random() * 900 + 200));
            cars[i].toString();
            System.out.println(cars[i].toString());
        }
        int chose = 0;
        for (;chose != 4;) {
            chose = Integer.parseInt(JOptionPane.showInputDialog(null, "1)Show cars make. \n2)Show cars which used more than n years. \n3)Show cars for price and year. \n4)Exit", JOptionPane.QUESTION_MESSAGE));
            switch(chose){
                case 1:{
                    String showO = "";
                    for (int i = 0; i < cars.length; i++) {
                        showO += (i+1) + ")"+ cars[i].getMake() + "\n";
                    }
                    JOptionPane.showConfirmDialog(null, showO, " Makes: ", JOptionPane.CLOSED_OPTION);
                }
                case 2:{
                    String showT = "";
                    int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year: ", JOptionPane.QUESTION_MESSAGE));
                    for (int i = 0; i < cars.length; i++) {
                        if((2020 - cars[i].getYear()) >= year)
                        showT += (i+1) + ")"+ cars[i].toString() + "\n";
                    }
                    JOptionPane.showConfirmDialog(null, showT, " Cars which used more than " + year + " years:", JOptionPane.CLOSED_OPTION);
                }
                case 3:{
                    String showTh = "";
                    int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year: ", JOptionPane.QUESTION_MESSAGE));
                    int price = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter year: ", JOptionPane.QUESTION_MESSAGE));
                    for (int i = 0; i < cars.length; i++) {
                        if(cars[i].getYear() == year && cars[i].getPrice() > price)
                        showTh += (i+1) + ")"+ cars[i].toString() + "\n";
                    }
                    JOptionPane.showConfirmDialog(null, showTh, " Cars " + year + " year whis cost more than " + price, JOptionPane.CLOSED_OPTION);
                }
            }
            
        }
         

    }
    
}
