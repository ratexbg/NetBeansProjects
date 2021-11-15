
import javax.swing.JOptionPane;


public class MovieTest {
    
    public static void main(String[] args) 
    { 
       Movie one = new Movie();
        one.title = "Parasite";
        one.year = 1999;
        one.director = "Jong-ho";
        
        Movie two = new Movie();
        two.title = JOptionPane.showInputDialog("Please enter movie TITLE");
        String oscarYear = JOptionPane.showInputDialog("Please enter movie YEAR");
        two.year = Integer.parseInt(oscarYear);
        
        
        Movie three = new Movie();
        
        if (args.length < 2) {
            System.out.println("Not enough arguments");
        }
        else {
            three.title = args[0];
            three.year = Integer.parseInt(args[1]);
            
//            System.out.println("Oscar movie winner 3 is " + three.title
//                    + " in year " + three.year);
        }
        
        Movie four = new Movie();
        four.title = "Whatever";
        four.year = 2020;
        JOptionPane.showMessageDialog(null, "Oscar movie winner 4 is " + four.title
                + " in year " + four.year);
        
        
        
        

        
        System.out.println("Oscar movie winner 1 is: "+ one.title + " in year " + one.year + " by director: " + one.director);
        System.out.println("Oscar movie winner 2 is " + two.title  + " in year " + two.year);
         System.out.println("Oscar movie winner 3 is " + three.title + " in year " + three.year);
       } 
    
}
 