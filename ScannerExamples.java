package scannerEamp;
import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
	String s1 = "Dog, Wags, Bob Marley ";
	String s2 = "Cat, Fritz, Mary Beth";
	String s3 = "Hamster, Fred, Jane Doe Brown";
	String s4 = s1+"\n" + s2 + "\n" + s3;
	
	//Create Scanner Object
	Scanner Scan = new Scanner(s1).useDelimiter(",");
	Scanner Scan1 = new Scanner(s2).useDelimiter(",");
	Scanner Scan2 = new Scanner(s3).useDelimiter(",");
	Scanner line = new Scanner(s4);
	
	
	//Display the token
	System.out.println(Scan.next());
	System.out.println(Scan.next());
	System.out.println(Scan.next());
	
	System.out.println(Scan1.next());
	System.out.println(Scan1.next());
	System.out.println(Scan1.next());
	
	System.out.println(Scan2.next());
	System.out.println(Scan2.next());
	System.out.println(Scan2.next());
	
	//System.out.println(line.next());
	while (line.hasNextLine()) {
	Scanner word = new Scanner(line.nextLine());
	System.out.println(word.next());
	System.out.println(word.next());
	System.out.println(word.next());
	}


	}

}
