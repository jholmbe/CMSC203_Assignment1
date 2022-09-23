/* Class: CMSC203 CRN 23999 

 Program: Assignment #1 

 Instructor: Farnaz Eivazi 

 Summary of Description: Creating a quick wifi troubleshooter 

 Due Date: 09/22/22  

 Integrity Pledge: I pledge that I have completed the programming assignment independently. 

 I have not copied the code from a student or any source. 

Student’s Name: Justin Holmberg  */

import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		boolean flag = false;
		Scanner s = new Scanner(System.in);

		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work." + '\n');
		while (flag == false) {
			System.out.println("Reboot the computer and try to connect");
			if (Decision(flag, s))
				break;
			System.out.println("Reboot the router and try to connect");
			if (Decision(flag, s))
				break;
			System.out.println(
					"Make sure the cables connecting the router are firmly plugged in and power is getting to the router");
			if (Decision(flag, s))
				break;
			System.out.println("Move the computer closer to the router and try to connect");
			if (Decision(flag, s))
				break;
			System.out.println("Contact your ISP" + '\n');
			break;
		}
		s.close();
		System.out.println("Done" + '\n' + "Programmer: Justin Holmberg");
	}

	private static boolean Decision(boolean flag, Scanner sc) {
		final String problem = "Did that fix the problem? Y/N ";
		final String invalid = "Invalid input, try again. ";

		char ch = 'a';

		while (ch != 'Y' && ch != 'N') {
			System.out.println(problem);
			ch = sc.next().charAt(0);

			if (ch != 'Y' && ch != 'N') {
				System.out.println(invalid + '\n');
			}
		}

		if (ch == 'Y') {
			flag = true;
		}

		return flag;
	}
}
