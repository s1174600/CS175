
public enum Input {
	Input0, terminate, INPUT1, key, INPUT2, seat, INPUT3, unseat, INPUT4, belt, INPUT5, unbelt, INPUT6, timer_expires, MAX_INPUT;
	
	public static Input fromInteger(int num){
		switch(num){
		case 0:
			return Input0;
		case 1:
			return INPUT1;	
		case 2:
			return INPUT2;
		case 3:
			return INPUT3;	
		case 4:
			return INPUT4;
		case 5:
			return INPUT5;	
		case 6:
			return INPUT6;
		default:
			return MAX_INPUT;
		}
	}
}
