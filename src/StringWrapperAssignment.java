
public class StringWrapperAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String to byte
		String strByte="12";
		Byte byteVariable= Byte.parseByte(strByte);
		System.out.println("byteVariable::"+byteVariable);
		
		String strShort = "31000";
		Short shortVariable =Short.parseShort(strShort);
		System.out.println("shortVariable::"+shortVariable);
		
		String strInteger = "76576444";
		Integer intVariable = Integer.parseInt(strInteger);
		System.out.println("intVariable::"+intVariable);
		
		String strLong = "877678899997779";
		Long longVariable= Long.parseLong(strLong);
		System.out.println("longVariable::"+longVariable);
		
		String strFloat = "889.88978";
		Float floatVariable = Float.parseFloat(strFloat);
		//Rounds off to 4 decimal places accuracy
		System.out.println("floatVariable::"+floatVariable);
		
		String strDouble = "8789.6564545454545455";
		Double doubleVariable=Double.parseDouble(strDouble);
		//Rounds off to 12 decimal places accuracy
		System.out.println("doubleVariable::"+doubleVariable);
		

		String strBoolean = "trueh";
		Boolean booleanVariable=Boolean.parseBoolean(strBoolean);
		//Any string value other than "TRUE" or "true" returns false 
		System.out.println("booleanVariable::"+booleanVariable);
		
		///Not sure about char type conversion
		String strChar = "98";
		char [] charVariable = Character.toChars(0);
		//Not fully sure what this function does :-(
		System.out.println("charVariable::"+charVariable[0]);
		
		/**
		 * double to long
		 *
		 */
		 
		 double dblVar = 889.878979899D;
		 
		 long convDblToLong = (long)dblVar;
		 System.out.println("convDblToLong::"+convDblToLong);
		 
		 /*
		  * long to double
		  */
		
		 long longVar = 876687786887687L;
		 double convLongToDouble = (double)longVar;
		 System.out.println("convLongToDouble::"+convLongToDouble);
		 
	}

}
