import java.util.ArrayList ;
import java.util.Scanner ;
import javax.swing.JOptionPane ;	
import java.io.File ;					
import java.io.IOException ;

/**
 * A class to create and maintain a list of names.
 */
class NameList
{
	// instance var
	private ArrayList<String> list ;
        
	/**
	 * Creates an empty list.
	 */
	public NameList()
	{
		list = new ArrayList<String>() ;
	}
	
	/**
	 * Appends a name to the end of the list.
	 * @param name the name to be appended
	 */
	public void append(String name)
	{
		list.add(name) ;		// calling add method of ArrayList class
	}
	
	/**
	 * Deletes (i.e., removes) the name in element number "index" from the list.
	 * @param index the position in the list of the name to be deleted.
	 */
	public void delete(int index)
	{
		list.remove(index) ;	// calling remove method of ArrayList class
	}

	
	/**
	 * Converts the list into a multi-line String.
	 * @return a String containing all the names on the list, one per line.
	 */ 
	public String toString()
	{
		String out = "\n" ;	   // initialize string to be returned
		for (int i = 0 ; i < list.size() ; i++)
		{
			out = out + list.get(i) + "\n" ;
		}
		return out ;
	}
	
	/**
	 * Searches for a specific name on the list.
	 * @param name the name to search for
	 * @return the index (i.e., "position") of the name on the list, or -1 if
	 * the name is not on the list.
	 */
	public int search(String name)
	{
		
		// paste (or write) body of search method here
		// for each number on the list...
		for (int index = 0 ; index < list.size() ; index++)
		{
			String current = list.get(index) ;	// get next number
			if (current.equals(index))		   // found it!
			{
				return index ;					   // return position
			}
		}
		// here if target is not on list...return -1
		return -1 ;						
			
		//return -999 ;  // temporary return statement so class will compile
	}
	
	/**
	 * Inserts a name in its proper position in a sorted (i.e., "ordered") list.
	 * @param name the name to be inserted
	 * Precondition: the list must be sorted in ascending order!
	 */
	public void insert(String name)
	{
		// write method body here
		
			
		
	}
	
			  
}  // end of NameList class definition

public class NameListTester
{
	public static void main(String [] args) throws IOException
	{
		Scanner infile = new Scanner( new File("sorted.txt") ) ;
		
		NameList theList = new NameList() ;
		
		String name ;
		
		// read the data file until eof and store in theList
		
		while ( infile.hasNext() )				// while not eof...
		{
			name = infile.nextLine() ;
			theList.append(name) ;
		}
		
		System.out.println( "The original list:\n" + theList.toString() ) ;
		
		// let user enter some names to be removed from the list
		
		Scanner scan = new Scanner(System.in) ;
		
		name = JOptionPane.showInputDialog(
			          "Enter a name to be removed (or Cancel to quit)") ;
		
		
                while ( name != null )
		{
			
			// Enter code here to search theList for the name entered.			
			// If the name was found, remove it from the list; otherwise print
			// an appropriate message.
			String target = name;
                    int position = theList.search(target) ;
                        if ( position >= 0 ) 		// if found...
			{             
				System.out.println( target + " found in element " + position ) ;
			}
			else						// not found
			{
				System.out.println( target + " is not on the list" ) ;
			}
			
			
			
			// DO NOT MODIFY OR DELETE THE NEXT TWO LINES
			System.out.println("\nThe updated list:\n" + theList) ;
			name = JOptionPane.showInputDialog(
			          "Enter next name to be removed (or Cancel to quit)") ;
		}
		
		// let user enter some names to be inserted into the list
		// DO NOT MODIFY THIS CODE
		
		name = JOptionPane.showInputDialog(
			          "Enter a name to be inserted (or Cancel to quit)") ;

		while ( name != null )
		{
			theList.insert(name) ;
			System.out.println("\nThe updated list:\n" + theList) ;
			name = JOptionPane.showInputDialog(
			          "Enter next name to insert (or Cancel to quit)") ;
		}
	}
}	