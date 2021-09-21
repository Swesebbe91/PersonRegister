package com.company;

public class Anställd extends Person {
    private int lön;

    public Anställd() {
        this.lön = 0;
    }

    public Anställd(String namn, String adress, String telefonnummer, String personnummer, int lön) {
        super(namn, adress,  telefonnummer,personnummer);
        this.lön = lön;
    }

    public int getLön() {
        return lön;
    }

    public void setLön(int lön) {
        this.lön = lön;
    }

    public int sättInLön(int nyLön) {
        lön += nyLön;
        return lön;
    }
    @Override
    public String toString() {
        String s = String.format("%s%n %s har lönen: %s", super.toString(), this.getNamn(), this.lön );
        return s;
    }


}
