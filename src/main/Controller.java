package main;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Controller {

    private Model model;
    private View view;

    public Controller(View view, Model model){
        this.model = model;
        this.view = view;
    }

    public void processGuesses() {
        Scanner sc = new Scanner(System.in);

        model.setLowerBound(View.LOWER_BOUND);
        model.setUpperBound(View.UPPER_BOUND);
        model.setNumber(rand(model.getLowerBound(), model.getUpperBound()));
        
        inputValueWithScanner(sc, model.getNumber());
        
        view.printMessage(View.WIN_MESSAGE);
    }

    private int rand(int lowerBound, int upperBound) {
    	int randomNum = ThreadLocalRandom.current().nextInt(lowerBound, upperBound + 1);
		return randomNum;
	}

    private int rand() {
    	int randomNum = ThreadLocalRandom.current().nextInt(0, model.getUpperBound() + 1);
		return randomNum;
	}

	private String constructBoundsMessage() {
		return View.GUESS_MESSAGE + model.getLowerBound() + 
				View.AND + model.getUpperBound();
	}

	public void inputValueWithScanner(Scanner sc, int number){
        while (!model.getGuessed()) {
        	view.printMessage(constructBoundsMessage());
        	int guess = Integer.parseInt(sc.next());
        	if(guess==model.getNumber()) {
        		model.setGuessed(true);
        	}
        	else{
        		model.addGuess(guess);
        		updateBounds(guess);
        	}
        	
        }
    }

	public void updateBounds(int guess) {
		if(!(guess<=model.getLowerBound()||guess>=model.getUpperBound())){
			if(guess<model.getNumber()){
				model.setLowerBound(guess);
			}
			else{
				model.setUpperBound(guess);
			}
		}
	}

}