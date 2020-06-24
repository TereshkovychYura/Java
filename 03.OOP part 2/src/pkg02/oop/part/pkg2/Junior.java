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
public class Junior extends Developer {
    private String fixLevel;
    private String writeCode;
    
    public Junior(String name, String city, String position, int age, int salary, String TeamName, String fixLevel, String writeCode){
        super(name, city, position, age, salary, TeamName);
        this.fixLevel = fixLevel;
        this.writeCode = writeCode;
    }
    
    public void GetDeveloperInfo(){
        System.out.println("Name: " + this.name + "\nCity: " + this.city +
            "\nPosition: " + this.position + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nTeam name: " + this.team.getTeamName() +
                "\nFix Level: " + this.fixLevel + "\nWrite Code: " + this.writeCode );
    }
}
