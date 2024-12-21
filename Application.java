package example.ex01;


/// 1. Interface IEmployee
/// 2. Abstract Class Employee
/// 3. PartTimeEmployee
/// 4. FullTimeEmployee


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

///
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = true;

        // Danh sách để lưu các Employee
        List<Employee> employees = new ArrayList<>();
        String name;
        int paymentPerHour, workingHour;

        while (check){
            System.out.println("------------------------------------- EMPLOYEE MANAGEMENT -------------------------------------");
            System.out.println("1. Add Full Time Employee");
            System.out.println("2. Add Part Time Employee");
            System.out.println("3. Display Information");
            System.out.println("4. Search Employee");
            System.out.println("5. Exit");
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Add Full Time Employee");
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter payment per hour: ");
                    paymentPerHour = Integer.parseInt(scanner.nextLine());

                    FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(name, paymentPerHour);
                    employees.add(fullTimeEmployee);

                    break;
                case 2:
                    System.out.println("Add Part Time Employee");
                    System.out.print("Enter name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter payment per hour: ");
                    paymentPerHour = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter working hour: ");
                    workingHour = Integer.parseInt(scanner.nextLine());

                    PartTimeEmployee partTimeEmployee = new PartTimeEmployee(name, paymentPerHour, workingHour);
                    employees.add(partTimeEmployee);
                    break;
                case 3:
                    System.out.println("Display Information");
//                    for (Employee employee : employees) {
//                        System.out.println("Employee: " + employee.getName() + " has the salary: " + employee.calculateSalary());
//                    }

                    for(int i = 0; i < employees.size(); i++){
                        System.out.println("Employee: " + employees.get(i).getName() + " has the salary: " + employees.get(i).calculateSalary());
                    }
                    break;
                case 4:
                    System.out.println("Search Employee");
                    System.out.print("Enter name to search: ");
                    name = scanner.nextLine();
//                    for (Employee employee : employees) {
//                        if (employee.getName().equals(name)) {
//                            System.out.println("Employee " + employee.getName() + " " + employee.calculateSalary());
//                            break;
//                        }
//                    }

                    for(int i = 0; i < employees.size(); i++){
                        if(employees.get(i).getName().equals(name)){
                            System.out.println("Employee " + employees.get(i).getName() + " " + employees.get(i).calculateSalary());
                            break;
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit");
                    check = false;
                    break;
            }
        }
    }
}
