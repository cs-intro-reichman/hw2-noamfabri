// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int N = Integer.parseInt(args[0]);
		int i = 0;	
		double denominator = 1;
		double sign = 1.0;
		double totalPi = 0;
		System.out.println("pi according to java:" + Math.PI);
		while (i < N) {
			totalPi = totalPi + ((1.0 / denominator) * sign);
			sign = (sign * -1);
			denominator = denominator + 2;
			i++;	
		}
		System.out.println("Approximation of pi: " + (totalPi * 4));
	}
}
