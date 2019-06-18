package aleatórios;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = ("asdf");
		
		int size = string.length();
		boolean b = false;
		
			for(int i = 0, j = size - 1; i <= (size / 2) &&  j >= (size/2); i++, j--) {
				if(b == true){
		            b = string.charAt(i) == string.charAt(j);    
		        }
		        else{
		            b = false;
		        }
			}
			
		System.out.println(b);
	}

}
