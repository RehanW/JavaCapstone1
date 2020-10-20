package Task7;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjectManagementSystem {

    public static void main(String[] args) {

        // Create arrayList for projects
        ArrayList<Project> projects = new ArrayList<>();
        Project winchester = new Project("Winchester", 1, "Apartment", 1530360.81, "21 Dec 2021");
        Project adams = new Project("Adams", 2, "Apartment", 800000.53, "25 Jan 2021");

        // Create arrayList for people
        ArrayList<Person> people = new ArrayList<>();
        Person james = new Person(1, "Architect", "James Taylor", "084 557 8964", "jamestaylor@gmail.com", "42 Ridge Road");
        Person dean = new Person(2, "Client", "Dean Winchester", "084 555 3217", "deanwinchester@gmail.com", "23 Oblivion Road");
        Person sam = new Person(3, "Contractor", "Sam Winchester", "083 555 7123", "samwinchester@gmail.com", "23 Ostrich Road");

        // add the objects created to their respected lists
        projects.add(winchester);
        projects.add(adams);
        people.add(james);
        people.add(dean);
        people.add(sam);

        // Create a bool variable to run our while statement on
        boolean choice = true;

        // while statement to run the "app"
        while (choice) {
            Scanner input = new Scanner(System.in);
            System.out.println("Do you want to edit or add a project, change a persons' details or finalize a Project? (Enter edit, add, change, finalize or no to exit): ");
            String answer = input.nextLine();

            // Switch case to run the program logic
            switch (answer) {
                case "no":                  // if the case = no
                    choice = false;         // bool set to false
                    break;                  // break to restart the while loop

                case "edit":                // if the case = edit
                    System.out.println("Which project would you like to edit? (Enter the project ID): ");
                    int editAns = Integer.parseInt(input.nextLine());
                    System.out.println(projects.get(editAns - 1));
                    System.out.println("Would you like to edit due date or fees paid? (Enter d for date or f for fees): ");
                    String editAns2 = input.nextLine();

                    // Here we will run a logic test with if statements to tell the program what to do next depending on the outcome of the tests
                    // if test results in d
                    if (editAns2.equals("d")) {
                        Project pro = projects.get(editAns - 1);
                        System.out.println("Please enter the new deadline: ");
                        String newDeadLine = input.nextLine();
                        pro.setDeadline(newDeadLine);
                        System.out.println(projects.get(editAns - 1));
                    }

                    // else if the test results in f
                    else if(editAns2.equals("f")){
                        Project pro = projects.get(editAns - 1);
                        System.out.println("Please enter the fees paid: ");
                        int newFeesPaid = Integer.parseInt(input.nextLine());
                        pro.setProjectFeesPaid(newFeesPaid);
                        pro.setProjectFeesToBePaid(pro.getProjectCost() - newFeesPaid);
                        System.out.println(projects.get(editAns - 1));
                    }

                    // else if the test failed
                    else {
                        System.out.println("this project does not exist");
                    }

                    break;                  // break to restart the while loop

                case "add":                 // if the case = add
                    Project pro = new Project();    // define a new Project object to be added

                    // prompt to set the name
                    System.out.println("Enter the new Project's name: ");
                    String projName = input.nextLine();
                    pro.setProjectName(projName);

                    // prompt to set the project number
                    System.out.println("Enter the new Project's number: ");
                    int projNum = Integer.parseInt(input.nextLine());
                    pro.setProjectNum(projNum);

                    // prompt to set the type
                    System.out.println("Enter the new Project's type: ");
                    String projType = input.nextLine();
                    pro.setTypeOfBuilding(projType);

                    // prompt to set the cost
                    System.out.println("Enter the new Project's cost: ");
                    int projCost = Integer.parseInt(input.nextLine());
                    pro.setProjectCost(projCost);

                    // prompt to set the deadline
                    System.out.println("Enter the new Project's deadline: ");
                    String projDeadline = input.nextLine();
                    pro.setDeadline(projDeadline);

                    // adding it to the arrayList of projects
                    projects.add(pro);

                    // displaying the arrayList of projects to show it did add the project
                    System.out.println(projects.get(projNum - 1));

                    break;                  // break to restart the while loop

                case"change":               // if the case = change
                    System.out.println(people);     // show available people to change

                    // prompt the user for an id of the person they wish to change
                    System.out.println("Which person would you like to edit? (Enter the person ID): ");
                    int id = Integer.parseInt(input.nextLine());
                    Person person = people.get(id - 1);
                    System.out.println(people.get(id -1));

                    // prompt the user for new contact info
                    System.out.println("Please enter a new phone number: ");
                    String telnum = input.nextLine();
                    person.setTelNum(telnum);
                    System.out.println("Please enter a new email address: ");
                    String email = input.nextLine();
                    person.setEmail(email);

                    // display the person to show changes that took place
                    System.out.println(people.get(id - 1));

                    break;                  // break to restart the while loop

                case"finalize":             // if the case = finalize

                    // Shows the projects available to be finalized and prompts the user for the project number
                    System.out.println(projects);
                    System.out.println("Please enter the project number of project to be finalized: ");
                    int finalizePro = Integer.parseInt(input.nextLine());
                    System.out.println(projects.get(finalizePro - 1));

                    // Test if the project has been paid in full or not
                    // if test result is not paid in full
                    if(projects.get(finalizePro - 1).getProjectFeesToBePaid() != 0) {

                        // set the information to be displayed on the invoice
                        String proName = projects.get(finalizePro - 1).getProjectName();
                        String proFee = "Amount to be paid: " + "R" + projects.get(finalizePro - 1).getProjectFeesToBePaid();

                        System.out.println(people);
                        System.out.println("Please enter the person ID of the client who's project  is to be finalized: ");
                        int finalizeCust = Integer.parseInt(input.nextLine());
                        System.out.println(people.get(finalizeCust - 1));
                        String custContact = "Tel nr: " + people.get(finalizeCust - 1).getTelNum() + "\t" + "email: " + people.get(finalizeCust - 1).getEmail();

                        // Display the invoice that will be printed
                        System.out.println("Thank you Mr/Mrs " + proName + " for your business, Please find below the invoice" + "\n\n"
                                + custContact + "\n\n" + proFee);
                    }

                    // if test results in paid in full
                    else{
                        System.out.println("The full amount has already been paid, no invoice to generate!");
                    }

                    break;                  // break to restart the while loop

                default:                    // default case
                    System.out.println("Invalid input");
                    break;                  // break to restart the while loop
            }
        }


    }
}

