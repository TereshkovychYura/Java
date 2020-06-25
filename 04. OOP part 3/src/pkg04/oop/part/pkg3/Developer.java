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
abstract public class Developer implements IDrink, ICode {
    protected String name = "";
    protected String city = "";
    protected String position = "";
    protected int age = 0;
    protected int salary = 0;
    protected String[] skills = new String[5];
    private static int counter = 0;
    public Team team;
    
    public Developer(String name, String city, String position, int age, int salary, String TeamName){
        this.name = name;
        this.city = city;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.counter ++; 
        this.team = new Team(TeamName);
    }
    
    public Developer (){
         this.name = JOptionPane.showInputDialog(null, "Ender developer name", JOptionPane.QUESTION_MESSAGE);
         this.city = JOptionPane.showInputDialog(null, "Enter developer city: ", JOptionPane.QUESTION_MESSAGE);
         this.position = JOptionPane.showInputDialog(null, "Enter developer position: ", JOptionPane.QUESTION_MESSAGE);
         this.age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter developer age: ", JOptionPane.QUESTION_MESSAGE));
         this.salary = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter developer salary: ", JOptionPane.QUESTION_MESSAGE));
    }
    
    public void GetDeveloperInfo(){
        System.out.println("Name: " + this.name + "\nCity: " + this.city +
            "\nPosition: " + this.position + "\nAge: " + this.age + "\nSalary: " + this.salary + "\nTeam name: " + this.team.getTeamName());
        if(this.skills[1]!=null){
             System.out.println(this.name + " skills: ");
             
            for (int i = 0; i < this.skills.length; i++) {
                System.out.println(this.skills[i]);
            }
        }else{
             System.out.println(this.name + " has no skills.");
        }
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }
    
    public String getPosition(){
        return this.position;
    }
    
    public void setPosition( String position){
        this.position = position;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge( int age){
        this.age = age;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void setSkills(String[] skills){
        this.skills = skills;
    }
    
    public void CompareSalary (Developer dev1, Developer dev2)
    {
        if(dev1.getSalary() > dev2.getSalary()){
            System.out.println(dev1.getName() + " salary > " + dev2.getName() + " salary");
        }else if(dev1.getSalary() < dev2.getSalary()){
            System.out.println(dev1.getName() + " salary < " + dev2.getName() + " salary");
        }else{
            System.out.println(dev1.getName() + " salary = " + dev2.getName() + " salary");
        }
    }
    
    public int getCounter(){
        return this.counter;
    }
    class Team {
        private String TeamName;
        public Team( String TeamName){
            this.TeamName = TeamName;
        }
        public String getTeamName(){
            return this.TeamName;
        }
    }
}
