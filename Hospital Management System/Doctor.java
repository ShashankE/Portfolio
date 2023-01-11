class Doctor{
    
    int id;
    double dSalary;
    String fname;
    String lname;
    Boolean qNurse;

    void setName(String dFname, String dLname, double doctorSalary, boolean isNurse){
        fname = dFname;
        lname = dLname;
        dSalary = doctorSalary;
        qNurse = isNurse;
    }

    public String toString(){
        return "| "+lname+", "+fname+" | "+ dSalary +" | "+qNurse+" |";
    }
}

