/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class Part1 {
/*References

Oracle (n.d.) Java documentation. Available at: https://docs.oracle.com/en/java/ (Accessed: 17 September 2026).

Oracle (n.d.) Scanner (Java Platform SE). Available at: https://docs.oracle.com/en/java/javase/ (Accessed: 17 September 2026).

W3Schools (n.d.) Java tutorial. Available at: https://www.w3schools.com/java/ (Accessed: 17 September 2026).

*/
    
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        System.out.println("=== Chat App: Registration ===");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter username (must contain '_' and be <= 5 characters): ");
        String username = scanner.nextLine();

        System.out.print("Enter password (min 8 chars, 1 capital, 1 number, 1 special char): ");
        String password = scanner.nextLine();

        System.out.print("Enter South African cell number (e.g. +27735687493): ");
        String cellPhoneNumber = scanner.nextLine();

        Login login = new Login(firstName, lastName, username, password, cellPhoneNumber);

        System.out.println();
        System.out.println(login.getUsernameMessage());
        System.out.println(login.getPasswordMessage());
        System.out.println(login.getCellPhoneMessage());

        if (login.checkUserName() && login.checkPasswordComplexity() && login.checkCellPhoneNumber()) {
            login.registerUser();
            System.out.println("Registration successful!");

            System.out.println();
            System.out.println("=== Chat App: Login ===");
            System.out.print("Enter username: ");
            String loginUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String loginPassword = scanner.nextLine();

            boolean success = login.loginUser(loginUsername, loginPassword);
            System.out.println(login.returnLoginStatus(success));
        } else {
            System.out.println("Registration failed. Please fix the errors above and try again.");
        }

        scanner.close();
    }
}
