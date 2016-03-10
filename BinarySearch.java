	
	import java.util.Scanner;
	import java.util.Random;

	public class BinarySearch {
	    public static void main(String[] args) {

	        String word = "";
	        // read the maximum number
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Please enter the maximum search value : ");
	        int max = scanner.nextInt();
	        System.out.print("Please enter the minimum search value : ");
	        int min = scanner.nextInt();
	        int yourvalue=0;

	        //System.out.println(+checkvariable);
	        System.out.println("-------decide your number");
	        yourvalue=Binarysearchfunction(max,min);
	        System.out.println("-----------------------------------");
	        System.out.println("Hurray!!!Your number is: " +yourvalue);
	        System.out.println("-----------------------------------");
	    }
	    public static int Binarysearchfunction(int max, int min)
	    {
	        String word = "";
	        int big=max;
	        int small=min;
	        for(int i=0; i<=(Math.log(max-min+1)/Math.log(2));i++)
	        {
	            int checkvariable =(big+small)/2;
	            Scanner scanner = new Scanner(System.in);
	            System.out.println("Please enter the your number greater than : "+checkvariable);
	            System.out.println("-------enter yes or no");
	            word = scanner.next();

	            if(!word.matches("yes")) {
	                big=((big+small)/2);
	            }else{
	                small=(big+small)/2;
	            }
	        }
	        return(big);
	    }
	}


