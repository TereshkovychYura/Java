/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.jcf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author George
 */
public class JFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer>  arrayList = new ArrayList<Integer>();
        
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + "\t");
//        }
//        System.out.println("");
//        arrayList.add(4, 20);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + "\t");
//        }
//        System.out.println("");
//        arrayList.remove(5);
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + "\t");
//        }
//        System.out.println("");
        List<Integer> linkedList = new LinkedList<Integer>();
        
//        for (int i = 0; i < 10; i++) {
//            linkedList.add(i);
//        }
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i) + "\t");
//        }
//        System.out.println("");
//        linkedList.add(4, 20);
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i) + "\t");
//        }
//        System.out.println("");
//        linkedList.remove(5);
//        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i) + "\t");
//        }
//        System.out.println("");
//        System.out.println("==========CompareAddToBackTime==========");
//        CompareAddToBackTime(arrayList);
//        CompareAddToBackTime(linkedList);
//        System.out.println("==========CompareAddToFrontTime==========");
//        CompareAddToFrontTime(arrayList);
//        CompareAddToFrontTime(linkedList);
//        System.out.println("==========ComparePrintTime==========");
//        ComparePrintTime(arrayList);
//        ComparePrintTime(linkedList);
//        System.out.println("==========CompareRemoveFirstTime==========");
//        CompareRemoveFirstTime(arrayList);
//        CompareRemoveFirstTime(linkedList);
//        System.out.println("==========CompareRemoveLastTime==========");
//        CompareRemoveLastTime(arrayList);
//        CompareRemoveLastTime(linkedList);
                
//        Map<Integer, String> states = new HashMap<Integer,String>();
//        states.put(1, "Germany");
//        states.put(2, "Spain");
//        states.put(3, "France");
//        states.put(4, "Italy");
//        states.put(5, "Ukraine");


        List<Passenger> passengers = new ArrayList<Passenger>();
        Map<Integer,List<Passenger>> flights = new TreeMap<Integer,List<Passenger>>();

    }   
    
    public static void CompareAddToBackTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time => " + (finish - start));
    }
    
    public static void CompareAddToFrontTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0,i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time => " + (finish - start));
    }
    
    public static void ComparePrintTime(List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
         for (int i = 0; i < 100000; i++) {
           list.get(i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time => " + (finish - start));
    }
    
    public static void CompareRemoveFirstTime(List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           list.remove(0);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time => " + (finish - start));
    }
    
    public static void CompareRemoveLastTime(List<Integer> list){
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
           list.remove(999999-i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("Time => " + (finish - start));
    }
    
}
