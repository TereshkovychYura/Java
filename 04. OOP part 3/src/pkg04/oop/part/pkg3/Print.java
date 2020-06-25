/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg04.oop.part.pkg3;

/**
 *
 * @author George
 */
public class Print <T1,T2> {
    private T1 X;
    private T2 Y;
    
    public Print(T1 x, T2 y){
        this.X = x;
        this.Y = y;
    }
    
    public void UserPrint(){
        System.out.println("X = " + this.X + "\nY = " + this.Y);
    }
    
    public void setX(T1 newX){
        this.X = newX;
    }
    
    public void setY(T2 newY){
        this.Y = newY;
    }
}
