import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double fracNum = s.nextDouble();
		System.out.println(Math.abs(fracNum));
		s.nextLine();
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s2 = new Scanner(System.in);
		System.out.print("Input a number: ");
		double fracNum2 = s2.nextDouble();
		System.out.print("Input another number: ");
		double fracNum3 = s2.nextDouble();
		System.out.println(Math.floor(fracNum2 / fracNum3));
		System.out.println(Math.ceil(fracNum2 / fracNum3));
		s2.nextLine();



		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s3 = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = s3.nextInt();
		System.out.println(Math.round(Math.sqrt(num)));
		s3.nextLine();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s4 = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num2 = s4.nextInt();
		System.out.print("Input another number: ");
		int num3 = s4.nextInt();
		System.out.println(Math.pow(num2, num3));
		s4.nextLine();

		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s5 = new Scanner(System.in);
		System.out.print("Input a number: ");
		double fracNum4 = s5.nextDouble();
		System.out.print("Input another number: ");
		double fracNum5 = s5.nextDouble();
		System.out.print("Input one more number: ");
		double fracNum6 = s5.nextDouble();
		System.out.println(Math.max(fracNum4, Math.max(fracNum5, fracNum6)));
		System.out.println(Math.min(fracNum4, Math.min(fracNum5, fracNum6)));
		s5.nextLine();
	}
	public static void q6() {
		//Write question 5 code here
		Scanner s6 = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s6.nextLine();
		System.out.println(sentence.contains("on"));


		
	}
	public static void q7() {
		//Write question 5 code here
		Scanner s7 = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String mango = s7.nextLine();
		boolean notMango = mango.equalsIgnoreCase("mango");
		System.out.println(notMango);
		
	}
	public static void q8() {
		//Write question 5 code here
		Scanner s8 = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s8.nextLine();
		System.out.print("Input a letter: ");
		String letter = s8.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));


	}

	public static void q9() {
		//Write question 5 code here
		Scanner s9 = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence2 = s9.nextLine();
 		System.out.println("Your sentence is " +  sentence2.length() + " characters long");
		
	}
	public static void q10() {
		//Write question 5 code here
		Scanner s10 = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence3 = s10.nextLine();
		System.out.print("Input a word to replace: ");
		String word2 = s10.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String wordReplaced = s10.nextLine();
		System.out.println(sentence3.replaceAll(word2, wordReplaced));

		
	}

	public static void q11() {
		//Write question 5 code here
		Scanner s11 = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence4 = s11.nextLine().trim();
		System.out.println(sentence4.toUpperCase());
		System.out.println(sentence4.toLowerCase());

		
	}

	public static void q12() {
		//Write question 5 code here
		Scanner s12 = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word3 = s12.nextLine();
		System.out.println(word3.substring(0, 4));
		System.out.println(word3.substring(word3.length() - 4));
		
	}
	

}
