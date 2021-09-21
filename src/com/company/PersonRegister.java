package com.company;

import java.util.ArrayList;

public class PersonRegister extends Person {
    private ArrayList<Person> personlista;
    private Person persLista[];

    public PersonRegister() {
    this.personlista = new ArrayList<Person>();
    }
    public PersonRegister(String namn, String adress, String telefonnummer, String personnummer) {
        super(namn, adress, telefonnummer, personnummer);
        this.personlista = new ArrayList<Person>();
    }

    public void addPerson(Person p) {
        personlista.add(p);
    }

    public void printLista() {
        for(int i = 0; i < personlista.size(); i++) {
            System.out.println(personlista.get(i).toString());
        }
    }
    public void printNamn() {
        for(int i = 0; i < personlista.size(); i++ ) {
            System.out.println(personlista.get(i).getNamn());
        }
    }








}
