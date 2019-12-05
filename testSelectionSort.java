import static org.junit.Assert.*;

public class testSelectionSort 
{
	public static void main (String[] args)
	{
		testPositive();
		testNegative();
		testMixed();
		testDuplicate();
	}    

	public static void testPositive()
	{
		int[] arr = new int[5];       
		arr[0] = 8;       
		arr[1] = 9;       
		arr[2] = 7;      
		arr[3] = 10;       
		arr[4] = 2;   
		
		int[] Sortedarr = new int[5];        
		Sortedarr[0] = 2;       
		Sortedarr[1] = 7;       
		Sortedarr[2] = 8;        
		Sortedarr[3] = 9;        
		Sortedarr[4] = 10; 
		
		SelectionSort sort = new SelectionSort();
		int[]arr1 = sort.basicSelectionSort(arr);
		
		for(int i = 0; i < Sortedarr.length; ++i)
		{
			assertTrue("Positive incorrect", Sortedarr[i] == arr1[i]);
		}	
	}
	
	public static void testNegative()
	{
		int[] arr = new int[5];       
		arr[0] = -8;       
		arr[1] = -9;       
		arr[2] = -7;      
		arr[3] = -10;       
		arr[4] = -2;   
		
		int[] Sortedarr = new int[5];        
		Sortedarr[0] = -10;       
		Sortedarr[1] = -9;       
		Sortedarr[2] = -8;        
		Sortedarr[3] = -7;        
		Sortedarr[4] = -2; 
		
		SelectionSort sort = new SelectionSort();
		int[]arr1 = sort.basicSelectionSort(arr);
		
		for(int i = 0; i < Sortedarr.length; ++i)
		{
			assertSame("Negative Incorrect", Sortedarr[i] ,arr1[i]);
		}	
	}
	
	public static void testMixed()
	{
		int[] arr = new int[5];       
		arr[0] = 8;       
		arr[1] = -9;       
		arr[2] = 7;      
		arr[3] = -10;       
		arr[4] = -2;   
		
		int[] Sortedarr = new int[5];        
		Sortedarr[0] = -10;       
		Sortedarr[1] = -9;       
		Sortedarr[2] = -2;        
		Sortedarr[3] = 7;        
		Sortedarr[4] = 8; 
		
		SelectionSort sort = new SelectionSort();
		int[]arr1 = sort.basicSelectionSort(arr);
		
		for(int i = 0; i < Sortedarr.length; ++i)
		{
			assertTrue("Mixed Incorrect", Sortedarr[i] == arr1[i]);
		}	
	}
	
	public static void testDuplicate()
	{
		int[] arr = new int[5];       
		arr[0] = 8;       
		arr[1] = 9;       
		arr[2] = 8;      
		arr[3] = 10;       
		arr[4] = 2;   
		
		int[] Sortedarr = new int[5];        
		Sortedarr[0] = 2;       
		Sortedarr[1] = 8;       
		Sortedarr[2] = 8;        
		Sortedarr[3] = 9;        
		Sortedarr[4] = 10; 
		
		SelectionSort sort = new SelectionSort();
		int[]arr1 = sort.basicSelectionSort(arr);
		
		for(int i = 0; i < Sortedarr.length; ++i)
		{
			assertTrue("Duplicate Incorrect", Sortedarr[i] == arr1[i]);
		}	
	}
}