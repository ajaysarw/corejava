package academy.learn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var scanner = new Scanner(System.in);

        // 2nd
        System.out.println(Doctor.intro());

        //3rd
        var userInput = "";
        while(!userInput.equalsIgnoreCase("quit")) {
            userInput = scanner.nextLine();
        }

        scanner.close();
    }
}
