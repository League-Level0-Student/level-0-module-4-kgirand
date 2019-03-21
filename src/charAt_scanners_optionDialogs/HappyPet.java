package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
		String input = JOptionPane.showInputDialog("What is the name of your real or imaginary pet?");
		for(int i = 0; i<5; i++) {
		int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happier?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Take " + input + " on a walk", "Groom " + input, "Feed " + input }, null);
		JOptionPane.showMessageDialog(null, input + " thanks you for your care and attention.");
		}
			// 5. Use user input to call the appropriate method created in step 4.
JOptionPane.showMessageDialog(null, "It seems like " + input + "'s hapiness level is high enough for you to take a break. You are great of taking care of your pet.");
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
}