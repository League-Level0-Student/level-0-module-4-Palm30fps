package _05_change_calculator;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickles=JOptionPane.showInputDialog("How many nickles do you have?");
		// Convert their answer to an int using Integer.parseInt()
int numbernickles=Integer.parseInt(nickles);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int numberdimes=Integer.parseInt(dimes);
// Ask the user how many quarters they have, and convert their answer
String quarters=JOptionPane.showInputDialog("How many quarters do you have?");
int numberquaters=Integer.parseInt(quarters);
// Calculate how much money the user has and save it in a double variable 

		// Tell the user how much money they have

	}
}

