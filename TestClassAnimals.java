import java.util.ArrayList;

public class TestClassAnimals 
{
    public static void main(String[] args) 
    {
        // Variable and Object
        char choice = ' ';
        ArrayList <Animals> myAnimal = new ArrayList<Animals>();
        
        do
        {
            choice = Methods.getChoice();
            switch(choice)
            {
                case '1': // add an animal
                    Methods.displayString("This is an abstract class, so you cannot create an animal.Try again!");
                    break;
                
                case '2': // Add a dog
                    myAnimal.add(new Dog());
                    break;
                    
                case '3': // Add a cat
                    myAnimal.add(new Cat());
                    break;
                    
                case '4': // Display all animals
                    Animals.displayAllAnimals(myAnimal);
                    // Animals.displayIDoThis(Animals)
                    break;
                    
                case '5': // Quit program
                    Methods.displayString("Thank you for using my program!\nHave a great day!");
                    break;
                    
                default: // Invaild input
                    Methods.displayString("Invaild selection. Try again");
                    break;      
            } // end switch
        }while(choice != '5');
    }// end main
} // end TestClassAnimals class
