package com.cg.ohms.main;

import java.util.Scanner;

import com.cg.ohms.dto.CustomerDataDTO;
import com.cg.ohms.exception.HMSException;
import com.cg.ohms.service.IRegistration;
import com.cg.ohms.service.impl.RegistrationImpl;
import com.cg.ohms.utility.UserAddressValidator;
import com.cg.ohms.utility.UserDataValidator;
import com.cg.ohms.utility.UserInputValidator;

/**
 * Register main UI class
 * 
 * @author trainee
 *
 */
public class HmsMain {
	public static void main(String[] args) {
		// Main function to take all input from user and show the output
		String userInput = "";
		String state = "";
		IRegistration usersignup = null;
		UserInputValidator userinputcheck = null;
		System.out.println("Welcome to HotelBooking");
		while (true) {
			String email = "";
			String phone = "";
			System.out.println("Press 1 For Registration OR press 2 for exit");
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			userInput = scanner.next();
			switch (userInput) {
			case "1": {
				UserDataValidator uservalidation = new UserDataValidator();
				UserAddressValidator useraddress = new UserAddressValidator();
				try {
					System.out.println("Please enter Firstname");
					String firstName = scanner.next();
					uservalidation.isValidUserFirstName(firstName);
					CustomerDataDTO user = new CustomerDataDTO();
					user.setFirstname(firstName);
					System.out.println("Please enter lastname");
					String lastName = scanner.next();
					uservalidation.isValidUserSurName(lastName);
					user.setLastname(lastName);
					System.out.println("Please enter Password(can be min 4 and max 8 char long");
					String password = scanner.next();
					uservalidation.isValidPassword(password);
					user.setPassword(password);
					System.out.println("Please enter email");
					email = scanner.next();
					uservalidation.isValidEmail(email);
					user.setEmail(email);
					usersignup = new RegistrationImpl();
					System.out.println("Please enter Phone no");
					phone = scanner.next();
					uservalidation.isValidPhone(phone);
					user.setPhone(phone);
					usersignup.userValidation(email, phone);

					System.out.println("Please select your state");
					System.out.println("1.Rajasthan");
					System.out.println("2.Tamilnadu");
					System.out.println("3.Maharastra");
					System.out.println("4.Gujarat");
					String stateInput = scanner.next();
					userinputcheck = new UserInputValidator();
					switch (stateInput) {
					case "1":
						state = "Rajasthan";
						break;
					case "2":
						state = "Tamilnadu";
						break;
					case "3":
						state = "Maharastra";
						break;
					case "4":
						state = "Gujarat";
						break;
					default:
						userinputcheck.inputMismatch(stateInput);
					}
					user.setState(state);
					switch (stateInput) {
					case "1": {
						System.out.println("1.Jaipur");
						System.out.println("2.Ajmer");
						System.out.println("3.Jodhpur");
						System.out.println("4.Kota");
						break;
					}
					case "2": {
						System.out.println("1.Salem");
						System.out.println("2.Chennai");
						System.out.println("3.Madurai");
						System.out.println("4.Vellore");
						break;
					}
					case "3": {
						System.out.println("1.Mumbai");
						System.out.println("2.Pune");
						System.out.println("3.Nasik");
						System.out.println("4.Nagpur");
						break;
					}
					case "4": {
						System.out.println("1.Rajasthan");
						System.out.println("2.Ahmdabad");
						System.out.println("3.Surat");
						System.out.println("4.Rajkot");
					}
					}
					System.out.println("Please type your city");
					String city = scanner.next();
					useraddress.isValidCity(city);
					user.setCity(city);
					System.out.println("Please enter your city pincode");
					int pincode = scanner.nextInt();
					String cityPincode = String.valueOf(pincode);
					useraddress.isValidPincode(cityPincode);
					user.setPincode(pincode);
					System.out.println("Please enter your home no");
					String homeNo = scanner.next();
					useraddress.isValidHomeno(homeNo);
					user.setHomeno(homeNo);
					int userid = usersignup.userRegistration(user);
					System.out.println("Congratulation!! you are logged in to the system");
					System.out.println("Your Cust_ID is " + userid);
					System.out.println("press 2 if you want to exit");
					for (int uInput = 1; uInput <= 3; uInput++) {
						String input = scanner.next();
						if (input == "2") {
							System.exit(0);
						} else if (uInput == 3) {
							System.out.println("you have exceed maximum number of tries");
						} else {
							System.out.println("please enter correct detail");
						}
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "2": {
				System.exit(0);
				break;
			}
			default:
				System.out.println("please enter correct key");
			}
		}
	}
}