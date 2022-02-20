import java.util.Scanner;

public class Contracena
{
   public static void main(String[] args)
   {
      int passwordLength=8, upChars=0, lowChars=0;
      int digits=0;
      char ch;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Entra la contraceña: ");
      String password = s.nextLine();
      
      int total = password.length();
      if(total<passwordLength)
      {
         System.out.println("\nla contraceña debe terner mas de 8 caracteres!");
         return;
      }
      else
      {
         for(int i=0; i<total; i++)
         {
            ch = password.charAt(i);
            if(Character.isUpperCase(ch))
                upChars = 2;
            else if(Character.isLowerCase(ch))
               lowChars = 3;
            else if(Character.isDigit(ch))
               digits = 3;
           
         }
      }
      if(upChars==2 && lowChars==3 && digits==3)
         System.out.println("\nla contraceña es fuerte.");
      else
         System.out.println("\nLacontraceña es debil.");
   }
}