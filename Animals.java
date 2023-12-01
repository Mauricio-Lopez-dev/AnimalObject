import java.util.ArrayList;

public abstract class Animals 
{
    // Data Fields
    private double weight;
    
    // Abstract method
    public abstract void iDoThis();
    
    public Animals()
    {
        makeAnAnimal();
       
    } // end default constructor
    
    public double getWeight()
    {
        return weight;
    } // end accessor method
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    } // end mutator method
    
    public String toString()
    {
       String mess = "";
       
       return mess;
    } // end toString method
    
    public static void displayAllAnimals(ArrayList <Animals> x) // FIX ME - MISSING LINES WHEN COMPILING
    {
        String mess = "";
        
        for(int i = 0; i < x.size(); i++)
        {
            mess += x.get(i);
            Methods.displayString(mess);
        }
    } // end displayAllAnimals method
    
    public static void displayIDoThis(ArrayList <Animals> x) // FIX ME - UNCOMPLETE ON IDOTHIS METHODS
    {
         String mess = "";
        
        for(int i = 0; i < x.size(); i++)
        {
            mess += x.get(i);
            Methods.displayString(mess);
        }
    } // end displayIDoThis method
    
    public void makeAnAnimal()
    {
        // Variables
        boolean badInput = true;
        String mess = "";
        
        do
        {
            try
            {
                setWeight(Integer.parseInt(Methods.getString("Enter the weight: ")));
                while(getWeight() < 1.0)
                {
                    mess = "Invaild amount for weight. Try again";
                    Methods.displayString(mess);
                    setWeight(Integer.parseInt(Methods.getString("Enter the weight: ")));
                    badInput = true;
                }
                badInput = false;
            }
            catch(java.util.InputMismatchException e)
            {
                // Output
               mess = "Invaild entry. Try again";
               Methods.displayString(mess);
               badInput = true;
            }
        }while(badInput);
    } // end inputWeight method
} // end Animal class
