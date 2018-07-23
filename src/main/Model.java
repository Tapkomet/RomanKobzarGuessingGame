package main;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int number;
    
    private int lowerBound;
    private int upperBound;
    
    private ArrayList<Integer> guesses = new ArrayList<Integer>();
    
    private boolean guessed = false;

    public int getNumber() {
    	return this.number;
    }
    
    public void setNumber(int number){
    	this.number = number;
    }

    public int getLowerBound() {
    	return this.lowerBound;
    }
    
    public void setLowerBound(int lowerBound){
    	this.lowerBound = lowerBound;
    }

    public int getUpperBound() {
    	return this.upperBound;
    }
    
    public void setUpperBound(int upperBound){
    	this.upperBound = upperBound;
    }
    
    public void addGuess(int guess){
    	guesses.add(guess);
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }
    
    public void setGuessed(boolean guessed){
    	this.guessed = guessed;
    }
    
    public boolean getGuessed(){
    	return this.guessed;
    }
    
	int getX() {return x;}
	int y = getX();
    int x = 3;

}