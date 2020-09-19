import java.util.*;

public class Assignment3
{

	//Function to find the deletion size
	public static List<Integer> minDeletionSize(String [] A)
	{
		//Create a new list to return at the end of the function
		List<Integer> myList = new ArrayList<Integer>();

		//Iterate through the size of one string
		for(int i = 0; i < A[0].length(); i++)
		{
			//Automatically checks if the array has strings of the same length, if there is a string of a different length, return -1
			if(A[0].length() != A[i].length())
			{
				List<Integer> list = new ArrayList<Integer>();
				list.add(-1);
				return list;
			}
			//Nested for loop to check each string in the array
			for(int j = 1; j < A.length; j++)
			{
				//Comparing the characters
				if(A[j-1].charAt(i) > A[j].charAt(i))
				{
					//If they are not sorted, add that index to the list
					myList.add(i);
					break;
				}			
			}
		}

		//At the end, return myList
		return myList;
	}

	public static void main(String[] args)
	{

		String[] sArray = {"cba","daf","ghi"};

		//Call the function
		List<Integer> myList = minDeletionSize(sArray);	

		//Iterate through our list
		for(int i = 0; i < myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}	

	}

}