import javax.swing.JOptionPane;

public class Methods 
{
    public static void displayString(String message)
    {
        JOptionPane.showMessageDialog(null, message);
    } // end displayString method
    
    public static char getChoice()
    {
       char result = ' ';
       String menu = "[1] " + "Create an animal.\n";
       menu       += "[2] " + "Create a dog.\n";
       menu       += "[3] " + "Create a cat.\n";
       menu       += "[4] " + "Display all animals.\n";
       menu       += "[5] " + "Quit\n";
       
       result = (getString(menu)).charAt(0);
       
       return result;
    } // end getChoice method
 
    public static String getString(String message)
    {
        String result = " ";
        
        result = JOptionPane.showInputDialog(message);
        
        return result;
    } // end getString method
} // end Methods class
