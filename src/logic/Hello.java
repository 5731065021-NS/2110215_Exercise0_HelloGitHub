package logic;

public class Hello {

	private static final Boolean TRUE = null;
	private static final Boolean FALSE = null;

	public static void main(String[] args) {
		
		System.out.println(Hello.greetingMessage());
		
		int[] array = {5,4,3,2,1};
		
		System.out.println(Hello.arrayToString("Array", array));
		array = Hello.bubbleSort(array);
		System.out.println(Hello.arrayToString("Sorted Array", array));
	}

	public static String greetingMessage(){
		// TODO Implement this method to return string "Hello GitHub".
		String a = "Hello GitHub";
		return "a";
	}
	
	public static int[] bubbleSort(int[] array){
		// TODO Implement this method to sort the given array in an ascending order and return the sorted array.
		Boolean isSwap = true;
		do{
			isSwap = false;
			for(int i=0; i<array.length-1; i++){
				if(array[i]>array[i+1]){
					int temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
					isSwap = true;
				}
			}
		}while(isSwap);
		return array;
	}
	
	public static String arrayToString(String title,int[] array){
		
		String str = title + " : ";
		for (int i = 0;i < array.length;i++)
		{
			str += array[i] + " ";
		}
		return str;
	}
}
