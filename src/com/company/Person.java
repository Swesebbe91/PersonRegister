package com.company;

public abstract class Person {

    private String namn, adress, telefonnummer, personnummer; //attribute


    public Person() { //default
        this.namn =  "okänd";
        this.adress = "okänd";
        this.telefonnummer = "okänd";
        this.personnummer = "okänd";
    }

    public Person(String namn, String adress) { //constructor med två standardparametrar
        this.namn = namn;
        this.adress = adress;
        this.telefonnummer = "okänd";
        this.personnummer = "okänd";
    }

    public Person(String namn, String adress, String telefonnummer, String personnummer) {
        this.namn = namn;
        this.adress = adress;
        this.telefonnummer = telefonnummer;
        this.personnummer = personnummer;
    }

    public String getNamn() {
        return namn;
    }

    public String getAdress() {
        return adress;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    @Override
    public String toString() {
        String s = String.format("Personens namn är: %s och bor i: %s! %s's telefonnummer är: %s med personnummer är %s:",
        this.namn, this.adress, this.namn, this.telefonnummer, this.personnummer);
        return s;
    }





}
