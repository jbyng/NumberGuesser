//Hey Brandon! Great talking with you today. I have my coding challenge written up, along with the comments as discussed.
//I cover a lot in these comments, I wrote them as if I was talking to someone with no coding experience whatsoever.


//In Java, the code you write has to be kept very organized to work as a program.
package net.jbyng;
//This is why we see this line above. What it's saying is that this java file we're writing on is kept in the "net.jbyng" package.
//You can think of packages as folders that hold the files.



//Now, there are special tools that can only be used when you request to use them.
import java.util.Random;
import java.util.Scanner;
//As you can see above, we had two tools that needed to be imported for our challenge. These are called Random and Scanner, which we'll talk more about later.




//As I mentioned earlier, Java is a very organized language. All of the code you write must be under a "class" as well.
public class NumberGuessingGame {
//The class defines the name of the file, and gives a clear start and stop to your code.
//You may also notice a curly bracket after "NumberGuessingGame". These curly brackets "contain" your code written, as you'll see one at the end as well.
	
	
	
//Within the class, you'll usually see this as well. The real reason this is needed is a bit more complicated, but essentially it's just
//stating "this is where you write your code".
	public static void main(String[] args) {
		
		
//Remember the Scanner and Random tools from earlier? Earlier, we were given the resources to make the tools, but these
//lines of code build them so we can use them later.
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		
		
//These next three lines create what are known as variables. Variables contain values, whether that be words, numbers, or whether something is true or false.
//There are four main types of variables: Strings, ints, floats, and bools.
//Essentially, Strings are for words, ints are for numbers without decimals, floats are for numbers with decimals, and bools are for true/false.
		int randomNumber = random.nextInt(3)+1;
		String answer = String.valueOf(randomNumber);
		int correctCounter = 0;
//As you can see, we create an int variable named "randomNumber" using our "Random" tool. This generates a random number from 1-3, and makes the "randomNumber" variable hold that number.
//For now, I made the String variable "answer" hold the same number as "randomNumber". Later, this variable will hold whatever number the player guesses.
//The int variable "correctCounter" will count the number of correct guesses of our game.
		
		
//Below, we use the command "System.out.println" quite a lot! This command will allow you to write something directly to the console, which is what the player interacts with.
		System.out.println("Welcome to The");
		System.out.println("\r\n"
				+ "   _____                     _                _____                      \r\n"
				+ "  / ____|                   (_)              / ____|                     \r\n"
				+ " | |  __ _   _  ___  ___ ___ _ _ __   __ _  | |  __  __ _ _ __ ___   ___ \r\n"
				+ " | | |_ | | | |/ _ \\/ __/ __| | '_ \\ / _` | | | |_ |/ _` | '_ ` _ \\ / _ \\\r\n"
				+ " | |__| | |_| |  __/\\__ \\__ \\ | | | | (_| | | |__| | (_| | | | | | |  __/\r\n"
				+ "  \\_____|\\__,_|\\___||___/___/_|_| |_|\\__, |  \\_____|\\__,_|_| |_| |_|\\___|\r\n"
				+ "                                      __/ |                              \r\n"
				+ "                                     |___/                               \r\n"
				+ "");
		System.out.println("Rules:\n"
				+ "  You must guess a number randomly generated betweeen 1-3.\n"
				+ "  If you get it right, you get a point!\n"
				+ "  If you don't, try again to beat your highscore.\n");
		System.out.println("Alright, ready? Start guessing!");
//As we can see, I introduce the player to the game and give them some rules. I added fancy block letters for "Guessing Game" just for fun!"
		

//Now, here's where things might get a little tricky. A "while" command will loop over a chunk of code as long as whatever is in the parenthesis is true.
//If we look at what's in the parenthesis, we can see that it will loop as long as the answer the player gives is the same as the number they're trying to guess.
		while (answer.equals(String.valueOf(randomNumber))) 
				{
			//Here, inside of the "while loop", we have what's known as an "if statement". 
			//This says that if number of correct guesses is NOT equal to 0, it will tell the user "lucky guess!" and whatever number they are on.
					if (correctCounter != 0) {
						System.out.println("Lucky guess! onto number " + (correctCounter + 1) + ".");
					}
					answer = scanner.nextLine();
					randomNumber = random.nextInt(3)+1;
					correctCounter++;
				}
		
		
//As you can see, we have another "if statement". 
//This is saying that if the number the player guessed isn't the correct number, it will tell them "Too bad!" and what the correct number was.
		if(answer.equals(String.valueOf(randomNumber)) == false) {
			System.out.println("Too bad! The correct number is " + randomNumber + ". Your score is " + (correctCounter-1) + ".");
		}
		
		
		
//And finally, we have "scanner.close()". The Scanner tool is special, because you need to close it afterwards. 
//This is similar to how you have to turn the oven off after using it!
		scanner.close();
		
	
	}

}
