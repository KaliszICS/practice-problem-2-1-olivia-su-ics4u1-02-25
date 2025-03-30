public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int find (int[] array, int number){
		int index = -1;

		for (int i = 0; i < array.length; i++){
			if (number == array[i]){
				index = i;
				i = array.length;
			}
		}
		return index;
	}

	public static int findLast(String[] array, String string){
		int index = -1;

		for (int i = 0; i < array.length; i++){
			if (string == array[i]){
				index = i;
			}
		}
		return index;
	}

	public static int findSecond(char[] array, char character){
		int index = -1;
		int counter = 0;

		for (int i = 0; i < array.length; i++){
			if (character == array[i]){
				counter += 1; 
				index = i;
				
				if (counter == 2){
					i = array.length;
				}
			}
		}
		return index;
	}
}
