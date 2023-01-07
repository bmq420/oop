package com.lab1.exersice4;

import java.util.Scanner;

//Exercise 4.4. PensionContributionCalculatorWithSentinel
public class PensionContributionCalculatorWithSentinel {
    public static void main(String[] args) {
        final int SALARY_CEILING = 6000;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        Scanner in = new Scanner(System.in);

        int salary = 0;
        while (salary != -1) {
            System.out.print("Enter the monthly salary ( or -1 to end): $");
            salary = Integer.parseInt(in.next());

            if (salary == -1) {
                break;
            }

            System.out.print("Enter the age: ");
            int age = Integer.parseInt(in.next());

            double contributableSalary = salary;
            double employeeContribution = 1;
            double employerContribution = 1;
            double totalContribution = 1;

            if (salary > SALARY_CEILING) {
                contributableSalary = SALARY_CEILING;
            }
            if (age <= 55) {
                findContribution(employeeContribution,
                        employerContribution,
                        totalContribution,
                        contributableSalary,
                        EMPLOYEE_RATE_55_AND_BELOW,
                        EMPLOYER_RATE_55_AND_BELOW);
            } else if (age <= 60) {
                findContribution(employeeContribution,
                        employerContribution,
                        totalContribution,
                        contributableSalary,
                        EMPLOYEE_RATE_55_TO_60,
                        EMPLOYER_RATE_55_TO_60);
            } else if (age <= 65) {
                findContribution(employeeContribution,
                        employerContribution,
                        totalContribution,
                        contributableSalary,
                        EMPLOYEE_RATE_60_TO_65,
                        EMPLOYER_RATE_60_TO_65);
            } else {
                findContribution(employeeContribution,
                        employerContribution,
                        totalContribution,
                        contributableSalary,
                        EMPLOYEE_RATE_65_ABOVE,
                        EMPLOYER_RATE_65_ABOVE);
            }
            System.out.println("");
        }
        System.out.println("Bye!");

        in.close();
    }

    public static void findContribution(double employeeContribution,
                                        double employerContribution,
                                        double totalContribution,
                                        double contributableSalary,
                                        double typeOfEmployee,
                                        double typeOfEmployer) {
        employeeContribution = contributableSalary * typeOfEmployee;
        employerContribution = contributableSalary * typeOfEmployer;
        totalContribution = employeeContribution + employerContribution;

        System.out.printf("The employee's findContribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's findContribution is: $%.2f%n", employerContribution);
        System.out.printf("The total findContribution is: $%.2f%n", totalContribution);
    }
}
