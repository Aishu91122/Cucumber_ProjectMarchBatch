package conditionalStatements;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int grade = 55;
		
		if ((grade>=91) && (grade <=100))
		{
			System.out.println("Grade A");
		}
		
		else if ((grade>=81) && (grade<=90))
		{
			System.out.println("Grade B");
		}
		

		else if ((grade>=71) && (grade<=80))
		{
			System.out.println("Grade C");
		}
		

		else if ((grade>=61) && (grade<=70))
		{
			System.out.println("Grade D");
		}

		else if ((grade>=51) && (grade<=60))
		{
			System.out.println("Grade E");
		}
		
		else 
		{
			System.out.println("Fail");
		}
		
		

	}

}
