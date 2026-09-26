package encouragement_APP;
import java.util.Scanner;

public class Encouragement_APP {
	static Scanner userinput = new Scanner(System.in);
	public static void main(String[] args) {
		//variables
		int age;
		String howDoing;
		//Print statements
		System.out.println("How old are you?");
		age = userinput.nextInt();
		userinput.nextLine(); //This is needed to clear the extra enter key because line 12 and 15 operate together wierd.
		System.out.println("How are you doing today?");
		howDoing = userinput.nextLine();
		
		//Process information
		Boolean good = howDoing.contains("good") || howDoing.contains("well") || howDoing.contains("Good") || howDoing.contains("great")
				|| howDoing.contains("Great");
		Boolean alright = howDoing.contains("OK") || howDoing.contains("ok") || howDoing.contains("Alright") || howDoing.contains("alright") 
				|| howDoing.contains("Fine") || howDoing.contains("fine");
		Boolean amazing = howDoing.contains("Amazing") || howDoing.contains("amazing"); 
		Boolean bad = howDoing.contains("not") && good;
		Boolean reQuestion = howDoing.contains("How") && howDoing.contains("you") && howDoing.contains("doing") && howDoing.contains("?");
		
		//Print final statements
		System.out.println("You are " + age + " years old.");
		if (good && !bad) {
			System.out.println("It's great to know that you are doing well today. \nI hope that you continue to have a great day!");
		} else if (amazing) {
			System.out.println("It is absolutely amazing to know that you're day is \namazing! Continue to have a great day!");
		} else if (alright) {
			System.out.println("It's good to know that you're not having the worst \nday but also not the best. Hopefully things "
					+ "will go better for you the rest of today");
		} else if (bad) {
			System.out.println("Aww, that's too bad. It's hard to hearr that today \nisn't your best day. I pray that things will "
					+ "turn around for you.");
		} else {
			System.out.println("It's good to hear from you how your day is going.");
		}
		if (reQuestion) {
			System.out.println("I am doing wonderful today! In fact, even better now \nthat you asked me, thanks for asking!");
		}
		
	}

}
