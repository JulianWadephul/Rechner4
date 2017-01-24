import Prog1Tools.IOTools;
import SimpleMath;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wert1 = IOTools.readDouble("Double: ");
		char operator = IOTools.readChar("Char: ");
		double wert2 = IOTools.readDouble("Double: ");
		double wert3;
		
		switch(operator){
			case '*': wert3 = SimpleMath.multiply(wert1,wert2);
			case ':': wert3 = SimpleMath.divide(wert1,wert2);
			case '-': wert3 = SimpleMath.subtract(wert1,wert2);
			case '+': wer3 = SimpleMath.add(wert1,wert2);
		}
	}

}
