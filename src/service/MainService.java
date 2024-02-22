package service;

import java.util.Arrays;
import java.util.Random;

/*
 * MianService for seminar
 */

public class MainService {
	
	private static final double GRAVITY = -9.81;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Hello");
		
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
		
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };
		int lenNam = names.length;
		int lenTim = names.length;

		
		for(int i = 0; i < lenNam; i++) {
			System.out.println(names[i] + " " + times[i]);
		}*/
		
		/*try
		{
			System.out.println(positionCalc(-10, 0, 100));
			System.out.println("sadasdasd");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}*/
		System.out.println(factorialForLoop(4));
		System.out.println(Arrays.toString(generateArray(10, 3.5, 6.5)));
		double[] mas = generateArray(10, 3.5, 6.5);
		System.out.println(getMean(mas));
		System.out.println(Arrays.toString(arraySort(mas)));
	}
	
	
	/*public static double positionCalc(double initialVelocity, double initialPosition, double fallingTime) throws Exception{
		if(initialVelocity >=0 && initialVelocity < 299792458 && initialPosition >= 0 && initialPosition < 20000 && fallingTime >= 0 && fallingTime < 80000){
			return 0.5 * GRAVITY * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
		}
		else {
			throw new Exception("");
			}
	}*/
	
	public static int factorialForLoop(int N)
	{
		//if(N < 0) throw new Exception("Wrong input parameter");
		
		if (N == 0) return 1;
		
		else
		{
			int result = 1;
			for(int i = 1; i <= N; i++) {
				result = result * i;
			}
			return result;
		}
	}

	public static double[] generateArray(int N, double lower, double upper)
	{
		double[] result = new double[N];
		Random rand = new Random();
		for(int i = 0; i < result.length; i++) {
			result[i] = rand.nextDouble(lower, upper);
		}
		return result;
	}

	public static double getMean(double[] array) 
	{
		double sum = 0;
		for(double temp : array) {
			sum = sum + temp;
		}
		return sum/array.length;
	}

	public static double[] arraySort(double[] array)
	{
		Arrays.sort(array);
		
		return array;
	}
}
