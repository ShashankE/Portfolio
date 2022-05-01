package com.company;

class Doctor{
    int id;
    String fname;
    String lname;
    Boolean qNurse;
    void insert(int i, String f, String l) {
        id = i;
        fname = f;
        lname = l;
    }
    void setName(String dFname, String dLname, boolean isNurse){
        fname = dFname;
        lname = dLname;
        qNurse = isNurse;
    }

    public String toString(){
        return "| "+lname+", "+fname+" | "+ qNurse +" | ";
    }
}
