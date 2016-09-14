import java.util.Scanner;

public class passerRatingFormulas {

	public passerRatingFormulas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double numberPassAttempts;
		double numberOfCompletions;
		double passingYards;
		double touchDownPasses;
		double interceptions;
		
		System.out.println("What is the number of pass attempts the player had?");
		numberPassAttempts=input.nextDouble();
		
		System.out.println("what is the number of completions the player has thrown?");
		numberOfCompletions=input.nextDouble();
		
		System.out.println("what is the number of total passing yards the player has thrown?");
		passingYards=input.nextDouble();
		
		System.out.println("what is the number of touch down passes this player has thrown?");
		touchDownPasses=input.nextDouble();
		
		System.out.println("what is the number of interceptions this player has thrown?");
		interceptions=input.nextDouble();
		
		double varA= (numberOfCompletions/numberPassAttempts-.3)*5;
		double varB= (passingYards/numberPassAttempts-3)*.25;
		double varC= (touchDownPasses/numberPassAttempts)*20;
		double varD= (2.375-((interceptions/numberPassAttempts)*25));
		
		double passerRating= ((varA + varB + varC + varD)/6)*100;
		
		System.out.println(passerRating);
		
		
		
		
		
		
		input.close();
	}

}
