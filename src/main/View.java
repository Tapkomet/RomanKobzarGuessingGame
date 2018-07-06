package main;
public class View {

	public static final String WIN_MESSAGE = "You win!";
	public static final String GUESS_MESSAGE = "Please guess an int!"
			+ " The current bounds are between ";
	public static final String AND = " and ";
	public static final String WORD_SPACE = " ";
	public static final int LOWER_BOUND = 0;
	public static final int UPPER_BOUND = 100;

	public void printMessage(String message) {
		System.out.println(message);
	}
}