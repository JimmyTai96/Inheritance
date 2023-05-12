public class ComputerApplication{
  
  public static void main(String[] args){
    int i = 5;
    double d = 6.5;
    System.out.println("Initially:      i="+i + " & d= "+ d);
    
    d=i;//widening
    System.out.println("Widening of i:  i="+i + " & d= "+ d);
    d=6.5;
    //i=d;//narrowing
    i=(int) d;//narrowing (explicit)
    System.out.println("Narrowing of d: i="+i + " & d= "+ d);    
    
    System.out.println("***************************");
    Computer comp = new Computer("Dell Systems","Pentium II",500,2);
    Laptop lap = new Laptop("HP/Compaq","Pentium Duo Core 2",2000,150,21.0,6.0);
    System.out.println("comp=" + comp);
    System.out.println("***************************");
    System.out.println("lap=" + lap);
    System.out.println("***************************");
    
    //(1)
    comp=lap;//upcasting    
    System.out.println(comp.getRamSize());
    System.out.println(comp.toString());
   // System.out.println(comp.getScreenSize());
    System.out.println(((Laptop)comp).getScreenSize());
    System.out.println("comp=" + comp);
    System.out.println("***************************");
    
    //(2)
    //lap= comp;//illegal downcasting
    comp=new Laptop("HP/Compaq","Quad Core 4",1800,150,23.0,8.0);;
    lap=(Laptop) comp;
    System.out.println(lap.getScreenSize());   
    System.out.println("lap=" + lap);
    System.out.println("***************************");
    
    //(3)
    System.out.println(comp instanceof Computer);
    System.out.println(comp instanceof Laptop);
    System.out.println(lap instanceof Computer);
    System.out.println(lap instanceof Laptop);
    if(comp instanceof Laptop){
      lap=(Laptop) comp;//downcasting (explicit)
    }
    else{
      System.out.println("Can't cast");
    } 
  }
}