/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05.jcf;

/**
 *
 * @author George
 */
public class Passenger {
    private String Name;
    private int documentNumber;
    private int flightNumber;

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getName() {
        return Name;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
}
