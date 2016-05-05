/* ACD_JAVAB_Session_4_Assignment_2_Main : 
 * Sort an array and insert an element inside it. */

package session4;

import java.util.Arrays;
import java.util.Scanner;

public class ACD_JAVAB_Session_4_Assignment_2_Main 
{
	public static void main(String[] args) 
	{
		int no_of_elements;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter 'No. of Elements' that needs to be sorted : ");
		no_of_elements = s.nextInt();
		System.out.println("Enter any "+ no_of_elements + " Integers : ");
		int[] original = new int[no_of_elements];
		for (int i = 0; i<original.length; i++)
		{
			original[i] = s.nextInt();
		}
		s.close();
		System.out.println("Original Array : " + Arrays.toString(original));
		Arrays.sort(original);
		System.out.println("Sorted Array : " + Arrays.toString(original));
		
		int[] new_array = new int[original.length + 1];
		System.arraycopy(original, 0, new_array, 0, original.length);
		
		System.out.print("Enter any New Element that needs to be Inserted in the Array : ");
		new_array[new_array.length-1] = s.nextInt();
		
		System.out.println("New Array (Before Sorting) : " + Arrays.toString(new_array));		
		Arrays.sort(new_array);
		System.out.println("New Array (After Sorting)  : " + Arrays.toString(new_array));
	}
}

/* OUTPUT
 
Enter 'No. of Elements' that needs to be sorted : 5
Enter any 5 Integers : 
10
5
98
27
6
Original Array : [10, 5, 98, 27, 6]
Sorted Array : [5, 6, 10, 27, 98]
Enter any New Element that needs to be Inserted in the Array : 65
New Array (Before Sorting) : [5, 6, 10, 27, 98, 65]
New Array (After Sorting)  : [5, 6, 10, 27, 65, 98]

 */
