import java.util.Scanner;
class Myclass{
   /**
 * @param args
 */
public static void main( String args[] )
{
        System.out.println("Enter number");
        Scanner a= new Scanner(System.in);
        String S= "number is even";
        int A= a.nextInt();
        if(A%2==0)
          {
            System.out.print(S);
        }
        else{
            System.out.println("odd");
        }
     }

}
