package main;
public class View {


    public static final String EQUAL_SING = "=";
    public static final String SPACE_SING = " ";
    public static final String OPENS_BRACKET = "(";
    public static final String CLOSING_BRACKET = ")";
	

    public static final String WRONG_INPUT_MESSAGE = "Wrong input! Repeat please! ";
	public static final String WIN_MESSAGE = "You win!";
	public static final String GUESS_MESSAGE = "Please guess an int!"
			+ " The current bounds are between ";
	public static final String AND = " and ";
	public static final String WORD_SPACE = " ";
    public static final String YOUR_GUESSES_MESSAGE = "Your guesses: ";

	public void printMessage(String message) {
		System.out.println(message);
	}

    public String concatenationString (String... message){
        StringBuilder concatString = new StringBuilder();
        for (String v : message){
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}