package com.company;

import java.util.Scanner;

public class Student extends Person {
    private int studielån;

    public Student() {
        this.studielån = 0;

    }

    public Student(String namn, String adress, String telefonnummer, String personnummer, int studielån) {
        super(namn, adress, telefonnummer, personnummer);
        this.studielån = studielån;
    }

    public int getStudielån() {
        return studielån;
    }

    public void setStudielån(int studielån) {
        this.studielån = studielån;
    }

    public int studieskuld(int nyttLån) {
        studielån += nyttLån;
        return studielån;


    }

    @Override
    public String toString() {
        String s = String.format("%s%n %s har ett studentlån på: %s kr", super.toString(), this.getNamn(), this.studielån);
        return s;
    }


}
