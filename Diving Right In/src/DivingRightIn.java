import java.util.Scanner;
public class DivingRightIn {

	public static void main(String[] args) 
	{
	System.out.println("Hello user, what is your name?");
	java.util.Scanner userInput = new Scanner (System.in);
	String name = userInput.nextLine();
	System.out.println("Hello " + name + "! What year were you born in?");
	java.util.Scanner userInput2 = new Scanner (System.in);
	int birthyear = userInput2.nextInt();
	if (birthyear > 2017)
		{
		System.out.println("That year doesn't exist bro");
		System.exit(0);
		}
	else 
		{
		System.out.println("Awesome! And how old are you?");
		}
	java.util.Scanner userInput3 = new Scanner (System.in);
	int age = userInput3.nextInt();
	if (age == 17)
		{
		System.out.println("Wow " + age + "! You're almost an adult!!!");
		}
	else if (age > 17)
		{
		System.out.println("Dang old man. " + age + " is basically ancient.");
		}
	else if (age < 17)
		{
		System.out.println("Wow " + age + " is pretty young. You still got your whole life ahead of you.");
		}
	for (int i = 0; i <= age; i++)
		{
		if (i == 1)
			{
			System.out.println("In " + ((birthyear) + i) + " you were " + i + " year old.");
			}
		else 
			{
			System.out.println("In " + ((birthyear) + i) + " you were " + i + " years old.");
			}
		}
	}

}
