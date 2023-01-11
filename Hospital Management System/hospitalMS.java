import java.util.ArrayList;
import java.util.Scanner;

public class hospitalMS {
  static Boolean checkAdminPass(String adminPass) {
    return adminPass.equals("greenBay@12");
  }
  static Boolean checkDoctorPass(String doctorPass){
    return doctorPass.equals("doc@green2");
  }
public static void main(String[] args) {
    
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    
    int i;
    int z = 0;
    
    Patient patientZero = new Patient();
    patientZero.setName(0, "Charles", "Neale", 0);
    
    Scanner in = new Scanner(System.in);
    Scanner inte = new Scanner(System.in);
    Scanner bool = new Scanner(System.in);
    
    System.out.println("Welcome to Green Bay Medical Center Database!");
    System.out.println("Are you a Administrator or Doctor");
    String role = in.nextLine();
    
    if (role.equals("admin")) {
      for (i = 0; i < 3; i++) {
        System.out.println("Enter password:");
        String adminPass = in.nextLine();
        if (!checkAdminPass(adminPass)) {
          System.out.println("Incorrect Pass");
          if (i >= 2) {
            System.out.println("\n*** 3 Incorrect Inputs, Auto-Lockout ***");
            System.exit(0);
          }
        }
        if (checkAdminPass((adminPass))) {
          System.out.println("Valid Password");
          break;
        }
      }
      while (true) {
        System.out.println("Look up Patients(1), Add Patients(2), Look up Doctors(3), Add Doctors(4), or (Exit)");
        String lookUp = in.nextLine();
        if (lookUp.equals("1")) {
          System.out.println("Patients Database: ");
          System.out.println("---------------------------");
          System.out.println(patientZero);
          for (i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i) + " ");
          }
          System.out.println("---------------------------");   
        }
        if (lookUp.equals("2")) {
          for (i = 1; i < 100; i++) {
            z = z + 1;
            System.out.println("Enter Patient First Name: ");
            String fName = in.nextLine();
            System.out.println("Enter Patients last name: ");
            String lName = in.nextLine();
            System.out.println("Enter Money Owed: ");
            double mOwed = inte.nextDouble();
            Patient slr = new Patient();
            slr.setName(z, fName, lName, mOwed);
            patients.add(slr);
            System.out.println("If you would like to exit please type exit or you will automatically be asked to enter a new patient");
            String bQuestion = in.nextLine();
            if (bQuestion.equalsIgnoreCase("Exit")) {
              break;
            }
          }
        }
        if (lookUp.equals("3")) {
          System.out.println("Doctors are: ");
          if (doctors.size() == 0) {
        	  System.out.println("Last, First Name | Salary | Nurse?");
              System.out.println("----------------------------------");
              System.out.println("|     No Doctors Yet!     |");
            }
          System.out.println("----------------------------------");
          for (i = 0; i < doctors.size(); i++) {
        	System.out.println("Last, First Name | Salary | Nurse?");
        	System.out.println("----------------------------------");
            System.out.println(doctors.get(i) + " ");
            System.out.println("----------------------------------");
          }
        }
        if (lookUp.equals("4")) {
          System.out.println("How many doctors would you like to add? ");
          int docNum = inte.nextInt();
          for (i = 0; i < docNum; i++) {
            System.out.println("What is Doctor's first name? ");
            String dFname = in.nextLine();
            System.out.println("What is Doctor's last name? ");
            String dLname = in.nextLine();
            System.out.println("Salary: ");
            double doctorSalary = inte.nextDouble();
            System.out.print("Nurse? (true or false) ");
            boolean isNurse = bool.nextBoolean();
            Doctor plr = new Doctor();
            plr.setName(dFname, dLname, doctorSalary, isNurse);
            doctors.add(plr);
          }
        }
        if (lookUp.equals("exit")) {
          System.out.println("Bye!");
          break;
        }
      }
    }
    else if(role.equalsIgnoreCase("doctor")){
    	for (i = 0; i < 3; i++) {
    		System.out.println("Enter password:");
    		String doctorPass = in.nextLine();
    	    if (checkDoctorPass(doctorPass)) {
    	    	System.out.println("Valid Password");
    	        break;
    	     }
    	    }
      while (true) {
        System.out.println("Look up Patients(1), Add Patients(2), (Exit)");
        String lookUp = in.nextLine();
        if (lookUp.equals("1")) {
          System.out.println("Patients Database: ");
          if (patients.size() == 0) {
            System.out.println("---------------------------");
            System.out.println("|  No Patients Available  |");
          }
          System.out.println("---------------------------");
          for (i = 0; i < patients.size(); i++) {
            System.out.println(patients.get(i) + " ");
            System.out.println("---------------------------");
          }
        }
        else if (lookUp.equals("2")) {
          for (i = 1; i < 100; i++) {
            z = z + 1;
            System.out.println("Enter Patient First Name: ");
            String fName = in.nextLine();
            System.out.println("Enter Patients last name: ");
            String lName = in.nextLine();
            System.out.println("Enter Money Owed: ");
            int mOwed = inte.nextInt();
            Patient slr = new Patient();
            slr.setName(z, fName, lName, mOwed);
            patients.add(slr);
            System.out.println("If you would like to exit please type exit or you will automatically be asked to enter a new patient");
            String bQuestion = in.nextLine();
            if (bQuestion.equalsIgnoreCase("Exit")) {
              break;
            }
          }
        }if (lookUp.equals("exit")) {
          System.out.println("Bye!");
          break;
        }
      }
      
    }
  }
}
