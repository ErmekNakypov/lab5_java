/*Program output:

List of employees:
Developer: id=1, name='Ermek', salary=450.0, salaryBonus=150.0, performanceIndicator=27.3624, dateOfEmployment=2023-01-12
Developer: id=2, name='Tom', salary=3550.0, salaryBonus=550.0, performanceIndicator=35.956999999999994, dateOfEmployment=2012-01-23
Manager: id=3, name='Arnas', salary=440.0, salaryBonus=40.0, performanceIndicator=3.5795999999999997, dateOfEmployment=2022-02-20
Manager: id=4, name='Luffy', salary=1040.0, salaryBonus=140.0, performanceIndicator=7.033600000000001, dateOfEmployment=2020-05-11
Seller: id=5, name='Uluk', salary=370.0, salaryBonus=70.0, performanceIndicator=3.1088, dateOfEmployment=2023-07-30
Seller: id=6, name='Zoro', salary=2650.0, salaryBonus=350.0, performanceIndicator=5.788800000000001, dateOfEmployment=2023-08-15

Performance info of employees:
1 Ermek 27.3624
2 Tom 35.956999999999994
3 Arnas 3.5795999999999997
4 Luffy 7.033600000000001
5 Uluk 3.1088
6 Zoro 5.788800000000001

Salary info of managers:
3 Arnas 400.0 40.0
4 Luffy 900.0 140.0

Salary info of sellers:
5 Uluk 300.0 70.0
6 Zoro 2300.0 350.0

Salary info of developers:
1 Ermek 300.0 150.0
2 Tom 3000.0 550.0

List of employees:
Developer: id=1, name='Ermek', salary=450.0, salaryBonus=150.0, performanceIndicator=27.3624, dateOfEmployment=2023-01-12
Developer: id=2, name='Tom', salary=3550.0, salaryBonus=550.0, performanceIndicator=35.956999999999994, dateOfEmployment=2012-01-23
Manager: id=3, name='Arnas', salary=440.0, salaryBonus=40.0, performanceIndicator=3.5795999999999997, dateOfEmployment=2022-02-20
Manager: id=4, name='Luffy', salary=1040.0, salaryBonus=140.0, performanceIndicator=7.033600000000001, dateOfEmployment=2020-05-11
Seller: id=5, name='Damir', salary=410.0, salaryBonus=10.0, performanceIndicator=3.1088, dateOfEmployment=2023-07-30
Seller: id=6, name='Zoro', salary=2650.0, salaryBonus=350.0, performanceIndicator=5.788800000000001, dateOfEmployment=2023-08-15

List of employees:
Developer: id=1, name='Ermek', salary=450.0, salaryBonus=150.0, performanceIndicator=27.3624, dateOfEmployment=2023-01-12
Manager: id=3, name='Arnas', salary=440.0, salaryBonus=40.0, performanceIndicator=3.5795999999999997, dateOfEmployment=2022-02-20
Manager: id=4, name='Luffy', salary=1040.0, salaryBonus=140.0, performanceIndicator=7.033600000000001, dateOfEmployment=2020-05-11
Seller: id=5, name='Damir', salary=410.0, salaryBonus=10.0, performanceIndicator=3.1088, dateOfEmployment=2023-07-30
Seller: id=6, name='Zoro', salary=2650.0, salaryBonus=350.0, performanceIndicator=5.788800000000001, dateOfEmployment=2023-08-15

 */



package lab5.Task4;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        HRMSystem hrmSystem = new HRMSystem(); // creating the main object of the program

        Developer dev1 = new Developer();
        dev1.setId(1); // if you set invalid id(for example -3), program will stop and show an error message
        dev1.setName("Ermek"); // if the name is empty, program will stop and show an error message
        dev1.setDevLevel("Junior"); // if the devLevel is empty, program will stop and show an error message
        dev1.setItDepartment("Backend"); // if the itDepartment is empty, program will stop and show an error message
        dev1.setPerformanceIndicator(3.12); // if you set invalid PI(for example -3), program will stop and show an error message
        dev1.calcPerformanceIndicator();
        dev1.setSalary(300.0); // if you set invalid salary(for example -3), program will stop and show an error message
        dev1.setSalaryBonus(150.0); // if you set invalid salaryBonus(for example -3), program will stop and show an error message
        dev1.setDateOfEmployment(LocalDate.of(2023, Month.JANUARY, 12));

        Developer dev2 = new Developer();
        dev2.setId(2);
        dev2.setName("Tom");
        dev2.setDevLevel("Senior");
        dev2.setItDepartment("Front-end");
        dev2.setPerformanceIndicator(4.1);
        dev2.calcPerformanceIndicator();
        dev2.setSalary(3000.0);
        dev2.setSalaryBonus(550.0);
        dev2.setDateOfEmployment(LocalDate.of(2012, Month.JANUARY, 23));

        Manager man1 = new Manager();
        man1.setId(3);
        man1.setName("Arnas");
        man1.setPerformanceIndicator(1.14);
        man1.calcPerformanceIndicator();
        man1.setSalary(400.0);
        man1.setSalaryBonus(40.0);
        man1.setDateOfEmployment(LocalDate.of(2022, Month.FEBRUARY, 20));
        man1.setNumberOfSubordinates(7);

        Manager man2 = new Manager();
        man2.setId(4);
        man2.setName("Luffy");
        man2.setPerformanceIndicator(2.24);
        man2.calcPerformanceIndicator();
        man2.setSalary(900.0);
        man2.setSalaryBonus(140.0);
        man2.setDateOfEmployment(LocalDate.of(2020, Month.MAY, 11));
        man2.setNumberOfSubordinates(10);

        Seller sel1 = new Seller();
        sel1.setId(5);
        sel1.setName("Uluk");
        sel1.setPerformanceIndicator(2.32);
        sel1.calcPerformanceIndicator();
        sel1.setSalary(300.0);
        sel1.setSalaryBonus(70.0);
        sel1.setDateOfEmployment(LocalDate.of(2023, Month.JULY, 30));
        sel1.setSellingCountry("Korea");

        Seller sel2 = new Seller();
        sel2.setId(6);
        sel2.setName("Zoro");
        sel2.setPerformanceIndicator(4.32);
        sel2.calcPerformanceIndicator();
        sel2.setSalary(2300.0);
        sel2.setSalaryBonus(350.0);
        sel2.setDateOfEmployment(LocalDate.of(2023, Month.AUGUST, 15));
        sel2.setSellingCountry("Japan");

        hrmSystem.addEmployee(dev1); // if the object is empty(null), program will stop and show an error message
        hrmSystem.addEmployee(dev2); // if the object is empty(null), program will stop and show an error message
        hrmSystem.addEmployee(man1); // if the object is empty(null), program will stop and show an error message
        hrmSystem.addEmployee(man2); // if the object is empty(null), program will stop and show an error message
        hrmSystem.addEmployee(sel1); // if the object is empty(null), program will stop and show an error message
        hrmSystem.addEmployee(sel2); // if the object is empty(null), program will stop and show an error message

        hrmSystem.listOfEmployees(); // prints the list of employees
        System.out.println();

        hrmSystem.performanceInfo(); // prints the employees performance indicator
        System.out.println();

        hrmSystem.salaryManager(); // prints the salary of managers
        System.out.println();

        hrmSystem.salarySeller(); // prints the salary of sellers
        System.out.println();

        hrmSystem.salaryDeveloper(); // prints the salary of developers
        System.out.println();

        Seller newSel1 = new Seller();
        newSel1.setId(5);
        newSel1.setName("Damir");
        newSel1.setPerformanceIndicator(2.32);
        newSel1.calcPerformanceIndicator();
        newSel1.setSalary(400.0);
        newSel1.setSalaryBonus(10.0);
        newSel1.setDateOfEmployment(LocalDate.of(2023, Month.JULY, 30));
        newSel1.setSellingCountry("Russia");

        hrmSystem.editEmployee(newSel1, 5); // if you pass invalid id or empty(null) object, program will stop and show an error message

        hrmSystem.listOfEmployees();
        System.out.println();

        hrmSystem.deleteById(2); // if you pass invalid id, program will stop and show an error message

        hrmSystem.listOfEmployees();
    }
}
