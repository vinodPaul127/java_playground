import java.util.*;
import java.lang.*;
import java.io.*;
class GrandFather{
    protected String brush = "Tooth Brush";
    public void Land() {
        System.out.println("My Land is for me and my children");
    }
}
class Father extends GrandFather{
    private String Cloth = "Underwear";
 
    public void house(){
        System.out.println("My house is for me and my kid");
        
    }
   
}
class Son extends Father{
    public void bike(){
        System.out.println("My bike is for onle me");
        }
    public static void main(String[] args){
       
        
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	 Son sobj = new Son();
    sobj.bike();
    sobj.Land();
    sobj.house();
    
	}
}
