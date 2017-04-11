import java.util.ArrayList ;
import java.util.Random ;

/**
 * A class to provide practice using ArrayLists
 */
class NumberList
{
	// instance var's
	private ArrayList<Integer> aList ;		// a list of Integer objects
        private ArrayList<Integer> bigList;
        
	/**
	 * Creates a NumberList object.
	 */	
	public NumberList()
	{
		aList = new ArrayList<Integer>() ;	// creates an empty list
	        bigList = new ArrayList<Integer>();
        }
	
	/**
	 * Adds a number to the list.
	 * @param number the number to be added to the list
	 */
	public void add(int number)
	{
		aList.add(number) ;		// calls add method of ArrayList class
	}
	
	/**
	 * Prints the numbers stored in aList.
	 */
	public void printList()
	{
		System.out.println( "The numbers on the list: " ) ;
		
		// for each number on the list, from 1st to last...
		for (int i = 0 ; i < aList.size() ; i++)
		{
			int number = aList.get(i) ;				// get the number
			System.out.print(number + "  ") ;		// print it
		}
		System.out.println("\n") ;
	}
	
	/**
	 * Prints the numbers stored in aList, in reverse order.
	 */
	public void printReversed()
	{
		System.out.println( "The numbers on the list, in reverse order: " ) ;
		// write your code here
		
		for (int i = aList.size() - 1; i >= 0 ; i--)
                {
                    int number = aList.get(i) ;				// get the number
	            System.out.print(number + "  ") ;
                }
                System.out.println("\n") ;
	}
	
	/**
	 * Prints every other number stored in aList, starting with the first one.
	 */
	public void printEveryOther()
	{
		System.out.println( "Starting with the first, every other number: " ) ;
		// write your code here
		for (int i = 0; i < aList.size() ; i++)
                {
                    int number = aList.get(i);				// get the number
	            System.out.print(number + "  ") ;
                }
                System.out.println("\n") ;	
	}

	/**
	 * Prints all the even-numbered ints stored in aList.
	 */
	public void printEvens()
	{
		System.out.println( "The even numbers on the list: " ) ;
		// write your code here
		for (int i = 0; i < aList.size() ; i++)
                {
                    int number = aList.get(i);				// get the number
           
                    {
                     System.out.print(number + "  ") ;   
                    }
                }
                System.out.println("\n") ;
		
	}

	/**
	 * Copies all ints that are 50 or greater from aList to bigList.
	 */
	public void splitList()
	{
		// write your code here
            System.out.println( "The big list: " ) ;
		for (int i = 0; i < aList.size() ; i++)
                {    
                    int number = aList.get(i);
                    if (number >= 50)
                    {
                        bigList.add(i);
                        System.out.print(number + "  ") ;   
                    }
                }
                 System.out.println("\n") ;
	}
       
        public void bigList()
        {
            for (i = 0; i >= )
        }
}

public class NumberListTester
{
	public static void main (String [] args)
	{
		Random r = new Random() ;
		NumberList list = new NumberList() ;
		
		// populate the list with 10 random 2-digit ints (10 to 99)
		for (int i = 1 ; i <= 10 ; i++)
		{
			int next = r.nextInt(90) + 10 ;
			// call the "add" method of the NumberList class
			list.add( next ) ;				
		}

		// print the aList
		list.printList() ;
		
                //print the reverse list 
                list.printReversed();
                
                //print every other
                list.printEveryOther();
                
                //print events
                list.printEvens();
                
                //print the big list
                list.splitList();
	}
}