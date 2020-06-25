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
public class Midle extends Developer {
    private String fixLevel;
    private String writeCode;
    private int numberOfProjects;
    
    public Midle(String name, String city, String position, int age, int salary, String TeamName, String fixLevel, String writeCode, int numberOfProjects){
        super(name, city, position, age, salary, TeamName);
        this.fixLevel = fixLevel;
        this.writeCode = writeCode;
        this.numberOfProjects = numberOfProjects;
    }
    
    public void GetDeveloperInfo(){
        System.out.println("Name: " + this.name + "\nCity: " + this.city +
            "\nPosition: " + this.position + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nTeam name: " + this.team.getTeamName() +
                "\nFix Level: " + this.fixLevel +"\nNumber of projects " + this.numberOfProjects + "\nWrite Code: " + this.writeCode );
    }

    @Override
    public void Drink(String drink) {
        String[] drinks = new String [5];
        drinks[0] = "Tea";
        drinks[1] = "Coffe";
        drinks[2] = "Water";
        drinks[3] = "Milk";
        drinks[4] = "Cola";
        
        for (int i = 0; i < drinks.length; i++) {
            if(drinks[i] == drink ){
                System.out.println(this.name + " drinks " + drink);
                return;
            }
        }
        System.out.println(this.name + " permition denied for " + drink);
    }

    @Override
    public void WriteCode() {
        System.out.println(this.name + " can write code using Junior.");
    }
}
