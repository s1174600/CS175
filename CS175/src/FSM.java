
import java.util.Scanner;

public class FSM {
	
	public enum State {
		STATE0, off, STATE1, seated, STATE2, ready, STATE3, belted, STATE4, timing, STATE5, buzzer, MAX_STATE;
	}
	public enum Input {
		Input0, terminate, INPUT1, key, INPUT2, seat, INPUT3, unseat, INPUT4, belt, INPUT5, unbelt, INPUT6, timer_expires, MAX_INPUT;

		public static Input fromInt(int num) {
			// TODO Auto-generated method stub
			return null;
		}
	}
	State state;
	Input input;
	
	FSM(){
		state = State.STATE0;
	}
	
	public void run(){
		Scanner in = new Scanner(System.in);
		int num;

		while (state != State.MAX_STATE){
			if (state != State.STATE4){
				//get input
				while (true){
					System.out.println("You are currently in the state of "+state);
					System.out.println("Please enter a number in 0-9: ");
					num = in.nextInt();
					if (num >= 0 && num < 10) break;
					else {
						System.out.print("Wrong input! ");
					}
				}
				
				input = Input.fromInt(num);
			}
			
			switch(state){
			case STATE0:
				if (input == Input.INPUT1){
					state = State.STATE1;
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.STATE0;
				}
				break;
			case STATE1:
				if (input == Input.Input0){
					state = State.STATE2;
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.STATE0;
				}	
				break;		
			case STATE2:
				if (input == Input.INPUT1){
					state = State.STATE3;
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.STATE0;
				}
				break;
			case STATE3:
				if (input == Input.INPUT5){
					state = State.STATE4;
				}
				else{
					System.out.println("Wrong! Start over! "+state);
					state = State.STATE0;
				}
				break;
			case STATE4:
				state = State.MAX_STATE;
				System.out.println("The safe is open!");
				break;
			default:
				System.out.println("Wrong input!");
				break;
			}
		}
		in.close();	
	}
}

