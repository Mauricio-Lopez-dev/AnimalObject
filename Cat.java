public class Cat extends Animals
{
    // Data Fields
    private int noLives;
    private boolean neutered;
    private String name; 

    public Cat()
    {
        super();
        makeACat();
        Methods.displayString(toString());
    } // end default constructor
    
    public int getNoLives() 
    {
        return noLives;
    } // end constructor

    public void setNoLives(int noLives)
    {
        this.noLives = noLives;
    } // end mutator method

    public boolean getIsNeutered() 
    {
        return neutered;
    } // end accessor method

    public void setIsNeutered(boolean neutered) 
    {
        this.neutered = neutered;
    } // end mutator method

    public String getName()
    {
        return name;
    } // end accessor method
    
    public void setName(String name)
    {
        this.name = name;
    } // end mutator method
    
    @Override
    public String toString()
    {
        String mess = "";
        
         mess += "My name is " + getName() + "\n";
         mess += "I am an animal and my current is " + String.format("%.1f",getWeight()) + "lbs\n";
            if(getIsNeutered())
            {
               mess += "Since I am neutered. What is life?\n";
            }
            else
            {
               mess += "I am not neutered, soooooo come here kitty kitty!!\n";
            }
            
            if(getNoLives() > 1)
            {
                mess += "I have " + getNoLives() + " lives. I live longer than humans ;D\n";
            }
            else
            {
               mess += "I guess I have " + getNoLives() + " life.  >:O"; 
            }
           iDoThis();
           
        return mess;
    } // end toString method
    
    @Override
    public void iDoThis()
    {
        String result = "Cat sound: MEOW MEOW 'cough cough' hairball!";
        
        Methods.displayString(result);
    } // end iDoThis method
    
   public void makeACat()
   {
       // Variables
       boolean badInput = true;
       String mess = "";
       do
       {
           try
           {
               setName(Methods.getString("Enter the name of the cat: "));
               setIsNeutered(Boolean.parseBoolean(Methods.getString("Is the cat neutered? Enter true or false")));
               setNoLives(Integer.parseInt(Methods.getString("Enter the amount of lives " + getName() + " has:")));
               
               // Validation
               while(getNoLives() < 1 || getNoLives() > 9)
               {
               mess = "Invaild amount of lives. It must be between 1 - 9. Try again";
               Methods.displayString(mess);
               setNoLives(Integer.parseInt(Methods.getString("Enter the amount of lives " + getName() + " has:")));
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
       } while(badInput);
   } // end createCat method
} // end Cat class
