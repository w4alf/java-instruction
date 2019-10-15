

public class Game {

	private int number = 0;
	private int guess = 0;
	
	private int rdmNum = 0;

	public int counter = 1;
	private final static int UPPER_LIMIT = 100;

	
	public Game() {
		// TODO Auto-generated constructor stub
	}


	public void checkNum() {
		
		// Display initial header
				System.out.println("Welcome to the Guess the Number Game.");
				System.out.println("--------------------------------------- ");
				System.out.println("I'm thinking of a number from 1 to 100. ");
				
				
				//Console console = new Console();
				
				int randomNumber = this.getRandomInt();
				
				
				String choice = "y";
				
				
				//top loop
				while (choice.equalsIgnoreCase("y")) {
					
					guess = Console.getValidInt("Enter Number: ");
					
				
					//biz logic
					// checks the number for how close it is and increments attempts counter	
					while (guess != randomNumber) {
						
						
						if ((guess - randomNumber) > 0 && Math.abs(guess - randomNumber)> 10) {
							System.out.println("Your Number is way too high! ");
							guess = Console.getValidInt("Guess Again: ");
							counter++;
							
						} 
						
						else if ((guess - randomNumber) < 0 && Math.abs((guess - randomNumber)) >10){
							System.out.println("Your Number is way too low! ");
							guess = Console.getValidInt("Guess Again: ");
							counter++;
							
						}
						
						else if (guess > randomNumber){
							System.out.println("Your Number is too High. ");
							guess = Console.getValidInt("Guess Again: ");
							counter++;
							
						}
						
						else if (guess < randomNumber){
							System.out.println("Your Number is too Low. ");
							guess = Console.getValidInt("Guess Again: ");
							counter++;
							
						}
						
					
					
					}

					
					
						// message based on number of attempts
						System.out.println("You Guessed it in " + counter + " attempt(s).");
						System.out.println();
						
						if (counter <= 3) {
							System.out.println("Great work you are a mathematical Wizard!");
							System.out.println();
						} else if (counter > 3 && counter <= 7){
							System.out.println("Not too bad you've got some potential.");	
							System.out.println();
						} else if (counter > 7) {
							System.out.println("What took you so long? Maybe you should take some lessons.");
							System.out.println();
						}
					
						guess = 0;
						counter = 0;
								
						//new code begin
						
//						boolean isValid =false;
//						
//				        while (!isValid) {
//				        	System.out.print("Continue? (y/n): ");
//				        	choice = sc.next();
//				      
//				        	
//				            if (!choice.equalsIgnoreCase(" ") && choice.equalsIgnoreCase("y") && choice.equalsIgnoreCase("n")) {
//				            	 System.out.println("Error! Invalid integer value. Try again.");
//				                
//				            } else {
//				            	isValid = true;
//				            }
//				            sc.nextLine();  // discard any other data entered on the line
//				        }
//							
//						}
//						
				
						// new code end

						
						
						choice = Console.getString("Continue? (y/n): ");
						//sc.nextLine(); // discard entire line
						System.out.println();
			
						
						

				}
		
				System.out.println(" BYE BYE!");
	}
	
	

	// method returns a random number based on constant set for upper limit
	public int getRandomInt() {

		// create the random number
		int rdmNumber = (int) (Math.random() * UPPER_LIMIT);
		rdmNumber++; // Math.Random returns from 0 to <1 range..
		return rdmNumber;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getGuess() {
		return guess;
	}

	public void setGuess(int guess) {
		this.guess = guess;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int getRdmNum() {
		return rdmNum;
	}

	public void setRdmNum(int rdmNum) {
		this.rdmNum = rdmNum;
	}

}
