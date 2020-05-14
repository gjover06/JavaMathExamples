import java.util.Scanner;
//Author: George Samu

public class JavaMathExamples
{
	public static void main(String[] args)
	{
			final double A= 64;
				  double B= 2;
				  double C= 6;
				  double D= 3;
				  double x= -17;
				  double y= -1;
			
		//Scanner keyboard = new Scanner (System.in);
		System.out.println("What is the calculation");
		//double Parta = keyboard.nextDouble();
		double Answera = Math.sqrt(A);
		
		//double Partb = keyboard.nextDouble();
		double Answerb = Math.abs(x);
		
		//double Partc = keyboard.nextDouble();
		double Answerc = Math.exp(y);
		
		double Answerd = Math.pow(B,D);
		
		double Answere = Math.pow(C,B);
		System.out.println("");
		System.out.println("The answer to A is : "+ Answera+
							"The answer to B is: "+ Answerb+
							"The answer to C is: "+ Answerc+
							"The answer to D is: "+ Answerd+
							"The answer to E is: "+ Answere);
		
	}//end main
	}// end JavaMathExamples
