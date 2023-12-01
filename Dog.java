public class Dog extends Animals
{
   // Data Fields
    private String name; 
    private String breed;
    private double cost;
     
    public Dog() 
    {
        super();
        makeADog();
        Methods.displayString(toString());
    } // end constructor
    
    public String getName() 
    {
        return name;
    } // end accessor method

    public void setName(String name) 
    {
        this.name = name;
    } // end mutator method

    public String getBreed()
    {
        return breed;
    } // end accessor method

    public void setBreed(String breed) 
    {
        this.breed = breed;
    } // end mutator method

    public double getCost() 
    {
        return cost;
    } // end accessor method

    public void setCost(double cost)
    {
        this.cost = cost;
    } // end mutator method
    
    public String toString()
    {
        String mess = "";
        
                mess  = "My name is " + getName() + "\n";
                mess += "I am an animal and my current is " + String.format("%.1f",getWeight()) + "lbs\n";
                mess += "My breed is " + getBreed() + "\n";
                mess += "I am priced at $" + String.format("%.2f", getCost()) + "\n";
                iDoThis();
        return mess;
    } // end toString method
    
    @Override
    public void iDoThis()
    {
       String mess = "Dog sound: BARK BARK BARK! OO fire hydrant :D";
       
       Methods.displayString(mess);
    } // end iDoThis method
    
    public void makeADog()
    {
        // Variables
        boolean badInput = true;
        String mess = "";
         do
        {
            try
            {
                setName(Methods.getString("Enter the name of the dog: "));
                setBreed(Methods.getString("Enter " + getName() + "'s" + " breed: "));
                setCost(Double.parseDouble(Methods.getString("Enter the cost: ")));
                
                // Validation
                while(getCost() < 1)
                {
                    mess = "Invaild amount for the cost. Try again";
                    Methods.displayString(mess);
                    setCost(Double.parseDouble(Methods.getString("Enter the cost: "))); 
                    badInput = true;
                }
                
                badInput = false; 
            }
            catch(java.util.InputMismatchException e)
            {
               mess = "Invaild entry. Try again";
               Methods.displayString(mess);
               badInput = true;
            }
        }while(badInput);
    } // end createDog method
} // end Dog class
