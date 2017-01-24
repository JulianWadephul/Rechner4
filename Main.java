import Prog1Tools.IOTools;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double wert1 = IOTools.readDouble("Double: ");
		char operator = IOTools.readChar("Char: ");
		double wert2 = IOTools.readDouble("Double: ");
		double wert3 = 0;
		
		switch(operator){
			case '*': wert3 = SimpleMath.multiply(wert1,wert2);
			break;
			case ':': wert3 = SimpleMath.divide(wert1,wert2);
			break;
			case '-': wert3 = SimpleMath.substract(wert1,wert2);
			break;
			case '+': wert3 = SimpleMath.add(wert1,wert2);
			break;
		}

		System.out.println("Ergebnis: "+wert3);
	}

}
