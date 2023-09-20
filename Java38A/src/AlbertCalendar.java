
public class AlbertCalendar {

	public static void main(String[] args) {
		//variable
		String day = "Monday";
		System.out.println("Hey, are your free on " + day + "? \n");
		
		System.out.println("Hmm, let me check my calendar.\n");
		
		//process and output
		switch (day) {
			case "Monday":
				System.out.println("Sorry, I have to stay at work late.");
				break;
			case "Tuesday":
				System.out.println("It looks like I have meetings all day.");
				break;
			case "Wednesday":
				System.out.println("I have a dentist appointment. Some other time!");
				break;
			case "Thursday":
				System.out.println("Sorry, thursday is date night!");
				break;
			case "Friday", "Saturday", "Sunday":
				System.out.println("I'm free!!");
				break;
			default:
				System.out.println("That's not a day.");
		}

	}

}
