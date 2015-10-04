import java.util.*;
import java.io.*;

public class H12 {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the total number: ");
	int n = sc.nextInt() - 2;
	int previous_number = 0;
	int current_number = 0;
	
	if(n > 0) {
	    System.out.println("Enter the number: ");
	    previous_number = sc.nextInt();
	    System.out.println("Enter the number: ");
	    current_number = sc.nextInt();
	}
	
	boolean increase = false;
	boolean decrease = false;
	boolean equality = false;
	
	int counter = 0;

	if(previous_number < current_number)
	    increase = true;
	else if(current_number > previous_number)
	    decrease = true;
	else
	    equality = true;


	while(n >= 0) {
	    if(increase) {
		if(previous_number > current_number) {
		    counter++;
		    decrease = true;
		    increase = false;
		}
	    }

	    if(decrease) {
		if(current_number > previous_number) {
		    counter++;
		    increase = true;
		    decrease = false;
		}
	    }

	    if(equality) {
		if(previous_number > current_number) {
		    decrease = true;
		    equality = false;
		}
		if(previous_number < current_number) {
		    increase = true;
		    equality = false;
		}
	    }
	    if(n > 0) {
		previous_number = current_number;
		System.out.println("Enter the number: ");
		current_number = sc.nextInt();
	    }
	    n--;
	}
	
	System.out.println("There are " + counter + " drops");
    }
}
