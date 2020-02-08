package project3;
import project2.*;
import java.util.Scanner;
public class k2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	k1 h=new k1();
	Scanner s=new Scanner(System.in);
	System.out.println("enter two numbers : ");
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println("Calculator:\n1:addition\n2:subtraction\n3:multiplication\n4:division\n");

	int opt=s.nextInt();

	switch(opt)
	{
	case 1:h.add(a, b);
	      break;
	case 2:h.subtract(a, b);
	        break;
	case 3:h.multiply(a, b);
	       break;
	case 4:h.divide(a,b);
	      break;
	default:
	System.out.println("please enter valid option!!");
	}
	s.close();
	}
	}
