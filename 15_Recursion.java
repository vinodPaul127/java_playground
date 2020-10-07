{
	
	   public static void main(String [] args)
	   {
	       int sum = add(100);
	       System.out.println(sum);
	   }
	       public static int add(int i){
	           if (i>0) {
	               return i + add(i-1);
	           }else{
	               return 0;
	           }
	       }
}
