// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]); 
		String mode = args[1];
		if(mode.equals("v")){
			for(int i = 1; i <=N; i++){
				int P = i;
				int count = 1;
				System.out.print(P + " ");
				do{
			    	if (P % 2 == 0 ) {
					P /= 2;
			    	} else {
						P = ((P * 3) + 1);
		   		 	}
					System.out.print(P + " ");
					count++;
				}while (P != 1);
				System.out.print("(" + count + ")");
				System.out.println();
	      		}
			System.out.println("Every one of the first " + N + " hailstone sequence reached 1.");		
    	} else {
			System.out.println("Every one of the first " + N + " hailstone sequence reached 1.");		

		}
	}
}



