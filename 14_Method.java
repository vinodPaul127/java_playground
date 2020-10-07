   public static void mymethod(String name,int age,String gender,String city,String phoneNumber)
	   {
	       System.out.println("Hi " +name+" "+age + "  is your age"+"  "+ city + "   you are from this city"+"  "+phoneNumber);
	   }
	   
	   public static void mymethod(String name,String country)
	   {
	       System.out.println(name +" is from "+country);
	   }
	    
    	public static void main (String[] args) throws java.lang.Exception
    	{
    	System.out.println("meher");
    	mymethod("vinod paul", 22,"male","sameswaram","784390789890879");
    	mymethod("mehr",98,"male","kadiyam","0987432888998989898");
    	mymethod("meher chaitanya bandaru","india");
    	
        }
