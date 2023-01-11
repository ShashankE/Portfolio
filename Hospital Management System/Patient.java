class Patient {
    
    int id;
    String fname;
    String lname;
    double moneyOwed;
    
    void setName(int i, String f, String l, double s) {
        id = i;
        fname = f;
        lname = l;
        moneyOwed = s;
    }
    
    public String toString(){
        return "| "+id+" |"+lname+", "+fname+" | "+ moneyOwed +" | ";
    }
}
