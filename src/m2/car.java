package m2;

public class car {
	
	public static void main(String[] args)
	{
		brand car1 = new brand(20,"Nissan");
		System.out.println(car1.name + " is not bad mark which is " + car1.year + " years old");
		
		brand car2 = new brand();
		System.out.println(car2.year+" years");
		
		car2.say("Tesla");
		car2.say("But Repco");
		
	}
}
      class brand
      {
    	  public String name= "Default :";
    	  public int year = 5;
    	  
    	  public brand(int gd, String nam)
    	  {   year = gd;
    		  name = nam;
    	  }
    	  public void say(String n)
    	  {   if (n.equals("But Repco"))
    		  System.out.println(n+ " is not bad car");
    	  else
    		  System.out.println(n+ " is bad car");
    	  }
    	  public brand() {}
      }