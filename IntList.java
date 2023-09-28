// ***************************************************************
// FILE: IntList.java
//
// Purpose: Defines a class that represents a list of integers
//
// ***************************************************************

public class IntList
{
	private IntNode front; //first node in list
	private IntNode rear;  //last node in list

	//-----------------------------------------
	// Constructor. Initially list is empty.
	//-----------------------------------------
	public IntList()
	{
		front = null;
		rear = null;
	}

	//-----------------------------------------
	// Adds given integer to front of list.
	//-----------------------------------------
	public void addToFront(int val)
	{
		if(front == null)
		{
			IntNode newNode = new IntNode(val, null);
			front = newNode;
			rear = newNode;
		}
		else
		{
			front = new IntNode(val, front);
		}
	}

	//-----------------------------------------
	// Adds given integer to end of list.
	//-----------------------------------------
	public void addToEnd(int val)
	{
		IntNode newNode = new IntNode(val,null);

		//if list is empty, this will be the only node in it
		if (front == null)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			//add new node to the rear
			rear.next = newNode;
			rear = newNode;
		}
	}

	//-----------------------------------------
	// Removes the first node from the list.
	// If the list is empty, does nothing.
	//-----------------------------------------
	public void removeFirst()
	{
		if (front != null)
			front = front.next;
	}

	//------------------------------------------------
	// Prints the list elements from first to last.
	//------------------------------------------------
	public void print()
	{
		System.out.println("-----------------------");
		System.out.print("List elements: ");

		IntNode temp = front;

		while (temp != null)
		{
			System.out.print(temp.val + " ");
			temp = temp.next;
		}

		System.out.println("\n-----------------------\n");
	}
	
	//------------------------------------------------
	// returns a String containing the print value of the list
	//------------------------------------------------
	public String toString()
	{
		String output = "\nList: ";

		IntNode temp = front;

		while (temp != null)
		{
			output += temp.val + " ";
			temp = temp.next;
		}

		return output;
	}
	
	//------------------------------------------------
	// Count the list elements from first to last.
	//------------------------------------------------
	public int length()
	{
		int count = 0;

		IntNode temp = front;

		while (temp != null)
		{
			count++;
			temp = temp.next;
		}

		return count;
	}

	//------------------------------------------------
	// Remove the last item in the list of elements
	//------------------------------------------------
	public void removeLast()
	{

		if(front == null)
		{
			return;
		}

		if(front.next == null)
		{
			front = null;
			rear = null;
			return;
		}
		
		IntNode parent = front;
		IntNode child = parent.next;

		while (child.next != null)
		{
			parent = parent.next;
			child = parent.next;
		}

		rear = parent;
		parent.next = null;
	}

	//----------------------------------------------------------------
	// Replace an old value with a new value in the list of elements
	//----------------------------------------------------------------
	public void replace(int oldVal, int newVal)
	{
		IntNode temp = front;

		while (temp != null)
		{
			if(temp.val == oldVal)
				temp.val = newVal;
				
			temp = temp.next;
		}
	}

	//*************************************************************
	// An inner class that represents a node in the integer list.
	// The public variables are accessed by the IntList class.
	//*************************************************************
	private class IntNode
	{
		public int val; //value stored in node
		public IntNode next; //link to next node in list

		//------------------------------------------------------------------
		// Constructor; sets up the node given a value and IntNode reference
		//------------------------------------------------------------------
		public IntNode(int val, IntNode next)
		{
			this.val = val;
			this.next = next;
		}
	}
}
