import java.util.Arrays;
import java.util.Random;

public class CardGamev1 {

	public static void main(String[] args) {

		Random generator = new Random();

		int countH = 0, countD = 0, countC = 0, countS = 0, countDraw = 0, myDraw = 0, yourDraw = 0;
		
		String mySuit = null;
		String yourSuit = null;
		
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		
		boolean winner = false;
		
		int mySuitHigh=0;
		int mySuitLow=0;
		int yourSuitHigh=0;
		int yourSuitLow=0;
		int yourGoodCount=0;
		int myGoodCount=0;

		for (int x = 0; x < myHand.length; x++) {
			myHand[x] = generator.nextInt(52) + 1;
			
			if (myHand[x] >= 1 && myHand[x] <= 13) {
				countH++;
			}
			else if (myHand[x] >= 14 && myHand[x] <= 26) {
				countD++;
			}
			else if (myHand[x] >= 27 && myHand[x] <= 39) {
				countC++;
			}
			else if (myHand[x] >= 40 && myHand[x] <= 52) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				mySuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				mySuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				mySuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				mySuit = "Spades";
			}
		}
		
		for (int x = 0; x < yourHand.length; x++) {
			yourHand[x] = generator.nextInt(52) + 1;
			
			if (yourHand[x] >= 1 && yourHand[x] <= 13) {
				countH++;
			}
			else if (yourHand[x] >= 14 && yourHand[x] <= 26) {
				countD++;
			}
			else if (yourHand[x] >= 27 && yourHand[x] <= 39) {
				countC++;
			}
			else if (yourHand[x] >= 40 && yourHand[x] <= 52) {
				countS++;
				
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				yourSuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
			}
		}
		
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		
		System.out.println("My suit is " + mySuit + ".");
		
		System.out.println("Your suit is " + yourSuit + ".");
		
		if (mySuit.equals("Hearts")){mySuitLow=1;mySuitHigh = 13;}
		
		if (mySuit.equals("Diamonds")){mySuitLow=14;mySuitHigh = 26;}
		
		if (mySuit.equals("Clubs")){mySuitLow=27;mySuitHigh = 39;}
		
		if (mySuit.equals("Spades")){mySuitLow=40;mySuitHigh = 52;}
		
		if (yourSuit.equals("Hearts")){yourSuitLow=0;yourSuitHigh = 13;}
		
		if (yourSuit.equals("Diamonds")){yourSuitLow=14;yourSuitHigh = 26;}
		
		if (yourSuit.equals("Clubs")){yourSuitLow=27;yourSuitHigh = 39;}
		
		if (yourSuit.equals("Spades")){yourSuitLow=40;yourSuitHigh = 52;}

		while (!winner) 
		{
			countDraw++;
			myDraw = generator.nextInt(52) + 1;
			
			System.out.println("My draw " + countDraw + ": " + myDraw);
			
			yourDraw = generator.nextInt(52) + 1;
			
			System.out.println("Your draw " + countDraw + ": " + yourDraw);

			if (myDraw>=mySuitLow && myDraw<=mySuitHigh) 
			{
				
				for (int x = 0; x < 5; x++) 
				{
					
					if (myHand[x] < mySuitLow || myHand[x] > mySuitHigh) 
					{myHand[x] = myDraw; 
					break;
					}
				}
						
						
			}
			myGoodCount = 0;
			
			for (int y = 0; y < 5; y++) 
			{
				
				if (myHand[y] >= mySuitLow && myHand[y] <= mySuitHigh)
				{
					myGoodCount = myGoodCount+1;
				}
			}
			
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			
			if (myGoodCount == 5 )
					{winner=true;
					
					System.out.println("I am the winner.");
					
					break;
					}
			
			if (yourDraw >= yourSuitLow && yourDraw <= yourSuitHigh) 
			{
				
				for (int x = 0; x < 5; x++) 
				{
					
					if (yourHand[x] < yourSuitLow || yourHand[x] > yourSuitHigh) 
					{yourHand[x] = yourDraw; 
					break;
					}
				}
						
						
			}
			yourGoodCount = 0;
			
			for (int y = 0; y < 5; y++) 
			{
				
				if (yourHand[y] >= yourSuitLow && yourHand[y] <= yourSuitHigh)
				{
					yourGoodCount = yourGoodCount + 1;
				}
			}
			
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			
			if (yourGoodCount == 5 )
					{winner=true;
					
					System.out.println("You are the winner.");
					break;
					}
			
		}		
		System.out.println("The game is over.");


	}

}
