package incubyte;

public class Calculator {
	
	public int add(String args){

		
		if(args.isEmpty())
			return 0;
		
		else if(args.length() == 1)
			return Integer.parseInt(args);
		
		else if(args.contains("-")) {
			String negative_no_list="";
			for(int i=0;i<args.length();i++) {
				if(args.charAt(i)=='-')
					negative_no_list = negative_no_list + args.charAt(i) + " " + args.charAt(i+1); 
			}
			throw new NegativeNumberException(negative_no_list);
//			throw new IllegalArgumentException(negative_no_list);
		}

		else {

			String delimiter= "";
			if(args.contains(","))
				delimiter = ",";
			else {
				delimiter = Character.toString(args.charAt(2));
				args = args.substring(4, args.length());
			}
			return getSum(args, delimiter);
		}
	}

	public int getSum(String args,String delimiter) {
		
		String[] intarray = args.split(delimiter);
		int result = 0;
		int tmp1sum = 0;
		int tmp2sum = 0;
		
		if(intarray.length > 2)
			return -1;
		else {
			if(intarray[0].contains("\n") || intarray[1].contains("\n")) {
				
				String[] tmp1 = intarray[0].split("\n");
				String[] tmp2 = intarray[1].split("\n");
				
				for(String x:tmp1) {
					tmp1sum = tmp1sum +  Integer.parseInt(x); 
				}
				
				for(String x:tmp2) {
					tmp2sum = tmp2sum +  Integer.parseInt(x); 
				}		
				result = tmp1sum +tmp2sum;
			}
			else
				result = Integer.parseInt(intarray[0])+Integer.parseInt(intarray[1]);			
			return result;			
		}
		
	}

}
