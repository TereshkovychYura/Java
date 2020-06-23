/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01.intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class Intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Hello world");
        
        //System.out.println("Hello world");
        
        //JOptionPane.showMessageDialog(null,"Hello World");
        
        //System.out.print("Ender number : ");
        //int a = Integer.parseInt(buffered.readLine());
        //System.out.println("Resuld = " + a);
        
        //System.out.print("Ender first number : ");
        //int num1 = Integer.parseInt(buffered.readLine());
        
        //System.out.print("Ender second number : ");
        //int num2 = Integer.parseInt(buffered.readLine());
        
        //double result = (double)num1 / num2;
        //System.out.println("Result = " + result);
           
        
        //if(num1 < num2){
        //    System.out.println("num1 < num2");
        //}else if (num1 > num2){
        //    System.out.println("num1 > num2");
        //}else{
        //    System.out.println("num1 = num2");
        //}
        
        
        //String num1, num2;
        //num1 = JOptionPane.showInputDialog(null, "Ender first number", JOptionPane.QUESTION_MESSAGE);
        //num2 = JOptionPane.showInputDialog(null, "Ender second number", JOptionPane.QUESTION_MESSAGE);
        
        //int number1 = Integer.parseInt(num1);
        //int number2 = Integer.parseInt(num2);
        //
        //if(number1 < number2){
        //    JOptionPane.showMessageDialog(null, "num1 < num2");
        //}else if (number1 > number2){
        //    JOptionPane.showMessageDialog(null, "num1 > num2");
        //}else{
        //    JOptionPane.showMessageDialog(null, "num1 = num2");
        //}
        
        
        //int[] arr = new int[10];
        //for (int i = 0; i < arr.length; i++) {
        //    arr[i] = (int)(Math.random() *50 +1);
        //}
        //
        //  for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]);
        //}
        
        
//        int row = 5;
//        int col = 5;
//        int[][] arr = new int[row][col];
//        
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                arr[i][j] = (int)(Math.random() *50 + 1);
//            }
//            
//        }
//        
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(arr[i][j] + "\t");
//            }
//            System.out.println();
//        }


/////////////////////////////////////////----TASKS----////////////////////////////////////////////////////


//-------------------------------------1------------------------------------------

//    int[] arr = new int[3];
//    
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * -50 + 25);
//        }
//        
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]> 0)
//             System.out.println(arr[i] + " > 0");
//            else
//                System.out.println(arr[i] + " < 0");
//                
//        }
        
//---------------------------------2---------------------------------

//        System.out.print("Ender first number : ");
//        int num1 = Integer.parseInt(buffered.readLine());
//        System.out.print("Ender secont number : ");
//        int num2 = Integer.parseInt(buffered.readLine());
//        System.out.print("Ender third number : ");
//        int num3 = Integer.parseInt(buffered.readLine());
//        
//        int res = (num1 + num2 + num3) /3;
//        System.out.println("Result = " + res);
//        switch(res){
//            case 2: {
//                 System.out.println("BAD");
//                 break;
//            }
//            case 3: {
//                System.out.println("SO-SO");
//                break;
//            }
//            case 4: {
//                System.out.println("GOOD");
//                break;
//            }
//            case 5: {
//                System.out.println("EXCELLENT");
//                break;
//            }
//            default:{
//                break;
//            }
//        }      

//-------------------------------------3--------------------------

//        int num = 50;
//        int[] arr = new int[num];
//          
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * -600 + 300 );
//            System.out.print(arr[i] + "  ");
//        }
//        System.out.println();
//        int count = 0;
//        while (count != num) {            
//            if(arr[count]>0&&arr[count]%2==0&&arr[count]<201)
//            {
//                System.out.print(arr[count] + "  ");
//            }
//            count++;
//        }
        
//----------------------------------4-------------------------

//        int sum = 0,num, count = 0;
//        
//        do {            
//            System.out.print("Ender number : ");
//            num = Integer.parseInt(buffered.readLine());
//            sum +=num;
//            count++;
//        } while (count!=5);
//        System.out.println("Sum of your digits =  " + sum);
          
//------------------------------5------------------------------

//        int dice;
//        for (int i = 0; true; i++) {
//            dice = (int)(Math.random() * 6 + 1 );
//            System.out.println(dice);
//            if(dice == 2)
//            {
//                System.out.println("You get number '2' for " + (i+1) + " tryes");
//                break;
//            }
//        }

//----------------------------------hw.1--------------------------------------

//        int arr[] = new int[15];
//        int min = 50, max = 1;
//        int minInd = 0, maxInd = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 50 + 1 );
//            System.out.print(arr[i] + "  ");
//        }
//        System.out.println();
//    
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//                minInd = i;
//            }
//            if(arr[i]>max)
//            {
//                max = arr[i];
//                maxInd = i;
//            }
//        }
//        System.out.println("Min: " + min + "\nMax: " + max);
//        System.out.println("Min ind: " + minInd + "\nMax ind: " + maxInd);
//        for (int i = 0; i < arr.length; i++) {
//            if(i==minInd)
//            arr[i] = min;
//            if(i==maxInd)
//            arr[i] = max;
//            System.out.print(arr[i] + "  ");
//        }

//---------------------------hw.2-------------------------------

//        int arr[] = new int[15];
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int)(Math.random() * 10 + 1 );
//            System.out.print(arr[i] + "  ");
//        }
//        System.out.println();
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i] % 2!=0)
//                sum+=arr[i];
//        }
//        System.out.println("Sum of digits: " + sum);

//-----------------------------hw.3-----------------------------
//        int rows = 10;
//        int[] arr1 = new int[rows];
//        int[] arr2 = new int[rows];
//        System.out.println("Arr A: ");
//        for (int i = 0; i < rows; i++) {
//            arr1[i] = (int)(Math.random() * 9 + 1 );    
//            System.out.print(arr1[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Arr B: ");
//        for (int i = 0; i < rows; i++) {
//            arr2[i] = (int)(Math.random() * 9 + 1 );        
//            System.out.print(arr2[i] + " ");
//        }
//        System.out.println();
//        int[] arr3 =  new int[rows*2];
//        int count = 0;
//        for (int i = 0; i < arr3.length; i++) {
//            if(i<10)
//            {
//                arr3[i]=arr1[count];
//                count++;
//            }else{
//                if(count>9){
//                    count=0;
//                }
//                arr3[i]=arr2[count];
//                count++;
//            }
//        }
//        System.out.println("Arr C: ");
//        for (int i = 0; i < arr3.length; i++) {        
//            System.out.print(arr3[i] + " ");
//        }
        
        

//-------------------------------table-of-mult-------------------

//        for (int i = 2; i < 11; i++) {
//            for (int j = 2; j < 11; j++) {
//                System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//            }
//            System.out.println();
//        }

//      int[] A = new int[10];
//      int[] B = new int[10];
//      System.out.println("Arr [A] :");
//      for (int i = 0; i < A.length; i++) {
//          A[i] = (int)(Math.random() * 50 + 1 );          
//          System.out.print(A[i] +  "\t");
//      }
//      System.out.println();
//        
//                  System.out.println("Arr [B] :");
//      for (int i = 0; i < B.length; i++) {
//          B[i] = A[i];
//          System.out.print(B[i] +  "\t");
//      }
//      System.out.println();
        
    }
    
}
