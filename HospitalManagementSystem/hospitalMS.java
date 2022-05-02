package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class hospitalMS {
  static Boolean checkAdminPass(String adminPass) {
    return adminPass.equals("greenBay@12");
  }
  static Boolean checkDoctorPass(String doctorPass){
    return doctorPass.equals("doc@green2");
  }
  static checkPatientDB(String patientFirstName, String patientLastName){
    return null;
  }

  public static void main(String[] args) {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
    int i;
    int z = 0;
    System.out.println("Welcome to Green Bay Medical Center Database!");
    Scanner in = new Scanner(System.in);
    Scanner inte = new Scanner(System.in);
    Scanner bool = new Scanner(System.in);
    System.out.println("Are you a Administrator, Doctor, Patient, or Receptionist");
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
        System.out.println("Look up Patients, Add Patients, Look up Doctors, or Add Doctors (Exit)");
        String lookUp = in.nextLine();
        if (lookUp.equals("patients")) {
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
        if (lookUp.equals("add")) {
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
            System.out.println(
                "If you would like to exit please type exit or you will automatically be asked to enter a new patient");
            String bQuestion = in.nextLine();
            if (bQuestion.equalsIgnoreCase("Exit")) {
              break;
            }
          }
        }
        if (lookUp.equals("doctors")) {
          System.out.println("How many doctors would you like to add? ");
          int docNum = inte.nextInt();
          for (i = 0; i < docNum; i++) {
            System.out.println("What is Doctor's first name? ");
            String dFname = in.nextLine();
            System.out.println("What is Doctor's last name? ");
            String dLname = in.nextLine();
            System.out.print("Nurse? (true or false) ");
            boolean isNurse = bool.nextBoolean();
            Doctor plr = new Doctor();
            plr.setName(dFname, dLname, isNurse);
            doctors.add(plr);
          }
        }
        if (lookUp.equals("look")) {
          System.out.println("Doctors are: ");
          System.out.println("---------------------------");
          for (i = 0; i < doctors.size(); i++) {
            System.out.println(doctors.get(i) + " ");
          }
          System.out.println("---------------------------");
        }
        if (lookUp.equals("exit")) {
          System.out.println("Bye!");
          break;
        }
        break;
      }
    }
    else if(role.equalsIgnoreCase("doctor")){
      for (i = 0; i < 3; i++) {
        System.out.println("Enter password:");
        String doctorPass = in.nextLine();
        if (!checkDoctorPassss(doctorPass)) {
          System.out.println("Incorrect Pass");
          if (i >= 2) {
            System.out.println("\n*** 3 Incorrect Inputs, Auto-Lockout ***");
            System.exit(0);
          }
        }
        if (checkAdminPass((doctorPass))) {
          System.out.println("Valid Password");
          break;
        }
      }
      while (true) {
        System.out.println("Look up Patients, Add Patients, Look up Medication(Exit)");
        String lookUp = in.nextLine();
        if (lookUp.equals("patients")) {
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
        if (lookUp.equals("add")) {
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
            System.out.println(
                "If you would like to exit please type exit or you will automatically be asked to enter a new patient");
            String bQuestion = in.nextLine();
            if (bQuestion.equalsIgnoreCase("Exit")) {
              break;
            }
          }
        }if (lookUp.equals("exit")) {
          System.out.println("Bye!");
          break;
        }
        break;
      }
      
    }
    else if(role.equalsIgnoreCase("patient")){
        System.out.println("Are you a pre-existing patient? True or False");
        Boolean preExistingPatient = bool.nextBoolean();
        if(preExistingPatient){
          System.out.println("First Name: ");
          String patientFirstName = in.nextLine();
          System.out.println("Last Name: ");
          String patientLastName = in.nextLine();
          checkPatientDB(patientLastName, patientLastName);
        }
        System.out.println("First Name: ");
        String newPatientFirstName = in.nextLine();
        System.out.println("Last Name: ");
        String newPatientLastName = in.nextLine();
        Patient slr = new Patient();
            slr.setNewName(newPatientFirstName, newPatientLastName);
            patients.add(slr);
            System.out.println(
                "If you would like to exit please type exit or you will automatically be asked to enter a new patient");
            String bQuestion = in.nextLine();
            if (bQuestion.equalsIgnoreCase("Exit")) {
              break;
            }
    }
  }
}