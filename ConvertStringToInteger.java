

public class ConvertStringToInteger
{
	public static void main(String [] args){
		ConvertStringToInteger converter = new ConvertStringToInteger();
		converter.convertToInt("$180,240/y");
		converter.convertToInt("$abc");
		converter.convertToInt("1000");
		converter.convertToInt(null);
		converter.convertToInt("");
	}
	
	public static boolean isEmpty(String str){
		//System.out.println(str.length());
		return str == null || str.trim().length() == 0;
	}
	
	public void convertToInt(String value)
	{
		if(isEmpty(value)){
			System.out.println("Empty or Invalid input " + value);
			return;
		}
		
		String convertedValue = value.replaceAll("[^0-90]","");
		
		
		
		if(isEmpty(convertedValue)){
			System.out.println("Input String (" +  value + ") doesn't contain any digit");
		}else{
			System.out.println("Input Text :" + value + " , numeric Value : " + convertedValue);
		}
		
	}

}