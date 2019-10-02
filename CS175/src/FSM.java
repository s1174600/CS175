import java.util.Scanner;

public class FSM {
	public static void main(String[] args) {
	State state;
	Input input = null;

	
	FSM();{
	state = State.off;
	}
	
	
	
	
		Scanner in = new Scanner(System.in);
		int num;{
		
		while (state != State.MAX_STATE){
			if (state != State.STATE6){
				//get input
				while (true){
					System.out.println("You are currently in the state of " + state);
					System.out.println("Please enter a number from the following options: 1 -- key 2 -- seat 3 -- unseat 4 -- belt 5 -- unbelt 6 -- timer_expires 0 -- terminate");
					num = in.nextInt();
					if (num >= 0 && num < 7) break;
					else {
						System.out.print("Wrong input! ");
					}
				}
				
				input = Input.fromInteger(num);
			}
			
			switch(state){
			case STATE0: //0ff
				if (input == Input.Input0){  //terminate
					state = State.STATE1;  //seated
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}
				break;
			case STATE1:
				if (input == Input.INPUT1){  //key
					state = State.STATE2;  //ready
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}	
				break;		
			case STATE2:
				if (input == Input.INPUT2){  //seat
					state = State.STATE3;  //belted
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}
				break;
			case STATE3:
				if (input == Input.INPUT3){  //unseat
					state = State.STATE4;  //timing
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}
				break;
			case STATE4:
				if (input == Input.INPUT4){  //belt
					state = State.STATE5;  //buzzer
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}
				break;
			case STATE5: 
				if (input == Input.INPUT5){  //unbelt
					state = State.STATE6;  //max state
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.off;
				}
				break;
			
			case STATE6:
				state = State.MAX_STATE;
				System.out.println("The seat belt system has been implemented");
				break;
			default:
				System.out.println("Wrong input!");
				break;
				
			}
		}
		in.close();	
		}
	}
		
	
	
		
	

	private static void run() {
		// TODO Auto-generated method stub
		
	}

	private static void FSM() {
		// TODO Auto-generated method stub
		
	}

	
}

