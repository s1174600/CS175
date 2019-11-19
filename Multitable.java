
public class Multitable {

	public static void main(String[] args) {
        int Size = 10;
        MT(Size);
    }
     
    public static void MT(int Size) {
        
        System.out.format("      ");
        
        for(int i = 1; i<=Size; i++ ) {
        	
            System.out.format("%4d", i);
        }
        
        System.out.println();
        System.out.println("----------------------------------------------");
         
        for(int i = 1 ; i<=Size; i++) {
            
            System.out.format("%4d |", i);
            
            for(int j=1; j<=Size; j++) {
            	
                System.out.format("%4d",i*j);
            }
            System.out.println();
            
            
        }
    }
     
}

