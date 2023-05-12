/** 
 * Class that represents a laptop computer 
 * @author Koffman & Wolfgang
 * 
 * @version 08/31/2009
 */

public class Laptop extends Computer {
 
  /**
   * A constant String representing the default manfucturer
   */ 
  private static final String DEFAULT_LT_MAN = "MyBrand";
 
  /**
   * A double value representing the size of the screen in inches
   */  
  private double screenSize;
  
 /**
  * A double value representing the weight in pounds
  */  
  private double weight;

  /** 
   * Initializes a LapTop object with all properties specified.
   * 
   * @param man The computer manufacturer
   * @param proc The processor type
   * @param ram The RAM size
   * @param disk The disk size
   * @param screen The screen size
   * @param wei The weight
   *
   */
  public Laptop(String man, String proc, int ram, int disk,double screen, 
                double wei) {
    super(man,proc,ram,disk);
    this.screenSize = screen;
    this.weight = wei;
  }

  /** 
   * Initializes a LapTop object with 5 properties specified. 
   * 
   * @param proc The processor type
   * @param ram The RAM size
   * @param disk The disk size
   * @param screen The screen size
   * @param wei The weight
   */
  public Laptop(String proc, int ram, int disk,double screen, double wei) {
    this(DEFAULT_LT_MAN, proc, ram, disk, screen, wei);
  }

  /**
   * Accessor method to return the screenSize
   * 
   * @return a double that represents the screenSize in inches
   */ 
  public double getScreenSize() {
    return this.screenSize;
  }
  /**
   * Accessor method to return the weight
   * 
   * @return a double that represents the weight in pounds
   */ 
  public double getWeight() {
    return this.weight;
  }
  
  /**
   * Mutator method to set the screenSize
   * 
   * @param newSize a double that represents the new screenSize in inches
   */ 
  public void setScreenSize(double newSize) {
    this.screenSize = newSize;
  }
  /**
   * Mutator method to set the weight
   * 
   * @param newWeight a double that represents the new weight in pounds
   */ 
  public void setWeight(double newWeight) {
    this.weight = newWeight;
  }
  
  /**
   * Overloaded mutator method to set the weight
   * 
   * @param newWeight a String that represents the new weight in pounds
   */ 
  public void setWeight(String newWeight) {
    this.weight = Double.parseDouble(newWeight);
  }
  /**
   * An overriden method that returns the a description of the laptop
   * 
   * @return A String that describes the laptop
   */ 
  public String toString() {

     /*String result = "Manufacturer: " + this.manufacturer +
        "\nCPU: " + this.processor +
        "\nRAM: " + this.ramSize + " megabytes" +
        "\nDisk: " +this.diskSize + " gigabytes" +
        "\nScreen size: " + this.screenSize + " inches" +
        "\nWeight: " + this.weight + " pounds";*/
    
     /*String result = "Manufacturer: " + getManufacturer() +
        "\nCPU: " + getProcessor() +
        "\nRAM: " + getRamSize() + " megabytes" +
        "\nDisk: " + getDiskSize() + " gigabytes" +
        "\nScreen size: " + this.screenSize + " inches" +
        "\nWeight: " + this.weight + " pounds";*/
     
    
      String result = super.toString() +
        "\nScreen size: " + this.screenSize + " inches" +
        "\nWeight: " + this.weight + " pounds";
     
    return result;
  }  

}

    