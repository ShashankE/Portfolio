package com.company;

class Patient {
    int id;
    String fname;
    String lname;
    float moneyOwed;

    void setName(int i, String f, String l, float s) {
        id = i;
        fname = f;
        lname = l;
        moneyOwed = s;
    }
    public String toString(){
        return "| "+id+" |"+lname+", "+fname+" | "+ moneyOwed +" | ";
    }

}
