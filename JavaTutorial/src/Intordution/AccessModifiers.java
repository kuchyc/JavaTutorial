package Intordution;


//access modifiers put restrictions on how parts of you code can be access
public class AccessModifiers {
	
	
	public static void main(String[] args) {
		
	}
	// this method can be accessed anywhere in the program for as long as there is an instance of this class to call it from
	public void doSomethingPublic()
	{
		
	}
	//private visibility means that this method can't be accessed anywhere other than in this class.
	private void doSomethingPrivate()
	{
		
	}
	
	//protected visibility means that this method can only be accessed  inside of this package 
	//and from subclasses of this class. WILL make more sense when working on inheritance and packages.
	protected void doSometingProtected()
	{
		
	}
	
	// default visibility means that this method can only be accessed inside of this package. 
	void doSomething()
	{
	
	}
	
	//private is the most restrictive
	//default
	//protected
	//public
	
	//You can also apply these modifiers to variables, eg
	
	//private int x,
	//public int y;
	
	

}
