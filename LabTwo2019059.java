import java.io.BufferedReader;
import java.io.InputStreamReader;
//Made with Gilmar Araujo 2019101
public class LabOne2019059 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Invoking contructor
		new LabOne2019059();
	}
	// Contructor
	public LabOne2019059() {
		// Invoking methods
		
		// Exercise One: Marks
		Marks();
		
		//Exercise two: Percentage
		Percentage();
	}
	
	public void Marks() {
		
		// the program will ask the user to input the marks , can be a decimal number 
		double mark = Double.parseDouble(askUser("Please enter your mark for lab 1:"));
		// Declaring variable to define the math used to get the percentage
		double p = (mark/100)*15;

		// The if-statemente is going to define limit that mark between 0 and 100 as required
		//if out of the limit will appear a error message
		if(mark<0 || mark >100) {
			System.out.println("invalid mark");
		}
		//if the mark is between the limit the required so the system will print the result of the math - p -
		else {
			System.out.println("You scored: "+p+ "% out of maximum of 15%");
		}
		
		
	}
	
	public void Percentage() {
		//here there is where the user will insert the number
		double number = Double.parseDouble(askUser("Please enter a number:"));
		//here there is where the user will insert the percentage
		double percent = Double.parseDouble(askUser("Please enter a percentage:"));
		//here is where the program will do the math and return the value
		double result = (percent/100) * number; 
		//i created that if statement to dont let the user use negative percentage
		if(percent <0) {
			System.out.println("please use a positive number for percentage");
		}else {
			//here the program will print the variables that i used to do the math and the result of it 
		System.out.println(percent+"% of "+ number +" is: "+result);
		}
		
		
		
	}
	
		// that method is used to get the input from the user
	public String askUser(String question) {
		//that is we use to import the buffereader and streamreader
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		//here will be printed the question we want to do to the user
		System.out.println(question);
		//that variable will be the "input" from the user, his answer
		String answer = "";
		//here the program will try to get the answer(input) from the user 
		//and if something going wrong will appear a error message from the exception
		try {
			answer = input.readLine();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		//the answer will return
		return answer;
	}

}
