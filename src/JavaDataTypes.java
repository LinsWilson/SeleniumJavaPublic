/**
 * 
 */



/**
 * 
 */
public class JavaDataTypes {
	public static void main(String[] args) {
		/*
		 * List of primitive datatypes
		 */
		byte byteVarLower=-128;
		System.out.println("byteVarLower::"+byteVarLower);
		byte byteVarUpper=127;
		System.out.println("byteVarUpper::"+byteVarUpper);
		short shortVarLower=-32768;
		System.out.println("shortVarLower::"+shortVarLower);
		short shortVarUpper=32767;
		System.out.println("shortVarUpper::"+shortVarUpper);
		
		int intVarLower=-2147483648;
		System.out.println("intVarLower::"+intVarLower);
		int intVarUpper=2147483647;
		System.out.println("intVarUpper::"+intVarUpper);
		long longVarLower=-9223372036854775808L;
		System.out.println("longVarLower::"+longVarLower);
		long longVarUpper=9223372036854775807L;
		System.out.println("longVarUpper::"+longVarUpper);
			
		/*
		double doubleVarLower=
		System.out.println("doubleVarLower::"+doubleVarLower);
		double doubleVarUpper=
		System.out.println("doubleVarUpper::"+doubleVarUpper);
		float floatVarLower=
		System.out.println("floatVarLower::"+floatVarLower);
		float floatVarUpper=
		System.out.println("floatVarUpper::"+floatVarUpper);
		*/
		//max upto 6 decimal places after which it starts rounding up
		float floatVar = 7.999999F;
		System.out.println("floatVar::"+floatVar);
		//max upto 14 decimal places after which it starts rounding up or varying
		double doubleVar = 56.88888888888877D;
		System.out.println("doubleVar::"+doubleVar);
		//Two possible values - true or false
		boolean boolVar=false;
		System.out.println("boolVar::"+boolVar);
		//All single character or letter or ASCII values
		char charVal= '@';
		System.out.println("charVal::"+charVal);
		char charValASCII = 98;
		System.out.println("charValASCII::"+charValASCII);
		
	}
}