//	File:  SearchTester.java

//	The SearchDataList class shows the "linear search."  The search() method
// has one parameter -- an int -- and returns the index (i.e., position) of 
// that int in an ArrayList<Integer>.  If the int is not in the list, 
// -1 is returned. 

import java.util.ArrayList ;			
import java.util.Random ;				
import javax.swing.JOptionPane ;			

/**
 * A class to demonstrate the linear search
 */
class SearchDataList
{
	//instance var's
	private ArrayList<Integer> list ;
	
	/**
	 * Creates an empty list
	 */
	public SearchDataList()
	{
		list = new ArrayList<Integer>() ;	
	}

	/** 
	 * Adds an integer score to the list.
	 * @param score the score to be added to the list
	 */
	public void add(int score)
	{
		list.add(score) ;	// calls ArrayList add method
	}

	/**
	 * Search the list for a particular score.
	 * @param target the score to search for
	 * @return the index (i.e., position) of the score in the list if the score
	 * is found; otherwise (if the score is not on the list), -1 is returned
	 */
	public int search(int target)
	{
		// for each number on the list...
		for (int index = 0 ; index < list.size() ; index++)
		{
			int current = list.get(index) ;	// get next number
			if ( current == target )		   // found it!
			{
				return index ;					   // return position
			}
		}
		// here if target is not on list...return -1
		return -1 ;						
	}
	
	/**
	 * Return a string containing all the scores on the list.
	 * @return the string containing all the scores
	 */
	 public String toString()
	 {
		String out = "" ;
		for (int i = 0 ; i < list.size() ; i++ )	 
		{
			out += list.get(i) + "  " ;					 
		}
		return out ;
	 }
}

/**
 * Tests the SearchDataList class
 */
public class SearchTester
{
	public static void main (String[] args)
	{
		SearchDataList data = new SearchDataList() ;
		Random generator = new Random() ;
				
		// append 10 random 2-digit ints to the list
		for (int i = 1 ; i <= 10 ; i++)
		{
			int num = generator.nextInt(90) + 10 ;
			data.add(num) ;
		}
		
		// print the list
		System.out.println("The list:  " + data.toString() + "\n") ;
	
		// do some searches
		String input = JOptionPane.showInputDialog("Enter int to search for " +
		                 "(Cancel to quit): ") ;
		 
		while ( input != null ) 
		{
			int target = Integer.parseInt(input) ;
			System.out.println() ;
			
			// call search method
			int position = data.search(target) ;
					
			if ( position >= 0 ) 		// if found...
			{             
				System.out.println( target + " found in element " + position ) ;
			}
			else						// not found
			{
				System.out.println( target + " is not on the list" ) ;
			}
			
			input = JOptionPane.showInputDialog("Enter next int to search for " +
		                 "(Cancel to quit): ") ;
		}
	}
}

/*  sample output

The list:  60  68  23  25  89  95  38  70  96  42

60 found in element 0

42 found in element 9

37 is not on the list

*/