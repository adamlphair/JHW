package receiptrevisited;
import java.io.PrintWriter;
/**
 *
 * @author adamphair
 */
public class ReceiptRevisited {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        PrintWriter fileout = new PrintWriter("receipt.txt");
        
       fileout.println("+------------------------+");
       fileout.println("|                        |");
       fileout.println("|      CORNER STORE      |");
       fileout.println("|                        |");
       fileout.println("| 2018-05-04    12:34PM  |");
       fileout.println("|                        |");
       fileout.println("| Gallons:      12.464   |");
       fileout.println("| Price/gallon: $2.66    |");
       fileout.println("|                        |");
       fileout.println("| Fuel total    $33.15   |");
       fileout.println("|                        |");
       fileout.println("+------------------------+");
       fileout.close();
    }
    
}
