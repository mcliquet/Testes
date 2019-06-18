package aleatórios;

public class Adjacents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 3, 6, -2, -5, 7, 3 };
		int maxProduct = inputArray[0] * inputArray[1];
		
		for (int i = 1; i <= inputArray.length - 1; i++) {
			if(inputArray[i] * inputArray[i-1] > maxProduct && inputArray[i] > 0 && inputArray[i -1] > 0) {
				maxProduct = inputArray[i-1] * inputArray[i];
			}
		}
		
		System.out.println(maxProduct);


// -------- MAIOR PRODUTO ENTRE 2 NUMEROS NÃO REPETIDOS
//		int product = 0;
//
//		for (int i = 0; i <= inputArray.length - 1; i++) {
//			for (int j = 0; j <= inputArray.length - 1; j++) {
//				if((inputArray[i] * inputArray[j]) > 0 && (inputArray[i] * inputArray[j]) > product && i != j) {
//					product = (inputArray[i] * inputArray[j]);
//				}
//			}
//		}
//		
//		System.out.println(product);

// ---------- PROCURA O MAIOR E O MENOR NUMERO DO ARRAY ---------
//		int high = 0;
//		int low = inputArray[0];
//
//		for (int i = 0; i <= inputArray.length - 1; i++) {
//			if (inputArray[i] < 0) {
//				int change = inputArray[i] * -1;
//				
//				if (change > high) {
//					high = inputArray[i];
//				}
//				if (change < low) {
//					low = c;
//				}
//			}
//			else {
//				if (inputArray[i] > high) {
//					high = inputArray[i];
//				}
//				if (inputArray[i] < low) {
//					low = inputArray[i];
//				}
//			}
//		}
//		
//		int product = (high * low);
//		System.out.println(product);

	}

}
